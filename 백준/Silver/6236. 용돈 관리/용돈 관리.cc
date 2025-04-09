#include <bits/stdc++.h>
using namespace std;
int n,m;
int mx = -9999, mn=9999;
int ret;
int a[100004];
bool check(int mid){
    int cnt=1;
    int tmp = mid;
    for(int i=0; i<n; i++){
        if(mid - a[i] < 0){
            cnt++;
            mid = tmp;
        }
        mid -= a[i];
    }
    return cnt <= m;
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> a[i];
        mx = max(mx, a[i]);
    }
    int low=mx, hi = 1000000004, mid;
    while(low <= hi){
        mid = (low + hi) / 2;
        if(check(mid)){
            hi = mid -1;
            ret = mid;
        }
        else low = mid + 1;
    }
    cout << ret;
    return 0;
}