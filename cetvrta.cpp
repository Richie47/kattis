#include <iostream>
#include <array>

using std::cin;
using std::cout;

int main(int argc, char** argv){
    
    std::array<int, 2> a;
    std::array<int, 2> b;
    std::array<int, 2> c;
    
    cin >> a[0] >> a[1];
    cin >> b[0] >> b[1];
    cin >> c[0] >> c[1];
    
   for(int i = 0; i < a.size(); i++) {
       if(a[i] == b[i])
            cout << c[i] << " ";
        
       else if(a[i] == c[i])
            cout << b[i] << " ";
        else
            cout << a[i] << " ";
   }
    
    return 0;
    
}
