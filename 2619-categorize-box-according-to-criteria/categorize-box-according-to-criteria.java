class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        long v = l * w;
        v = v * h;
        if (l >= 10000 || w >= 10000 || h >= 10000 || m >= 10000 || v >= 1000000000) {
            if (m >= 100)
                return "Both";
            return "Bulky";
        }
        if (m >= 100)
            return "Heavy";
        return "Neither";
    }
}