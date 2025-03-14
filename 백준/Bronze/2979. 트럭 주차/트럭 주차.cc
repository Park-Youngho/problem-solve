#include <bits/stdc++.h>
using namespace std;

int cnt[100] = { 0 };
int sum = 0;
int main()
{	
	int k = 3;
	int A, B, C, N, M;
	cin >> A >> B >> C;
	
	while (k > 0)
	{
		cin >> M >> N;
		for (int i = M; i < N; i++)
		{
			cnt[i]++;
		}k--;
	}
	for (int i : cnt)
	{
		if (i == 1)
		{
			sum += i * A;
		}
		else if (i == 2) sum += i * B;
		else if (i == 3) sum += i * C;
	}
	cout << sum;
}