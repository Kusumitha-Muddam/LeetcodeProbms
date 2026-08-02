import java.util.*;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            int n = num;

            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    set.add(i);
                    n /= i;
                }
            }

            if (n > 1) {
                set.add(n);
            }
        }

        return set.size();
    }
}