class Solution {
    public int characterReplacement(String s, int k) {
        //sliding window, where the condition is to check if the rule has been broken
        //so if the rule is broken then remove one, otherwise increase one?
        //hashmap where the count is variable, so the thing being removed deduct
        //then if being added then add

        int max = 0;
        HashMap<Character, Integer> db = new HashMap<>();
        ArrayList<Character> sliding_window = new ArrayList<>();
        char[] letters = s.toCharArray();
        //now how do i even count hmm
        for(char letter : letters){
            sliding_window.add(letter);
            if(db.containsKey(letter)){
                int temp = db.get(letter);
                db.put(letter, temp + 1);
            }else{
                db.put(letter,1);
            }
            //now check the condition, i think progressively remove
            int max_current = Collections.max(db.values());
            while((sliding_window.size() - max_current) > k){
                char removed = sliding_window.remove(0);
                int temp = db.get(removed);
                db.put(removed, temp - 1);
            }
            if (sliding_window.size() > max){
                max = sliding_window.size();
            }


        }

        return max;


        

    }
}
