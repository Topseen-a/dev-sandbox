import java.util.Scanner;
public class AccountTest{
    public static void main(String[] args){

//        Scanner input = new Scanner(System.in);
//        Account myAccount = new Account();
//
//        System.out.print("Enter your name: ");
//        String theName = input.nextLine();
//
//        myAccount.setName(theName);
//
//        System.out.println("Name in the Object is " + myAccount.getName());

//        Account accountOne = new Account("Topseen");
//        Account accountTwo = new Account("Didi");
//
//        System.out.println("This is the first account name " + accountOne.getName());
//        System.out.println("This is the first account name " + accountTwo.getName());

        Account accountOne = new Account("Temitope", 250.00);
        Account accountTwo = new Account("Dimimu", 500.00);

        System.out.printf("%s balance is %.2f%n", accountOne.getName(), accountOne.getBalance());
        System.out.printf("%s balance is %.2f%n", accountTwo.getName(), accountTwo.getBalance());
        System.out.println();

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        System.out.println();

        accountOne.deposit(depositAmount);
        accountTwo.deposit(depositAmount);

        System.out.printf("%s New balance is %.2f%n", accountOne.getName(), accountOne.getBalance());
        System.out.printf("%s New balance is %.2f%n", accountTwo.getName(), accountTwo.getBalance());
    }
    
}
