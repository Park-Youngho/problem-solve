#include <bits/stdc++.h>
using namespace std;
int n,m,k;
int a[104][104];
int visited[104][104];

int x1,x2,yy1,y2;
int ret=0;
int dy[] = {-1,0,1,0};
int dx[] = {0,1,0,-1};
vector<int> v;
int go(int y, int x){
    visited[y][x] =1;
    int cnt = 1;
    for(int i=0; i<4; i++){
        int ny = y + dy[i];
        int nx = x + dx[i];
        if(ny <0 || ny >= n || nx >=m || nx <0 ||
            visited[ny][nx] || a[ny][nx]) continue;
        cnt += go(ny, nx);
    }
    return cnt;
}
int main() {
    cin >> m >> n >> k; 
    for(int i=0; i<k; i++){
        cin >> x1 >> yy1 >> x2 >> y2;
        for(int j=x1; j<=x2-1; j++){
            for(int p=yy1; p<=y2-1; p++){
                a[j][p] = 1;
            }
        }
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(visited[i][j] || a[i][j]) continue;
            v.push_back(go(i,j));
        }
    }
    sort(v.begin(), v.end());
    cout << v.size() << "\n";
    for(int i=0; i<v.size(); i++){
        cout << v[i] << " ";
    }
    
    return 0;
}