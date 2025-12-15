public class Tabular{
    public static void main(String[] args){

    System.out.println("N\tN2\tN3\tN4");

        for (int count = 1; count <= 5; count++){

            int powerTwo = count * count;
            int powerThree = count * count * count;
            int powerFour = count * count * count * count;
   
        System.out.println(count + "\t" + powerTwo + "\t" + powerThree + "\t" + powerFour);
        }
    }
}
