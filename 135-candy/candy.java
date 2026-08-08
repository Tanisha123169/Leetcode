class Solution {
    public int candy(int[] ratings) {
        int[] n = new int[ratings.length];
        n[0] = 1;
        for (int i = 1; i < n.length; i++) {
            n[i] = 1;
            if (ratings[i] > ratings[i - 1]) {
                n[i] = n[i - 1] + 1;
            }
        }
        for (int i = n.length - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {
                n[i] = Math.max(n[i], n[i + 1] + 1);
            }
        }
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;

    }
}