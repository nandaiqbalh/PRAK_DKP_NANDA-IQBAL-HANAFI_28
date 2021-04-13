#include <iostream>
#include <string>
using namespace std;

// membuat kelas bernama MyClas
class MyClass {

// membuat non return method
public: void non_return_method(string kelompok) {
    cout << "Halo, kami dari kelompok " << kelompok;
    }

// membuat return method
int with_return_method(int angka) {
    return angka*angka;
    }   
};

// ini adalah main-function
int main() {
    // membuat object bernama "myObj" dari kelas "MyClass"
    MyClass myObj;

    // panggil method lewat object
    myObj.non_return_method("28");
    cout << "\nHasil kali 28 dengan 28 adalah " << myObj.with_return_method(28);
    return 0;
}