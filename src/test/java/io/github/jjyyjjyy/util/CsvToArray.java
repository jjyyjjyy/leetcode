package io.github.jjyyjjyy.util;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author jy
 */
public class CsvToArray extends SimpleArgumentConverter {

    public static final String ARRAY_SPLITTER_REGEX = "\\s*,\\s*";

    public static final String BRACKET_REGEX = "],\\s*";

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        String sourceString = source.toString();
        if (Objects.equals(targetType, int[].class)) {
            String[] strings = sourceString.split(ARRAY_SPLITTER_REGEX);
            return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
        }
        if (Objects.equals(targetType, int[][].class)) {
            String[] strings = sourceString.split(BRACKET_REGEX);
            return Arrays.stream(strings)
                .map(s -> s.replace("[", "").replace("]", ""))
                .map(s -> s.length() == 0 ? new int[0] : Arrays.stream(s.split(ARRAY_SPLITTER_REGEX)).mapToInt(Integer::valueOf).toArray())
                .toArray(int[][]::new);
        }
        if (Objects.equals(targetType, char[][].class)) {
            String[] strings = sourceString.split(BRACKET_REGEX);
            return Arrays.stream(strings)
                .map(s -> s.replace("[", "").replace("]", "").replaceAll(ARRAY_SPLITTER_REGEX, ""))
                .map(String::toCharArray)
                .toArray(char[][]::new);
        }
        if (Objects.equals(targetType, String[][].class)) {
            String[] strings = sourceString.split(BRACKET_REGEX);
            return Arrays.stream(strings)
                .map(s -> s.replace("[", "").replace("]", ""))
                .map(s -> s.split(ARRAY_SPLITTER_REGEX))
                .toArray(String[][]::new);
        }
        return sourceString.split(ARRAY_SPLITTER_REGEX);
    }
}
