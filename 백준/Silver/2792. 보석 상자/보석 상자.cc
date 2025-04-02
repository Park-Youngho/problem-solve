#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n, m, ret;
ll a[300004];
bool check(ll mid){
    ll num=0;
    for(int i=0; i<m; i++){
        num += a[i]/mid;
        if(a[i] % mid) num++;
    }
    return n >= num;
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n >> m;
    ll high=0, low=1, ret = 1e18, mid;
    for(int i=0; i<m; i++){
        cin >> a[i];
        high = max(high, a[i]);
    }
    
    while(low <= high){
        mid = (high+low)/2;
        if(check(mid)){
            ret = min(ret, mid);
            high = mid -1;
        }
        else low = mid +1;
    }
    cout << ret;
    return 0;
}