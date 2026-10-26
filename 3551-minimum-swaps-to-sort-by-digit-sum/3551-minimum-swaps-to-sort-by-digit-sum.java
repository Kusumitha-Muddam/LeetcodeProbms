import java.util.*;

class Solution {
    public int sum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++)
            arr[i] = i;

        Arrays.sort(arr, (a, b) -> {
            int sa = sum(nums[a]);
            int sb = sum(nums[b]);

            if (sa != sb)
                return sa - sb;
            return Integer.compare(nums[a], nums[b]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i] == i)
                continue;

            int cycle = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j];
                cycle++;
            }

            swaps += cycle - 1;
        }

        return swaps;
    }
}