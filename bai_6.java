import java.util.Scanner;

public class bai_6 {
  public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      int year;
      year = scanner.nextInt();
      System.out.println("Enter a year");
      if(year % 4 == 0){
          if(year % 100 == 0){
              if(year % 400 == 0){
                  System.out.printf("%d is a leap year", year);
              }else {
                  System.out.printf("%d is not a leap year", year);
              }
              }else {
              System.out.printf("%d is a leap year",year);
              }
          }else{
          System.out.printf("is not a leap year", year);
        }
      }
    }
