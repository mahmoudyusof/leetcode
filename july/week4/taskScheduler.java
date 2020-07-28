class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length;
        HashMap<Character, Integer> counts = new HashMap<>();
        int max_count = 0;
        for(char i : tasks){
            counts.putIfAbsent(i, 0);
            counts.put(i, counts.get(i) + 1);
            max_count = Math.max(max_count, counts.get(i));
        }
        int res = (max_count-1)*(n+1);
        for(Map.Entry<Character, Integer> entry : counts.entrySet()){
            if(entry.getValue() == max_count){
                res++;
            }
        }
        return Math.max(res, tasks.length);
    }
}
