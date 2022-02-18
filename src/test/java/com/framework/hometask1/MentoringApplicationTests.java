package com.framework.hometask1;

import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import static com.framework.hometask1.utils.DateUtil.isTodayHoliday;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(ReportPortalExtension.class)
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
    void testTest() {
        var nullPointerException =
                Assertions.assertThrows(NullPointerException.class, NullPointerMessageTest::createNullPointerException);
        System.out.println(nullPointerException.getMessage());
    }
}
