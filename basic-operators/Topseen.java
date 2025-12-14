import java.util.Scanner;
    public class Topseen {
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer:");
        int numberOne = input.nextInt();

        System.out.print("Enter second integer:");
        int numberTwo = input.nextInt();

        System.out.print("Enter third integer:");
        int numberThree = input.nextInt();

        int total = numberOne + numberTwo + numberThree;
        double average = total / 3;
    
        System.out.println("Total score:" + total);
        System.out.println("Average score:" + average);
    }
}
