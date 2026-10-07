class Solution {

    public List<List<Integer>> findPrimePairs(int n) {

        boolean[] prime = new boolean[n + 1];

        for(int i = 2; i <= n; i++)
            prime[i] = true;

        for(int i = 2; i * i <= n; i++) {
            if(prime[i]) {
                for(int j = i * i; j <= n; j += i)
                    prime[j] = false;
            }
        }

        List<List<Integer>> m = new ArrayList<>();

        for(int i = 2; i <= n / 2; i++) {

            int j = n - i;

            if(prime[i] && prime[j]) {
                List<Integer> k = new ArrayList<>();
                k.add(i);
                k.add(j);
                m.add(k);
            }
        }

        return m;
    }
}