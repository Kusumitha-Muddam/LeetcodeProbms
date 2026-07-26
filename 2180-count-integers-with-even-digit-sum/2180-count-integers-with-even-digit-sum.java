class Solution {
    public int countEven(int num) {
        int sum = num / 1000 + (num / 100) % 10 + (num / 10) % 10 + num % 10;

        if (sum % 2 == 0)
            return num / 2;
        return (num - 1) / 2;
    }
}