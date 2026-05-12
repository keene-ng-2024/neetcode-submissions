class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int number : nums){
            list.add(number);

        }
        Collections.sort(list);

        List<List<Integer>> db = new ArrayList<>();

        //now do the pointer thinga
        for(int i = 0; i < list.size(); i++){
            int current = list.get(i);
            int front = i + 1;
            int back = list.size() - 1;
            int target = 0 - current;
            while(front < back){
                //System.out.println(front + " " + back);
                int sum = list.get(front) + list.get(back);
                if(target > sum){
                    front++;
                }
                else if(target < sum){
                    back--;
                }
                else{
                    //System.out.println("Success");
                    List<Integer> item = new ArrayList<>();
                    item.add(current);
                    item.add(list.get(front));
                    item.add(list.get(back));
                    if(!db.contains(item)){
                        db.add(item);
                    }
                    front++;
                }
            }
        }
        return db;
    }
}
