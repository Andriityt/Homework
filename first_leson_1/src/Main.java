import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the radius : ");
        Scanner scan = new Scanner (System.in);
        double number = scan.nextDouble();
        double area = number * number * 3.14;
        double perimeter = 2 * 3.14 * number;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}