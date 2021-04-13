#include <iostream>
#include <string>
using namespace std;
class MyClass {
public: void non_return_method(string kelompok) {
    cout << "halo, kami dari kelompok " << kelompok;
    }
int with_return_method(int angka) {
    return angka*angka;
    }   
};
int main() {
MyClass myObj;
myObj.non_return_method("28");
cout << "\nhasil kali 28 dengan 28 adalah " << myObj.with_return_method(28);
return 0;
}