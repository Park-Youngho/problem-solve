#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int n;
int cnt[26];
vector<char> v;
int main() {
    cin >> n;
    while(n--){
        string s;
        cin >> s;
        cnt[s[0]-'a']++;
    }
    for(int i=0; i<26; i++){
        if(cnt[i] >= 5) {
            v.push_back('a' + i);
        }
    }
    if(v.size()){
        for(int i=0; i< v.size(); i++){
            cout << v[i];
        }
    }
    else cout << "PREDAJA";
    
    return 0;
}