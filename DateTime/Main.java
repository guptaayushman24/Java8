package DateTime;

import java.time.LocalDate;
import java.time.Month;

public class Main {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    System.out.println(now);

    LocalDate customDate = LocalDate.of(1990,2,7);
    System.out.println(customDate);

    int dayOfMonth = now.getDayOfMonth();
    Month month = now.getMonth();
    int year = now.getYear();

    System.out.println(dayOfMonth);
    System.out.println(month);
    System.out.println(year);

    LocalDate yesteday = now.minusDays(1);
    System.out.println(yesteday);

  }
  
}
