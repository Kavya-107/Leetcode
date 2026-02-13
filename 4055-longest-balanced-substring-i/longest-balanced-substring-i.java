class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        if (n <= 1) return n;

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> freq = new HashMap<>();

            int minFreq = Integer.MAX_VALUE;
            int maxFreq = Integer.MIN_VALUE;

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                minFreq = Integer.MAX_VALUE;
                maxFreq = Integer.MIN_VALUE;

                for (int val : freq.values()) {
                    minFreq = Math.min(minFreq, val);
                    maxFreq = Math.max(maxFreq, val);
                }

                if (minFreq == maxFreq) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
