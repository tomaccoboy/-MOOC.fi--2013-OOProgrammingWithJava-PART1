import java.util.Scanner;
 
public class Adder {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
         
        System.out.println("Type another number:");
        int numberTwo = Integer.parseInt(reader.nextLine());
         
        int result = number + numberTwo;
        System.out.println("Sum of the numbers:" + result);
    }
}