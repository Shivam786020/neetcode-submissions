class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) {
            freq[t - 'A']++;
        }

        int maxFreq = 0;
        int maxCount = 0;   // how many tasks share the max frequency
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
                maxCount = 1;
            } else if (f == maxFreq && f > 0) {
                maxCount++;
            }
        }

        // Formula: (maxFreq - 1) * (n + 1) + maxCount
        int formula = (maxFreq - 1) * (n + 1) + maxCount;

        // If enough tasks to fill gaps without idle, answer is just total tasks
        return Math.max(formula, tasks.length);
    }
}