package com.company;

public class Service {


    public String szyfrowanie(Osoba osoba){
        osoba.setFirstName(szyfrowanie(osoba.getFirstName()));
        osoba.setLastName(szyfrowanie(osoba.getLastName()));
        return osoba.toString();
    }


    public String szyfrowanie(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i< string.length() ; i ++ ){
            if(i == 0 || i + 3 >= string.length()){
                stringBuilder.append(string.charAt(i));
            } else {
                stringBuilder.append("*");
            }
        }

        return stringBuilder.toString();
    }
}
