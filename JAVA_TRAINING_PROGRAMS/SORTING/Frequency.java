import java.util.*;

public class Frequency {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)) {
        System.out.print("ENTER ARRAY SIZE: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter " + n + " values in the array (including repeating values):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " time" + (count > 1 ? "s" : ""));
        }

        scanner.close();
    }
}}
