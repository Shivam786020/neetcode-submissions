class Solution {
    public int search(int[] nums, int target) {
      int st = 0,end = nums.length -1;
      while(st <= end ){
int mid = (st + end)/2;
if(target > nums[mid]){
    st = mid + 1;
} else if(target < nums[mid]){
    end = mid - 1;
} else {
return mid;}
      }
      return -1;
    }
}
