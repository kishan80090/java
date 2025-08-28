public class boxing {
    public static void main(String[] args) {
        // Wrapper Class
        // Integer, Float, Double, Long, Boolean
        int n = 5;
        Integer i = n;// Boxing
        System.out.println(n);
        System.out.println(i);

        System.out.println(i);
        System.out.println(i.getClass());
        n = i;// Unboxing
        System.out.println(n);
        System.out.println(i);
    }

}
