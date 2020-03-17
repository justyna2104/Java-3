package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("osoby.txt");
        float maxEff = 0;
        Scanner scanner = new Scanner(file);
        ArrayList<Osoba> list = new ArrayList<>();
        while (scanner.hasNext()){
            Osoba osoba = new Osoba();
            osoba.setFirstName(scanner.next());
            osoba.setLastName(scanner.next());
            osoba.setAge(scanner.nextInt());
            osoba.setEff(scanner.nextFloat());
            list.add(osoba);
        }

        for(Osoba osoba : list){
            if(osoba.getEff() > maxEff){
                maxEff = osoba.getEff();
            }
        }

        ArrayList<Osoba> osobyDoZapisania = new ArrayList<>();
        for (Osoba osoba : list){
            if(osoba.getFirstName().length() > 3)
                if(osoba.getLastName().endsWith("ski"))
                    if(osoba.getEff() == maxEff)
                        osobyDoZapisania.add(osoba);
        }

        Service service = new Service();
        File fileMax = new File("osoby" + ".max"+".txt");
        PrintWriter write = new PrintWriter("osoby" +".max"+".txt");

        for(Osoba osoba : osobyDoZapisania){
            write.println(service.szyfrowanie(osoba));
        }
        write.close();

    }






}
