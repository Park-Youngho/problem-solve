#include <bits/stdc++.h>
using namespace std;
int n, num, len;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    vector<int> v;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> num;
        auto a = lower_bound(v.begin(), v.end(), num);
        if(a == v.end()) v.push_back(num);
        else *a = num;
    }
    cout << v.size();
    return 0;
}