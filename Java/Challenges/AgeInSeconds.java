import java.util.*;
//import java.time.*; <---- For future implementation
public class AgeInSeconds{
  public static Scanner in = new Scanner(System.in);
  public static int monthtoDays(int month, int year){
    int days = 0;
    if (month == 2){ //February = +31
      days = 31;
    }
    else if (month == 3){//March = 31+28
      days = 59;
    }
    else if (month == 4){//April = 31+28+31
      days = 90;
    }
    else if (month == 5){//May = 31+28+31+30
      days = 120;
    }
    else if (month == 6){//June = 31+28+31+30+31
      days = 151;
    }
    else if (month == 7){//July = 31+28+31+30+31+30
      days = 181;
    }
    else if (month == 8){//August = 31+28+31+30+31+30+31
      days = 212;
    }
    else if (month == 9){//September = 31+28+31+30+31+30+31+31
      days = 243;
    }
    else if (month == 10){//October = 31+28+31+30+31+30+31+31+30
      days = 273;
    }
    else if (month == 11){//November = 31+28+31+30+31+30+31+31+30+31
      days = 304;
    }
    else if (month == 12){//December = 31+28+31+30+31+30+31+31+30+31+30
      days = 334;
    }
    if((year % 4 == 0) && !(month == 1 || month == 2)){
      days += 1;
    }
    return days;
  }
  public static int convertToSeconds(int year, int month, int monthDays, int day){
    int yearsAlive = 2017 - year;
    if (month >= 9){
      if (month == 9 && day < 8){
        yearsAlive -= 1;
      }
      if (month > 9){
        yearsAlive -= 1;
      }
    }
    int numberOfLeapYears = yearsAlive / 4;
    int yearsToDays = yearsAlive * 365;
    int daysAlive = 8 - day;
    daysAlive = daysAlive + numberOfLeapYears + yearsToDays + monthDays;
    int seconds = daysAlive * 86400;
    return seconds;
  }
  public static void main (String[] args){
    System.out.println("What year were you born?");
    int year = in.nextInt();
    System.out.println("What number month were you born in?");
    int monthNumber = in.nextInt();
    int monthDays = monthtoDays(monthNumber, 2017);
    System.out.println("What day of the month were you born on?");
    int day = in.nextInt();
    int seconds = convertToSeconds(year, monthNumber, monthDays, day);
    System.out.println("You have been alive approximately: " + seconds + " seconds.");
  }
}
