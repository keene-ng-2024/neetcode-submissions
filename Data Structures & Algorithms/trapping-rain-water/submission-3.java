class Solution {
    public int trap(int[] height) {
        int max_left = 0;
        int max_right = 0;
        int total = 0;
        int left_pointer = 0;
        int right_pointer = height.length - 1;
        while(left_pointer <= right_pointer){
            //basically always check which one is lesser then we fix it 
            if(max_left <= max_right){
                System.out.println("left trigger");
                total += Math.max(0,max_left - height[left_pointer]);
                System.out.println("max left: " + max_left);
                if(height[left_pointer] > max_left){
                    max_left = height[left_pointer];
                }
                left_pointer++;
            }
            else{
                total += Math.max(0,max_right - height[right_pointer]);
                
                if(height[right_pointer] > max_right){
                    max_right = height[right_pointer];
                }
                right_pointer--;
            }
        }

        return total;

        
    }
}
