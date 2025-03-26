#include <bits/stdc++.h>
using namespace std;
int n;
int arr[1004];
int ret = 0;
int cnt[1004];
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    for(int i=0; i<n; i++){
        int maxValue = 0;
        for(int j=0; j<i; j++){
            if(arr[i] > arr[j] && maxValue < cnt[j]) maxValue = cnt[j];
        }
        cnt[i] = maxValue +1;
        ret = max(cnt[i], ret);
    }
    cout << ret;
    return 0;
}