#include <bits/stdc++.h>
using namespace std;
string str;
vector<string> v;
string a;
int main() {
	cin >> str;
	a = str;
	reverse(str.begin(), str.end());
	if (a == str) {
		cout << 1;
	}
	else {
		cout << 0;
	}

}