import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOptimized {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){
        System.out.print("ENTER ARRAY SIZE: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " values in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int value : arr) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        System.out.println("Frequency of each value:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();
            System.out.println(value + " occurs " + count + " time" + (count > 1 ? "s" : ""));
        }

        scanner.close();
    }
}
}