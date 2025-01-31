class Solution {
public:
    long long flowerGame(int n, int m) {
        if(n == 1 && m == 1)return 0;
        long long int ans = 0;
        int o = (m - 1)/2;
        int e = (m/2);
        for(int i = 1; i <= n;i++){
            if(i%2 == 0){
                if(o > 0)
                ans += o;
                o--;
            }else{
                if(e > 0)
                ans += e;
                e--;
            }
        }
        cout<<ans<<endl;
        o = (n - 1)/2;
        e = (n/2);
        for(int i = 1; i <= m;i++){
            if(i%2 == 0){
                if(o > 0)
                ans += o;
                o--;
            }else{
                if(e > 0)
                ans += e;
                e--;
            }
        }
        return ans;
    }
};
