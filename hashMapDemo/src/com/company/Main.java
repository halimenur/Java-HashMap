package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk=new HashMap<String,String>();
        //Yeni eleman ekleme
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        //Bu ifadeleri tersten yazar
       // System.out.println(sozluk);

//table'ın anlamını getirdi
      //  System.out.println(sozluk.get("table"));

        //Silme işlemi gerçekleştiği için null değerini döndürür
        //sozluk.remove("table");
        //System.out.println(sozluk.get("table"));

        //Sözlükteki tüm verileri silme
        //sozluk.clear();

        //Sözlükte kaç eleman olduğunu döndürür
        //sozluk.size();

        //Sözlükteki elemanları dolaşma
        //keySet() verileri bize liste olarak verir
        //Sıra ile gelmez keySet'de
//        for(String item:sozluk.keySet()){
//            System.out.println(item);
//        }

        //Kelimlerin karşılığını yazmak istersek
        for(String item:sozluk.keySet()){
            System.out.println("Eleman: "+item+" Değer: "+sozluk.get(item));
        }


    }
}
