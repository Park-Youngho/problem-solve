#include <bits/stdc++.h>
using namespace std;
int n, arr[104][104];
int minn = 9999;
int mx = -9999;
int visited[104][104];
int dy[] = {-1,0,1,0};
int dx[] ={0,1,0,-1};
int ret =0;
void go(int y, int x, int depth){
    visited[y][x] = 1;
    for(int i=0; i<4; i++){
        int ny = y + dy[i];
        int nx = x + dx[i];
        if(ny <0 || ny >=n || nx <0 || nx >=n ||
            visited[ny][nx] || arr[ny][nx] <= depth) continue;
        go(ny,nx, depth);
    }
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            cin >> arr[i][j];

        }
    }
    for(int i=0; i<= 100; i++){
        int sum =0;
        memset(visited, 0, sizeof(visited));
        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                if(!visited[j][k] && arr[j][k] > i){
                    go(j, k, i);
                    sum ++;
                }
            }
        }
        ret = max(sum, ret);
    }
    cout << ret;
    return 0;
}