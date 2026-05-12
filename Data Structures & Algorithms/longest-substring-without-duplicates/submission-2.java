class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        ArrayList<Character> db = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for(char item : charArray){
            while(db.contains(item)){
                db.remove(0);
            }
            db.add(item);
            if(db.size() > longest){
                longest = db.size();
            }
        }

        return longest;

    }
}
