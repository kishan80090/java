public class youtest {
        public static void main(String[] args) {
        int num = 23;
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break; 
                }
            }
        }
        if (prime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}