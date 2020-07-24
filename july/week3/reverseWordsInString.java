class Solution {
    public String reverseWords(String s) {
        String res = "";
        for(String word : s.split(" ")){
            if(word.trim().length() < 1){
                continue;
            }
            res = word.trim() + " " + res;
        }
        return res.trim();
    }
}
