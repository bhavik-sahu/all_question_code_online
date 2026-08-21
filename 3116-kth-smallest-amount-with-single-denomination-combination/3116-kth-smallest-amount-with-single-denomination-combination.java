class Solution {

    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;

        long low = 1;
        long high = (long) coins[0] * k;

        // Find a safe upper bound
        for (int coin : coins) {
            high = Math.min(high, (long) coin * k);
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (count(mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private long count(long x, int[] coins) {
        int n = coins.length;
        long total = 0;

        // Generate every non-empty subset
        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int bits = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;

                    lcm = getLCM(lcm, coins[i]);

                    // Avoid unnecessary large values / overflow
                    if (lcm > x) {
                        possible = false;
                        break;
                    }
                }
            }

            if (!possible)
                continue;

            long multiples = x / lcm;

            if (bits % 2 == 1) {
                total += multiples;
            } else {
                total -= multiples;
            }
        }

        return total;
    }

    private long getLCM(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}