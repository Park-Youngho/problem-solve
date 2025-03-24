#include <bits/stdc++.h>
using namespace std;
int n,m;
int a[100004];
vector<int> v;
int check(int k){
    int l =0;
    int r = n-1;
    while(l <= r){
        int mid = (r-l)/2 + l;
        if(v[mid] == k){
            return 1;
        }
        else if(v[mid] > k){
            r = mid-1;
        }
        else l = mid +1;
    }
    return 0;
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;
    for(int i=0; i<n; i++){
        int t;
        cin >> t;
        v.push_back(t);
    }
    sort(v.begin(), v.end());
    cin >> m;
    for(int i=0; i<m; i++){
        int k;
        cin >> k;
        cout << check(k) << "\n";
    }
    
    
    return 0;
}