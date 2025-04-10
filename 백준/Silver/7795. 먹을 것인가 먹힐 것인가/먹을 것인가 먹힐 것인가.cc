#include <bits/stdc++.h>
using namespace std;
int t, n,m;

int ret=0;

int main() {
    cin >> t;
    while(t--){
        vector<int> a, b;
        ret=0;
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
        sort(a.begin(),a.end());
        sort(b.begin(),b.end());
        for(int i=0; i<a.size(); i++){
            for(int j=0; j<b.size(); j++){
                if(a[i] > b[j]) ret++;
                else break;
            }
        }
        cout << ret << "\n";
    }
    return 0;
}