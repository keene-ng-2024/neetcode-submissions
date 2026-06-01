class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //System.out.println(k);
        int greatest_index = 0;
        int fallback_index = 0;
        int[] number_db = new int[nums.length - k + 1];
        int counter = 0;
        for(int i = 0; i< nums.length; i++){
            if(i >= k - 1){
                //then find the index of dat and check if its the one i removing
                if(fallback_index == i - k){
                    fallback_index ++ ;
                }
                if(greatest_index == i - k){
                    greatest_index = fallback_index;
                    fallback_index ++;
                }
            }
            if (nums[i] >= nums[greatest_index]){
                fallback_index = greatest_index;
                greatest_index = i;

            }
            if(nums[fallback_index] == nums[greatest_index] && fallback_index == 0 && i < k){
                fallback_index ++;

            }
            if(nums[i] < nums[greatest_index] && nums[i] >= nums[fallback_index]){
                fallback_index = i;
            }
            //System.out.println(fallback_index);
            if(i >= k - 1){
                number_db[counter] = nums[greatest_index];
                counter++;
                if(counter < 5){
                    //System.out.println(greatest_index +" " + fallback_index);
                }
            }
        }
        
        return number_db;

    }
}
