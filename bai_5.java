import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("nhap thang can dem");
int month = scanner.nextInt();
switch (month) {
    case 2:
        System.out.println("28 or 29 day!");
        break;
    case 1:
        System.out.println("the month " + month + "has 31 day!");
        break;
    case 3:
        System.out.println("the month " + month + "has 31 day!");
        break;
    case 5:
        System.out.println("the month " + month + " has 31 day!");
        break;
    case 7:
        System.out.println("the month " + month + " has 31 day!");
        break;
    case 8:
        System.out.println("the month " + month + "has 31 day!");
        break;
    case 10:
        System.out.println("the month " + month + " has 31 day!");
        break;
    case 12:
        System.out.println("the month " + month + " has 31 day!");
        break;
    case 4:
        System.out.println("the month " + month + " has 30 day!");
        break;
    case 6:
        System.out.println("the month " + month + " has 30 day!");
        break;
    case 9:
        System.out.println("the month " + month + " has 30 day!");
        break;
    case 11:
        System.out.println("the month " + month + " has 30 day!");
        break;
        }
       }
     }