package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class CourseScheduleTest {

    private static final CourseSchedule COURSE_SCHEDULE = new CourseSchedule();

    @ParameterizedTest
    @CsvSource({"2,'[1,0]',true", "2,'[0,1]',true", "2,'[1,0],[0,1]',false"})
    void canFinish(int numCourses, @ConvertWith(CsvToArray.class) int[][] prerequisites, boolean expect) {
        Assertions.assertEquals(expect, COURSE_SCHEDULE.canFinish(numCourses, prerequisites));
    }
}
