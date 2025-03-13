#define _CRT_SECURE_NO_WARNINGS
#include <bits/stdc++.h>

using namespace std;
int n, m,sum;
vector<int> v;
int idx1,idx2;
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	for (int i = 0; i < 9; i++) {
		cin >> n;
		v.push_back(n);
	}
	for (int i : v) {
		sum += i;
	}
	sort(v.begin(), v.end());
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < i; j++) {
			if(v[i] + v[j] == sum-100){
				idx1 = i;
				idx2 = j;
			}
		}
	}
	for (int i = 0; i < 9; i++) {
		if (i == idx1 || i == idx2) continue;
		cout << v[i] <<'\n';
	}
}
