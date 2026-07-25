class Solution {
    public int findMin(int[] nums) {
        //techincally everything is still the same order
        //maybe if it is at the bounds then move 

        int smallest = nums[0];
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int middle = left + (right - left)/2;

            if(nums[middle] < smallest){
                smallest = nums[middle];
            }

            //we want to find the smallest
            if(nums[left] <= nums[middle]){
                if(nums[left] < smallest){
                    smallest = nums[left];
                }
                left = middle + 1;
            }
            else{
                right = middle -1; 
            }
        }

        return smallest;


        



    }
}
