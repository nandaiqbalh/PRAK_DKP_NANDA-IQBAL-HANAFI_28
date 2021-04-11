# Function dengan non return type
def non_return_type (praktikan1, praktikan2):
    print(f"Selamat datang di praktikum DKP 2021 {praktikan1} dan {praktikan2} ")

# Fungsi dengan return type
def return_type (shift):
    print(f"Shift kalian adalah ", shift)
    if (shift == 1) or (shift == 2) : 
        return print(f"Fungsi return mengembalikan nilai menjadi ", shift * 2)
    else:
        return print("Tidak ada shift tersebut")

# Function dengan Arbitrary Type
def arbitrary_func(*penutup):
    for nama in penutup:
        print("Terimakasih", nama)

#Anonymous Function
anonim_func = lambda praktikan1, praktikan2, kelompok: print(f"Ini adalah percobaan {praktikan1} dan {praktikan2} kelompok ", kelompok )


# PEMANGGILAN FUNGSI
non_return_type("Nanda", "Iqbal")
return_type(2)
arbitrary_func("Nanda", "Iqbal", "Hanafi", "Halo bro")
anonim_func("Nanda", "Iqbal", 28)