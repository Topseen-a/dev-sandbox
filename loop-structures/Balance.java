import java.util.Scanner;
public class Balance{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number or -1 to exit: ");
            int account = input.nextInt();

            if (account == -1) {
                System.out.println("Exiting ");
                break;
                }
    
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();
    
            System.out.print("Enter items charged: ");
            int itemsCharged = input.nextInt();

            System.out.print("Enter credits applied: ");
            int creditApplied = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + itemsCharged - creditApplied;
            System.out.println("Your new balance is " + newBalance);

            if (newBalance > creditLimit){
                System.out.println("Credit Limit exceeded");
                }
            else {
                System.out.println("Credit Limit is okay");
                }





        }  


    }
}
