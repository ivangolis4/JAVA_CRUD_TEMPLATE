import java.util.Scanner;

public class Main{
    

    public static void main(String[]args){
        Functions p = new Functions();
        CRUD c = new CRUD();
        Scanner sc  = new Scanner(System.in);
        boolean flag = true;

        
        while(flag){
            try {
            p.Selection();
            System.out.print("Select Choices: ");
            int o = sc.nextInt();

            switch (o) {
                case 1:
                    c.Borrow();
                    break;
    
                case 2:
                    c.Review_Available();
                    break;
    
                case 3:
                    c.Dispaly_Borrowed_Books();
                    break;
    
                case 4:
                    c.Return_Books();
                    break;
    
                case 5:
                    c.Delete_User();
                    break;
    
            
                case 6:
                    c.Delete_User();
                    break;
    
                case 0:
                    System.out.println("===========Program Close===========");
                    flag = false;
                    break;
            
                default:
                    System.out.println("\n--------------------------------");    
                    System.out.println("|                              |");
                    System.out.println("|         " + o + " NOT FOUND!         |");
                    System.out.println("|                              |");
                    System.out.println("--------------------------------");
                    break;
            }
        } catch (Exception e) {
            System.out.println("\n--------------------------------");
            System.out.println("|                              |");
            System.out.println("|        ENTER A NUMBER!       |");
            System.out.println("|                              |");
            System.out.println("--------------------------------");
            sc.nextLine();
        }}

        }
    }
