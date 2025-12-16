import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a five digit integer: ");
    int digit = input.nextInt();

    while(true){
        if (digit >= 10000 && digit <= 99999){
            break;
        }
        else {
            System.out.print("Enter a five digit integer: ");
            digit = input.nextInt();
        }
    }
        int digitOne = (digit / 10000) % 10;
        int digitTwo = (digit / 1000) % 10;
        int digitThree = (digit / 100) % 10;
        int digitFour = (digit / 10) % 10;
        int digitFive = digit % 10;

        if (digitOne == digitFive && digitTwo == digitFour){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}
