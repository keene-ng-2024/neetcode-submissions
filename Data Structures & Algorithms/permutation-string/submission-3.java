class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //implementation, so think of the double pointer, if the size 
        //exceeds then we move the pointer forwards, we just tryna hit the freq
        //build the s1 first
        ArrayList<Integer> unique = new ArrayList<>();
        int[] db = new int[26];
        int[] clone = new int[26];
        int start = 0;
        int end = 0;
        int same = 26;
        for(int i = 0; i < s1.length(); i++){
            int temp = s1.charAt(i) - 'a';
            if(!unique.contains(temp)){
                unique.add(temp);
                same --;
            }
            db[temp] += 1;
        }

        while(end < s2.length()){
            if(end - start > s1.length()- 1){
                //System.out.println(s2.charAt(start));
                int temp = s2.charAt(start) - 'a';
                if(clone[temp] == db[temp]){
                    same --;
                }
                clone[temp] -= 1;
                start++;
            }
            int current_thing = s2.charAt(end) - 'a';
            clone[current_thing] += 1;

            if(clone[current_thing] == db[current_thing]){
                same ++;
            }

            if(same == 26){
                return true;
            }
            end++;
            
        }

        return false;
        
    }
}
