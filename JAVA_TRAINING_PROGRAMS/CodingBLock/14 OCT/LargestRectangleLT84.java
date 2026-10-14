import java.util.*;

public class LargestRectangleLT84 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        solve(arr);
    }

    private static void solve(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0; // Keep track of the maximum area

        for (int i = 0; i < arr.length; i++) {
            // Process elements that are strictly smaller than the top of the stack
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int top = st.pop();
                int rs = i;      // Right smaller element index
                int ls = -1;     // Left smaller element index (default to -1)
                
                if (!st.isEmpty()) {
                    ls = st.peek();
                }

                // Calculation must happen OUTSIDE the if(!st.isEmpty()) block
                int h = arr[top];
                int w = rs - ls - 1;
                int area = h * w;
                maxArea = Math.max(maxArea, area); 
            }
            // Push the current index regardless of whether the while loop ran
            st.push(i);
        }
        
        // This loop must be OUTSIDE the for loop
        int rs = arr.length; 
        while (!st.isEmpty()) {
            int top = st.pop();
            int ls = -1;
            
            if (!st.isEmpty()) {
                ls = st.peek();
            }
            
            int h = arr[top];
            int w = rs - ls - 1;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Max Area: " + maxArea);
    }
}