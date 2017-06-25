import java.io.*

public class Leap-year.java {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int days;
        if ((year % 4) == 0 && (year %100) != 0 || (year % 400) == 0)
            days = 366;
        else
            days=365;
        System.out.println("количество дней в году: " + days);
    }
}   
