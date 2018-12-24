#include <iostream>
#include<iomanip>

using std::cin;
using std::cout;

int main(int argc, char** argv) {
    int x, y;
    cin >> x >> y;
    
    int num_shields;
    cin >> num_shields;
    
    double time = 0, shield_height = 0;
    
    for(int i = 0; i < num_shields; i++) {
        int lower,upper;
        double factor;
        cin >> lower >> upper >> factor;
        
        shield_height += (upper - lower);
        time += (upper - lower) * factor;
    }
    
    double non_shield_height = y - shield_height;
    time += non_shield_height;
    double velocity = x / time;
    
    cout << std::setprecision(12);
    cout << velocity;

    return 0;
}
