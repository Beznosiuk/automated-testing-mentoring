package com.framework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.framework.utils.DateUtil.isTodayHoliday;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MentoringApplicationTests {

    @Test
    void shouldVerifyHolidayAndNotHolidayDay() {
        assertThat(isTodayHoliday("SUNDAY")).isEqualTo("Today is holiday!");
        assertThat(isTodayHoliday("MONDAY")).isEqualTo("Today is not holiday!");
        assertThat(isTodayHoliday("TUESDAY")).isEqualTo("Today is not holiday!");
        assertThat(isTodayHoliday("WEDNESDAY")).isEqualTo("Today is not holiday!");
        assertThat(isTodayHoliday("THURSDAY")).isEqualTo("Today is not holiday!");
        assertThat(isTodayHoliday("FRIDAY")).isEqualTo("Today is not holiday!");
        assertThat(isTodayHoliday("SATURDAY")).isEqualTo("Today is holiday!");
    }

    @Test
    void shouldVerifyHolidayAndNotHolidayDayNeg() {
        assertThat(isTodayHoliday("Test")).isEqualTo("Today is holiday!");
    }
}
