class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left_pointer = 0;
        int[] oop = {};
        int counter = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int g = i; g < numbers.length - 0; g++){
                if((numbers[i] + numbers[g]) > target){
                    counter ++;
                }
                if ((numbers[i] + numbers[g])== target){
                    int[] answer = {i+1, g+1};
                    return answer;
                }
            }
        }
        return oop;
    }
}
