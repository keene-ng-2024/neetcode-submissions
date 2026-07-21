class Solution {
    public int climbStairs(int n) {
        int[] answer = new int[n+1];
        int total = 0;



        for(int i = answer.length -1; i >= 0; i--){
            System.out.println(i);
            if (i == n){
                answer[i] = 1;
            
            }
            else if(i == n-1){
                answer[i] = 1;
            }
            else{
                answer[i] = answer[i+2] + answer[i+1];
            }
        }

        return answer[0];
    }
}
