class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //brute force way is basically to start at h, increase by 1 every iteration. 
        
        //yes and the maximum we will stop at is actually the largest value in the array, 
        //since anything past that gives the same values

        

        int left = 1;
        int right = 0;
        for (int i = 0; i < piles.length; i++){
            if(piles[i] > right){
                right = piles[i];
            }

        }
        int current_smallest = 1; 
        while(left <= right){

            int middle = left + (right - left)/2;
            int total = 0;
            for(int y= 0; y < piles.length; y++){
                if(piles[y] <= middle){
                    total++;
                }
                else{
                    //System.out.println("constitutes: " + piles[y] + " middle: " + middle);
                    total += Math.floorDiv(piles[y], middle);
                    if(piles[y] % middle > 0){
                        total ++;
                    }
                }
            }
            //System.out.println(total);
            if(total <= h){
                current_smallest = middle;
                right = middle -1;
            }
            else{
                left = middle + 1;
            }
            
            
        }
        return current_smallest;



    }
}
