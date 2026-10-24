class Solution {
    public int nonSpecialCount(int l, int r) {
        int c = 0;
        int a = (int) Math.sqrt(l);
        int b = (int) Math.sqrt(r);

        boolean[] prime = new boolean[b + 1];
        Arrays.fill(prime, true);

        if (b >= 0) prime[0] = false;
        if (b >= 1) prime[1] = false;

        for (int i = 2; i * i <= b; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= b; j += i)
                    prime[j] = false;
            }
        }

        for (int i = Math.max(2, a); i <= b; i++) {
            if (prime[i] && (long) i * i >= l &&
                (long) i * i <= r)
                c++;
        }

        return r - l + 1 - c;
    }
}