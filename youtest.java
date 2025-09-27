public class youtest{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Element " + arr[i] + " occurs " + count + " times");
        }
    }
}