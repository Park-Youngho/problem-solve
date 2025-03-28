#include <bits/stdc++.h>
using namespace std;

int n;
vector<int> v;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;
    for(int i=0; i<n; i++){
        int num;
        cin >> num;
        auto a = lower_bound(v.begin(), v.end(), num);
        if(a==v.end()){
            v.push_back(num);
        }
        else *a = num;
    }
    cout << v.size();
    return 0;
}