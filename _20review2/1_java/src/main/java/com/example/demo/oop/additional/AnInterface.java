package com.example.demo.oop.additional;


//Sebuah kontrak (sering terjadi ketika implementasi existing lbirary, kita ingin
//modifikasi prilakunya, agar dapat berjalan dengan benar, minimal
// kita harus mengikuti kontrak yang ada.
public interface AnInterface {

    void interfaceAMethod1();

    void interfaceAMethod2();

    default void interfaceMethod3(){
        System.out.println("hello");
    }
}
