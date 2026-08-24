class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; 
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;  
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++;
            maxCount = Math.max(maxCount, count[currentChar - 'A']);  
            
            if ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}