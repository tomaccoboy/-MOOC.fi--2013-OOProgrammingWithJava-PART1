import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int numOne = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int numTwo = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        if (numOne == numTwo) {
            System.out.println("The numbers are equal!");
            } else {
                System.out.println("Greater number: " + Math.max(numOne, numTwo));
        }
    }
}
