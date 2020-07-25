class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        int index = 0;
        for(int i : set){
            res[index] = i;
            index++;
        }
        return res;
    }
}
