class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        // Add virtual 1's at both ends
        s = "1" + s + "1";

        int totalOnes = 0;

        // Count original ones
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1')
                totalOnes++;
        }

        int ans = totalOnes;

        int n = s.length();

        // Process every removable 1-block
        for (int i = 1; i < n - 1;) {

            if (s.charAt(i) == '0') {
                i++;
                continue;
            }

            int start = i;

            while (i < n && s.charAt(i) == '1')
                i++;

            int end = i - 1;

            // Must be surrounded by zeros
            if (start > 0 && end < n - 1 &&
                s.charAt(start - 1) == '0' &&
                s.charAt(end + 1) == '0') {

                // Count left zero block
                int left = 0;
                int j = start - 1;
                while (j >= 0 && s.charAt(j) == '0') {
                    left++;
                    j--;
                }

                // Count right zero block
                int right = 0;
                j = end + 1;
                while (j < n && s.charAt(j) == '0') {
                    right++;
                    j++;
                }

                ans = Math.max(ans, totalOnes + left + right);
            }
        }

        return ans;
    }
}