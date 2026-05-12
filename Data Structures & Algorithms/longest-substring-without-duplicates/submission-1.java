class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        ArrayList<Character> db = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for(char item : charArray){
            if(!db.contains(item)){
                db.add(item);
            }
            else{
                if(db.get(0) == item){
                    db.remove(0);
                }
                else{
                    if(db.size() > longest){
                        longest = db.size();
                    }
                    db.clear();
                }
                db.add(item);
                
            }
        }
        if(db.size() > longest){
            longest = db.size();
        }

        return longest;
        

        
    }
}
