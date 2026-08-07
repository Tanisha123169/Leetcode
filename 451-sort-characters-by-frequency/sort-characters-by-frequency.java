class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Character>[] b = new ArrayList[s.length() + 1];
        for (char c : map.keySet()) {
            int r = map.get(c);
            if (b[r] == null) {
                b[r] = new ArrayList<Character>();
            }
            b[r].add(c);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i] == null)
                continue;
            for (char c : b[i]) {
                for (int p = 0; p < i; p++) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}