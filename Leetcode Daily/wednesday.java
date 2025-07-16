public class Solution {
    
    // Main function to find the maximum valid subsequence length
    public int maximumLength(int[] nums) {
        int odd = 0, even = 0;

        // Count total number of odd and even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Try both possible alternating sequences:
        // one starting with even, one starting with odd
        int altStartingWithEven = getAlternatingLength(nums, 0);
        int altStartingWithOdd = getAlternatingLength(nums, 1);

        // The answer is the maximum of:
        // - longest all-even subsequence
        // - longest all-odd subsequence
        // - longest alternating subsequence (either starting with even or odd)
        return Math.max(Math.max(even, odd), Math.max(altStartingWithEven, altStartingWithOdd));
    }

    /**
     * Builds the longest alternating parity subsequence starting with `startParity`.
     * @param nums Input array
     * @param startParity 0 = even, 1 = odd
     * @return Length of the longest valid alternating subsequence
     */
    private int getAlternatingLength(int[] nums, int startParity) {
        int currentParity = startParity;
        int count = 0;

        for (int num : nums) {
            if (num % 2 == currentParity) {
                count++;
                currentParity = 1 - currentParity; // Flip parity for next expected element
            }
        }

        return count;
    }
}
