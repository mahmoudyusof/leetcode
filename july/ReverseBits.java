public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String istr = Integer.toBinaryString(n);
        String resString = "";
        int strlen = istr.length();
        for(int i=0; i<32 - strlen; i++){
            istr = "0" + istr;
        }
        for(int i=31; i>=0; i--){
            resString += istr.charAt(i);
        }
        System.out.println(resString.length());
        int res = Integer.parseInt(resString, 2);
        return res;
    }
}
