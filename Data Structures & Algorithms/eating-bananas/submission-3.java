class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //brute force way is basically to start at h, increase by 1 every iteration. 
        
        //yes and the maximum we will stop at is actually the largest value in the array, 
        //since anything past that gives the same values

        Arrays.sort(piles);

        int left = 1;
        int right = piles[piles.length -1];
        int current_smallest = 1; 



        while(left <= right){

            int middle = left + (right - left)/2;
            int total = 0;
            for(int y= 0; y < piles.length; y++){
                if(piles[y] <= middle){
                    total++;
                }
                else{
                    System.out.println("constitutes: " + piles[y] + " middle: " + middle);
                    total += Math.floorDiv(piles[y], middle);
                    if(piles[y] % middle > 0){
                        total ++;
                    }
                }

            }
            System.out.println(total);
            if(total <= h){
                current_smallest = middle;
                right = middle -1;
            }
            else{
                left = middle + 1;
            }
            
            
        }
        return current_smallest;


        //we can get the total value, this is a continuous array or basically a continous and its sorted, we can keep going forwards of backwards
        //why do i need to start at 1? tho 

        //i need a minimum eat speed for h, the bare minimum eating speed is 1. 
        //SO WHY IS IT 1? i want to cover the whole range of possibilities, I know 



    }
}
