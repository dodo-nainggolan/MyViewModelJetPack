package com.example.myviewmodel2;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    int hasil = 0;

    void calculate(String lebar, String tinggi, String panjang) {
        hasil = Integer.parseInt(lebar) * Integer.parseInt(panjang) * Integer.parseInt(tinggi);
    }
}
