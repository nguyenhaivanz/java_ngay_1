import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
System.out.println("cho phuong trinh ax + b = c");
Scanner scanner = new Scanner(System.in);

System.out.println("nhap so a");
double a = scanner.nextDouble();

System.out.println("nhap so b");
double b = scanner.nextDouble();

System.out.println("nhap so c");
double c = scanner.nextDouble();

if(a != 0 ){
    double answer = (c - b) / a;
    System.out.println(answer);
        }else{
          if(b == c){
              System.out.println("phuong trinh vo so nghiem");
          }else{
              System.out.println("phuong trinh vo nghiem");
          }
        }
    }
}
