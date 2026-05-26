class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] letters = s1.toCharArray();
        int curr_state = s1.length();
        int to_save = s1.length();
        HashMap<Character, Integer> db = new HashMap<>();
        for(char letter : letters){
            if(!db.containsKey(letter)){
                db.put(letter, 1);
            }else{
                int temp = db.get(letter);
                db.put(letter, temp + 1);

            }
        }

        for(int i = 0; i < s2.length(); i ++){
            //if it is in db, > 0 then count -- db--, if i remove a thing inside, count ++, db ++
            if(i >= to_save){
                char prev = s2.charAt(i - to_save);
                System.out.println("hello" + prev);
                if(db.containsKey(prev)){
                    int temp2 = db.get(prev);
                    System.out.println("proc2");
                    db.put(prev, temp2 + 1);
                    
                }
            }
            char current = s2.charAt(i);
            if(db.containsKey(current)){
                int temp1 = db.get(current);
                System.out.println("proc");
                curr_state --;
                db.put(current, temp1 - 1);
            }

            //System.out.println(curr_state);
            boolean checker = true;
            for(int item : db.values()){
                if(item != 0){
                    checker = false;
                    break;
                }
            }
            System.out.println(checker);
            if(checker){
                return true;
            }
        }
        return false;

    }
}
