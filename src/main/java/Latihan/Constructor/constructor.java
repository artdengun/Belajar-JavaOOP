package Latihan.Constructor;

public class constructor {

    String nama;
    int umur ;

    constructor(){
        System.out.println("ini adalah constructor tanpa parameter 1 ");
    }

    constructor(String nama){
        System.out.println("ini adalah constructor dengan parameter nama 2 " + nama);
    }

    constructor(String nama, int umur){
        System.out.println("ini adalah constructoer dengan nama dan umur 3" + nama + umur );
    }
}
