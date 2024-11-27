package date;

import org.junit.Test;

import java.util.StringTokenizer;

public class StringManipulationTest {
    @Test
    public void stripTest()  {
        //Parse date to return date: 2024-10-15
        //Parse time to return time: 15:30:10.000
        String dateTimeStr = "2024-10-15T15:30:10.000";
        String[] split = dateTimeStr.split("T");
        System.out.println("Using Split ");
        System.out.println("   > String 1: " + split[0]);
        System.out.println("   > String 2: " + split[1]);

        System.out.println("Using StringTokenizer ");
        StringTokenizer splitStr = new StringTokenizer(dateTimeStr, "T");
        while (splitStr.hasMoreElements()) {
           var str = splitStr.nextToken();
           System.out.println("   > String: " + str);
        }
    }
    @Test
    public void replaceTest() {
        String s1="Thursday, November 28, 2024 selected";  //BS
        String s2="Thursday 28 November 2024";

        String filterStr = s1.replaceAll("," ,"");
        System.out.println("filterStr: " + filterStr);
        boolean found = filterStr.contains(s2);
        System.out.println("found: " + found);
    }
}
