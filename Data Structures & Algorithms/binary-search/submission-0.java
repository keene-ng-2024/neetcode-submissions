class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1 ; 

        //always go to the halfway mark first

        while(left <= right){
            int middle = left +  ((right - left)/2);
            if (nums[middle] == target){
                return middle; 
            }
            else if (nums[middle] < target){
                left = middle +1;
                System.out.println("hello");
            }
            else{
                right = middle - 1;
                System.out.println("hello left");
            }
        }

        return -1;

    }
}
