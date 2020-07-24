class Solution {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1) return 1;
        if(x == -1) return n % 2 == 0 ? 1 : -1;
        if(n == Integer.MIN_VALUE) return 0;
        double p = x;
        for (int i=1; i < Math.abs(n); i++){
            p *= x;
        }
        return n < 0 ? 1.0 / p : p;
    }
}
