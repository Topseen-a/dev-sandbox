import java.util.Scanner;
    public class LargestNumber{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number = 0;
        int largest = number;
        int secondLargest = number;

            for (int count = 1; count <= 10; count++){

                System.out.print("Enter a number: ");
                number = input.nextInt();
                
                if (number > largest){
                    largest = number;
                }
                else if (number > secondLargest && secondLargest != largest){
                    secondLargest = number;
                }
            }
            System.out.println("The largest is " + largest);
            System.out.println("The second largest is " + secondLargest);
        }
    }
