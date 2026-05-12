class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left_pointer = 0;
        int[] oop = {};
        for(int i = 0; i < numbers.length; i++){
            for(int g = i; g < numbers.length; g++){
                if ((numbers[i] + numbers[g])== target){
                    int[] answer = {i+1, g + 1};
                    return answer;

                }
            }

        }
        return oop;
    }
}
