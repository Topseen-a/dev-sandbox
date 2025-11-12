import java.util.Scanner;
    public class Test{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How old are you?");
        int age = input.nextInt();
        int ageNextYear = age + 1;
        
        System.out.println("How old will you be next year:" + ageNextYear);
    }
}
