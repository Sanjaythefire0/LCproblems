class Solution {
    public double myPow(double x, int n) {
        long exp = n; // Use long to avoid overflow
        if (exp < 0) {
            x = 1 / x;
            exp = -exp; // Convert safely
        }
        
        double ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans *= x;
            }
            x *= x;
            exp >>= 1;
        }
        return ans;
    }
}
