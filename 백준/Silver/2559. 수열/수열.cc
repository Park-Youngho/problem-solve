#define _CRT_SECURE_NO_WARNINGS
#include <bits/stdc++.h>

using namespace std;
long long int n, m,sum, num;
int a[100004], psum[100004];
string s,ret1,ret2;
int ret = -987654321;
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> n >> m;
	for (int i = 1; i <= n; i++) {
		cin >> a[i];
	}
	for (int i = 1; i <= n; i++) {
		psum[i] = psum[i - 1] + a[i] ;
	}

	for (int i = m; i <= n; i++) {
		ret = max(psum[i] - psum[i - m], ret);
	}
	cout << ret;
}
