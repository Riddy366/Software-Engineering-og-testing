import java.util.Arrays;
import java.util.List;

public class LeapYear {

        public static boolean isLeapYear(int year) {

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year);
                return true;
            }
            else if (year % 400 == 0) {
                System.out.println(year);
                return true;
            } else {
                System.out.println(year);
                return false;
            }
        }

    }

