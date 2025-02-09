#include <iostream>
#include <vector>

using namespace std;

int n, m;
vector<int> v;

void go(int depth) {
    if (depth==m) { 
        for (int num : v) {
            cout << num << ' ';
        }
        cout << '\n';
        
        return;
    }

    for (int i = 1; i <= n; i++) {
        v.push_back(i); 
        go(depth+1); 
        v.pop_back();   
    }
}

int main() {
    ios::sync_with_stdio(false);

    cin >> n>> m;
    go(0);  
}
