class Solution {
    public int maxArea(int[] heights) {
        int left_pointer = 0;
        int right_pointer = heights.length - 1;
        int greatest = (right_pointer - left_pointer) * Math.min(heights[left_pointer], heights[right_pointer]);
        while(left_pointer < right_pointer){
            if(heights[left_pointer] <= heights[right_pointer]){
                left_pointer ++;
            }else{
                right_pointer --;
            }
            int current = (right_pointer - left_pointer) * Math.min(heights[left_pointer], heights[right_pointer]);
            if(current > greatest){
                greatest = current;
            }
        }
        return greatest;

        
    }
}
