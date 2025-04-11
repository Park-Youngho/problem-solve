#include <bits/stdc++.h>
using namespace std;
int n,m;
vector<int>a,b;
int l,r;
int cnt=0;
int ret=0;
void bsearch(int target){
    int l=0, r=m-1, mid;
    while(l<=r){
        mid = (l+r)/2;
        if(b[mid] == target){
            cnt++;
            return;
        }
        else if(b[mid] < target) l=mid+1;
        else r = mid-1;
    }
}
void asearch(int target){
    int l=0, r= n-1, mid;
    while(l<=r){
        mid = (l+r)/2;
        if(a[mid] == target){
            cnt++;
            return;
        }
        else if(a[mid] < target) l=mid+1;
        else r = mid-1;
    }
}
int main() {
    cin >> n >> m;
    for(int i=0; i<n; i++){
        int k;
        cin >> k;
        a.push_back(k);
    }
    for(int i=0; i<m; i++){
        int k;
        cin >> k;
        b.push_back(k);
    }
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    for(int i=0; i<n; i++){
        bsearch(a[i]);
    }
    ret += b.size()-cnt;
    cnt=0;
    for(int i=0; i<m; i++){
        asearch(b[i]);
    }    
    ret += a.size()-cnt;
    cout << ret;
    return 0;
}