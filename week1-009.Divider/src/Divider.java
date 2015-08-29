import java.util.Scanner;
 
public class Divider {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Type a number:");
        int numberOne = Integer.parseInt(reader.nextLine());
         
        System.out.println("Type another number:");
        int numberTwo = Integer.parseInt(reader.nextLine());
         
        double result = 1.0 * numberOne / numberTwo;
        System.out.println("Division: " + numberOne + " / " + numberTwo + " = " + result);
    }
}