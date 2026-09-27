class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        boolean[] ans = new boolean[queries.length];

        int[] bad = new int[nums.length];

        bad[0] = -1;

        for (int i = 1; i < nums.length; i++) {

            bad[i] = bad[i - 1];

            if (nums[i] % 2 == nums[i - 1] % 2) {
                bad[i] = i;
            }
        }

        for (int j = 0; j < queries.length; j++) {

            int left = queries[j][0];
            int right = queries[j][1];

            if (bad[right] >= left + 1) {
                ans[j] = false;
            } else {
                ans[j] = true;
            }
        }

        return ans;
    }
}