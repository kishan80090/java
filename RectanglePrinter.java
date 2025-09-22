import java.util.Scanner;

public class RectanglePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Width daalein: ");
        String widthInput = sc.nextLine();
        System.out.print("Height daalein: ");
        String heightInput = sc.nextLine();
        if (widthInput.isEmpty() || heightInput.isEmpty()) {
            System.out.println("0 0");
            return;
        }
        
        int width = Integer.parseInt(widthInput);
        int height = Integer.parseInt(heightInput);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
