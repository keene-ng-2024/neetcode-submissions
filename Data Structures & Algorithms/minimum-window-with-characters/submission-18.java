class Solution {
    public String minWindow(String s, String t) {
        //its always some form of two pointer remember this
        //check it off and have a total sum as well, 
        char[] to_match = t.toCharArray();
        String answer = "";
        boolean change_state = false;
        HashMap<Character, Integer> db = new HashMap<>();
        for(char letter : to_match){
            if(!db.containsKey(letter)){
                db.put(letter, 1);
            }else{
                int temp = db.get(letter);
                db.put(letter, temp + 1);
            }
        }
        int target = t.length();

        //now for iteration
        int start = 0;
        boolean startset = false;
        ArrayList<Character> helper = new ArrayList<>();
        int helper_index = 0;
        boolean proc = true;
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(db.containsKey(current)){
                if(!startset){
                    startset = true;
                    start = i;
                }else{
                    System.out.println("current: " + current + ", db count: " + db.get(current));
                    if(s.charAt(start) == current && db.get(current) == 0){
                        proc = false;
                        change_state = true;
                        if(helper_index < helper.size()){
                            if(s.charAt(start) == helper.get(helper_index)){
                                helper_index ++;
                            }
                        }
                        start ++;
        
                        while(!db.containsKey(s.charAt(start))){
                            if(helper_index < helper.size()){
                                if(s.charAt(start) == helper.get(helper_index)){
                                    helper_index ++;
                                }
                            }
                            start++; 
                        }
                        System.out.println("moving: " + start);
                        if(helper.size() > 0 && helper_index < helper.size()){
                            while(s.charAt(start) == helper.get(helper_index)){
                                start++;
                                while(!db.containsKey(s.charAt(start))){
                                    start ++;
                                }
                                if(helper_index < helper.size()){
                                    helper_index ++;
                                    if(helper_index == helper.size()){
                                        break;
                                    }
                                }
                            }
                        }

                    }
                }
                //if(target == 0 && proc){
                    //proc = false;
                    //System.out.println("kena: " + current);
                    //helper.add(current);
                //}
                if(db.get(current) > 0){
                    //System.out.println("proc" + " " + target);
                    int temp1 = db.get(current);
                    db.put(current, temp1 - 1);
                    target --;
                }
                else{
                    if(start < i && proc){
                        System.out.println("added to helper");
                        helper.add(current);
                    }

                }

            }
            if(target == 0){
                System.out.println("proc " + current + " start: " + start);
                if(answer.length() == 0 || change_state){
                    change_state = false;
                    if(answer.length() == 0 || i-start < answer.length()){
                        answer = "";
                        for(int y = start; y <= i; y++){
                            answer += s.charAt(y);
                        }
                    }
                }
            }
            

        }

        return answer;


        
    }
}
