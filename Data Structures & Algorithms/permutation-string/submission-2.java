class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //implementation, so think of the double pointer, if the size 
        //exceeds then we move the pointer forwards, we just tryna hit the freq
        //build the s1 first
        ArrayList<Integer> unique = new ArrayList<>();
        boolean match = true;
        int[] db = new int[26];
        int[] clone = new int[26];
        int start = 0;
        int end = 0;
        for(int i = 0; i < s1.length(); i++){
            int temp = s1.charAt(i) - 'a';
            if(!unique.contains(temp)){
                unique.add(temp);
            }
            db[temp] += 1;
        }

        while(end < s2.length()){
            if(end - start > s1.length()- 1){
                System.out.println(s2.charAt(start));
                clone[s2.charAt(start) - 'a'] -= 1;
                start++;
            }
            int current_thing = s2.charAt(end) - 'a';
            clone[current_thing] += 1;
            match = true;
            //System.out.println("attempt");
            for(int thing : unique){
                if(db[thing] != clone[thing]){
                    match = false;
                    System.out.println("happened + " + thing);
                    break;
                }
            }
            if(match){
                return match;
            }
            end++;
            
        }

        return match;
        
    }
}
