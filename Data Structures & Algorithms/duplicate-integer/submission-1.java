class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> intset = new HashSet<>();
       for(int num : nums){
         if(intset.contains(num)){
           return true;
         } else {
          intset.add(num);
         }
       }
       return false;
    }
}