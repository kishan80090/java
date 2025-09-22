package AdvanceJava;
import java.util.Scanner;
public class timelocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute;
        System.out.print("Enter The hour : ");
        hour = sc.nextInt();
        System.out.print("Enter The minute : ");
        minute = sc.nextInt();
        
        if(hour<0||hour>23) {
            System.out.println("Error Hour: " + hour);
            return;
        }
        if(minute<0||minute>59) {
            System.out.println("Error Minute: " + minute);
            return;
        }
        
        if(hour == 0) {
            System.out.printf("Time is Correct = 12:%02d AM\n", minute);
        } else if(hour == 12) {
            System.out.printf("Time is Correct = 12:%02d PM\n", minute);
        } else if(hour > 12) {
            System.out.printf("Time is Correct = %02d:%02d PM\n", hour-12, minute);
        } else {
            System.out.printf("Time is Correct = %02d:%02d AM\n", hour, minute);
        }
    }
}
