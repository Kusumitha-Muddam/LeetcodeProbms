class Solution {
    public int primePalindrome(int n) {
        if (8 <= n && n <= 11)
            return 11;

        for (int i = 1; i < 100000; i++) {
            String s = Integer.toString(i);
            String rev = new StringBuilder(s.substring(0, s.length() - 1))
                    .reverse().toString();

            int x = Integer.parseInt(s + rev);

            if (x >= n && isPrime(x))
                return x;
        }

        return -1;
    }

    boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}