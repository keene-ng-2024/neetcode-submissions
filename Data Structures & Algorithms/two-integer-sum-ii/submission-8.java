class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int back = numbers.length -1;
        int start = 0;
        int sum = numbers[start] + numbers[back];
        int[] answer = {start + 1, back + 1};
        while(sum != target){
            sum = numbers[back] + numbers[start];
            if(sum < target){
                start++;
            }
            else if (sum > target){
                back--;
            }
            else{
                answer[0] = start + 1;
                answer[1] = back + 1;
                return answer;

            }
        }
        return answer;
    }
}
