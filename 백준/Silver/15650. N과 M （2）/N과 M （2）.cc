#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n,m;
int arr[10];
vector<int> v;
void go(int start){
    if(v.size()==m){
        for(int i: v){
            cout << i<< " ";
        }
        cout << "\n";
    }
    for(int i=start+1; i<=n; i++){
        v.push_back(i);
        go(i);
        v.pop_back();
    }
    
}
int main() {
    cin >> n >> m;
    go(0);
    return 0;
}