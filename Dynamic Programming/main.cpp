#include <iostream>
using namespace std;

class Counter {
    static int count;   // declaration
public:
    Counter() { count++; }
    static int getCount() { return count; }
};

// definition of static member
int Counter::count = 0;

int main() {
    Counter c1, c2, c3;
    cout << "Objects created = " << Counter::getCount() << endl;
}`