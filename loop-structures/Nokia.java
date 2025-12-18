import java.util.Scanner;
    public class Nokia{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            while (true){
                System.out.println("====Welcome to Nokia====");
                System.out.println("1. Phone book");
                System.out.println("2. Messages");
                System.out.println("3. Chat");
                System.out.println("4. Call register");
                System.out.println("0. Exit");

                System.out.print("Select an option: ");
                int choice = input.nextInt();

                if (choice == 0){
                    System.out.println("Exiting");
                    break;
                }
            
                switch (choice){
                    case 1: 
                        while (true){
                            System.out.println("1. Search");
                            System.out.println("2. Service Nos");
                            System.out.println("3. Add name");
                            System.out.println("4. Erase");
                            System.out.println("5. Options");
                            System.out.println("6. Speed dials");
                            System.out.println("0. Back");

                            System.out.print("Select an option: ");
                            choice = input.nextInt();

                            if (choice == 0){
                                    break;
                            }
                            
                            switch (choice){
                                case 1: System.out.println("Search");
                                    break;
                                case 2: System.out.println("Service Nos");
                                    break;
                                case 3: System.out.println("Add name");
                                    break;
                                case 4: System.out.println("Erase");
                                    break;
                                case 5: 
                                    while (true){
                                        System.out.println("Options");
                                        System.out.println("1. Type of view");
                                        System.out.println("2. Memory status");
                                        System.out.println("0. Back");

                                        System.out.print("Select an option: ");
                                        choice = input.nextInt();

                                        if (choice == 0){
                                            break;    
                                        }
                                        
                                        switch (choice){
                                                case 1: System.out.println("Type of view");
                                                    break;
                                                case 2: System.out.println("Memory status");
                                                    break;
                                            }
                                        }
                                    break;
                                case 6: System.out.println("Speed dials");
                                    break;
                                }
                            }
                            break;

                    case 2: 
                        while(true){                    
                            System.out.println("1. Write messages");
                            System.out.println("2. Inbox");
                            System.out.println("3. Outbox");
                            System.out.println("0. Back");

                            System.out.print("Select an option: ");
                            choice = input.nextInt();

                            if (choice == 0){
                                break;
                            }

                            switch (choice) {
                                case 1: System.out.println("Write messages");
                                    break;
                                case 2: System.out.println("Inbox");
                                    break;
                                case 3: System.out.println("Outbox");
                                    break;
                            }
                        }
                        break;

                    case 3: System.out.println("Chat");
                        break;
                    
                    case 4: 
                        while(true){
                            System.out.println("1. Missed calls");
                            System.out.println("2. Dialled numbers");
                            System.out.println("0. Back");

                            System.out.print("Select an option: ");
                            choice = input.nextInt();

                            if (choice == 0){
                                break;
                            }

                            switch (choice){
                                case 1: System.out.println("Missed calls");
                                    break;
                                case 2: System.out.println("Dialled numbers");
                                    break;
                            }
                        }
                        break;
                }
            }
        }
    }
