#include <iostream>
#include <bits/stdc++.h>

using namespace std;
//우선순위 큐 사용
//d값이 같으면 크기가 작은건 뺴야함
//일단 p값을 큐에 넣고 d값이 크거나 같으면 q.pop()
vector<pair<int,int>> v;

int n;
priority_queue<int, vector<int>, greater<int>> pq; //최소힙

bool comp(pair<int,int> a, pair<int,int> b){
    if(a.second == b.second) return a.first < b.first; 
    return a.second < b.second;
}
int main() {
    cin >> n;
    while(n--){
        int p,d;
        cin >> p >> d;
        v.push_back(make_pair(p,d));
    }
    sort(v.begin(), v.end(), comp);
    for(int i=0; i<v.size(); i++){
        pq.push(v[i].first);
        if(v[i].second < pq.size()){
            pq.pop();
        }
    }
    int ret = 0;
    while(!pq.empty()){
        ret += pq.top();
        pq.pop();
    }
    cout << ret;
    return 0;
}