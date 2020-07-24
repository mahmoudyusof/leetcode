class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
                s.add(i);
            }
        }
        
        int[] ans = new int[k];
        int max = 0;
        int maxKey = -1;
        
        for(int i=0; i<k; i++){
            for(int j : s){
                if(map.get(j) > max){
                    max = map.get(j);
                    maxKey = j;
                }
            }
            ans[i] = maxKey;
            s.remove(maxKey);
            max = 0;
        }
        return ans;
    }
}
