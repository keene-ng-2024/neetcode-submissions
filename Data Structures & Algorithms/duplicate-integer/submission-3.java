class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> db = new HashMap<>();
        for (int num : nums){
            if(!db.containsKey(num)){
                db.put(num, true);
            }
            else{
                return true;
            }
        }
        return false;
    }
}