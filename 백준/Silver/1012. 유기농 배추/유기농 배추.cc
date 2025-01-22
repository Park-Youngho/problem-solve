#define _CRT_SECURE_NO_WARNINGS
#include <bits/stdc++.h>

using namespace std;
int n,t,k, m,sum, num;
string s;
int a[54][54], visited[54][54];
int dy[] = { -1,0,1,0 };
int dx[] = { 0, 1, 0, -1 };

void go(int y, int x) {
	visited[y][x] = 1;
	for (int i = 0; i < 4; i++) {
		int ny = y + dy[i];
		int nx = x + dx[i];
		if (ny < 0 || nx < 0 || ny >= n || nx >= m || visited[ny][nx]) continue;
		if (!a[ny][nx]) continue;
		go(ny, nx);
	}
}
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> t;
	while (t--) {
		memset(a, 0, sizeof(a));
		memset(visited, 0, sizeof(visited));
		int ret = 0;
		cin >> n >> m >> k;
		int c, d;
		vector<pair<int, int>>v;
		for (int i = 0; i < k; i++) {
			cin >> c >> d;
			a[c][d]= 1;
			v.push_back({ c,d });
		}
		for (int i = 0; i < v.size(); i++) {
			if (visited[v[i].first][v[i].second]) continue;
			if (!a[v[i].first][v[i].second])continue;
			go(v[i].first, v[i].second);
			ret++;
			
		}
		cout << ret << '\n';
	}
	
}
