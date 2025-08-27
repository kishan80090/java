import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the choose number : ");
        int choose_no=sc.nextInt();

        switch (choose_no) {
            case 1:
                System.out.println("Your choose number 1");
                break;
                case 2:    
                System.out.println("Your choose number 2");
                break;
                case 3: 
                System.out.println("Your choose number 3");
                break;
            default:
            System.out.println("default number");
        
        }
        
    }
}
