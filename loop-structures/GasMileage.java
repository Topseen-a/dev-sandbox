import java.util.Scanner;
public class GasMileage{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int miles = 0;
    int gallons = 0;

        while (true) {
            System.out.print("Enter the miles driven or -1 to exit: ");
            int milesDriven = input.nextInt();

            if (milesDriven == -1){
                break;
            }
            else {
                System.out.print("Enter the gallons used: ");
                int gallonsUsed = input.nextInt();

                double trip = milesDriven / gallonsUsed;
                System.out.println("The miles per gallon for each trip is " + trip);

                miles += milesDriven;
                gallons += gallonsUsed;

                double combined = miles / gallons;
                System.out.println("The combined miles per gallons is " + combined);
            }
        }
    }
}
