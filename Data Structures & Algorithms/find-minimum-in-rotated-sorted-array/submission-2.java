class Solution {
    public int findMin(int[] nums) {
        //techincally everything is still the same order
        //maybe if it is at the bounds then move 

        int smallest = nums[0];
        int left = 0;
        int right = nums.length - 1;


        while(left <= right){
            int middle = left + (right - left)/2;

            if(nums[middle] >= nums[left]){
                //this means im in the left sorted portion
                //i want to continue going to find my right sorted portion because likely it is there
                
                if(nums[left] < smallest){
                    smallest = nums[left];
                }
                left = middle + 1;
            }
            else{
                if(nums[middle] < smallest){
                    smallest = nums[middle];
                }
                right = middle -1;
            }
        
        }

        return smallest;



    }
}
