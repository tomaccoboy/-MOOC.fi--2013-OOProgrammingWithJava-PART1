import java.util.Scanner;
 
public class BiggerNumber {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Type a number:");
        int numOne = Integer.parseInt(reader.nextLine());
         
        System.out.println("Type another number:");
        int numTwo = Integer.parseInt(reader.nextLine());
         
        int bigNum = Math.max(numOne, numTwo);
        System.out.println("\nThe bigger number of the two numbers given was:" + bigNum);
    }
}