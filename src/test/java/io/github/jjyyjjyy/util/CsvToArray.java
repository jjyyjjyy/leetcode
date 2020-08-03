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

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        String sourceString = source.toString();
        if (Objects.equals(targetType, int[].class)) {
            String[] strings = sourceString.split(ARRAY_SPLITTER_REGEX);
            return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
        }
        if (Objects.equals(targetType, int[][].class)) {
            String[] strings = sourceString.split("],\\s*");
            return Arrays.stream(strings)
                .map(s -> s.replace("[", "").replace("]", ""))
                .map(s -> Arrays.stream(s.split(ARRAY_SPLITTER_REGEX)).mapToInt(Integer::valueOf).toArray())
                .toArray(int[][]::new);
        }
        return sourceString;
    }
}
