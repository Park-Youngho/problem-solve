#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> v[104];
int visited[104];
int n,t,cnt=0;
void go(int here){
    for(int there : v[here]){
        if(visited[there]) continue;
        visited[there]=1;
        cnt++;
        go(there);
    }
}
int main() {
    cin >> n >> t;
    while(t--){
        int a, b;
        cin >> a >> b;
        v[a].push_back(b);
        v[b].push_back(a);
    }
    visited[1]=1;
    go(1);
    cout << cnt;
    return 0;
}