import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Time_DataTest {

    @Test
    void task1() {
//        String test = "22-12-2021 10:10";
        String test = "28-05-2002 17:30";

        T_Date t_date = new T_Date();
        Date date = t_date.build(test);
        String actual = date.toString();
//        String expected = "Wed Dec 22 10:10:00 MSK 2021"; // 1
        String expected = "Tue May 28 17:30:00 MSD 2002"; // 2


        Assert.assertEquals(expected, actual);
    }
}