import java.util.Arrays;
import java.util.List;

public class LeapYear {

        public static boolean isLeapYear(int year) {

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " - True");
                return true;
            }
            else if (year % 400 == 0) {
                System.out.println(year + " - True");
                return true;
            } else {
                System.out.println(year + " - False");
                return false;
            }
        }
        
        public static void main(String[] args) {
            List<Integer> data = Arrays.asList(1700, 1800, 1900, 2000, 2100);
            for (Integer d : data) {
                System.out.println(d.toString() + " : " + isLeapYear(d));
            }
        }

    }

