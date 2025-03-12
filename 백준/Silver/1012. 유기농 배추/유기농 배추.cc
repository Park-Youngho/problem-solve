#include <bits/stdc++.h>
using namespace std;
int t, n,m,k;
int ret = 0;

int dy[] = { -1,0,1,0 };
int dx[] = { 0, 1, 0, -1 };
int arr[54][54];
int visited[54][54];

void go(int y, int x){
    visited[y][x] =1;
    for(int i=0; i<4; i++){
        int ny = y + dy[i];
        int nx = x + dx[i];
        if(ny >=n || nx >=m || ny<0 || nx <0 || visited[ny][nx]
            || !arr[ny][nx]) continue;
        go(ny,nx);
    }
}
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> t;
    while(t--){
        ret=0;
        cin >> n >> m >> k;
        memset(arr,0,sizeof(arr));
        memset(visited,0,sizeof(visited));
        while(k--){
            int a, b;
            cin >> a >> b;
            arr[a][b] = 1;
        }
        for(int i=0; i<n; i++){
             for(int j=0; j<m; j++){
                 if(visited[i][j] || arr[i][j]==0) continue;
                 go(i,j);
                 ret++;
             }   
        }
        cout << ret << "\n";
    }
}
