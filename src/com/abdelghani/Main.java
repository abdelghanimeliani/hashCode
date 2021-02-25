package com.abdelghani;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        ArrayList<Streets> streetsMain = new ArrayList<Streets>();
        ArrayList<Car> carsMain = new ArrayList<Car>();
        int rest =0;
        int duration ,nbrIntersection , nbStreet , nbCase ,bonus;
        FileInputStream filea = null;
        try {
           filea = new FileInputStream("/home/abdelghani/Téléchargements/a.txt");
        }catch (Exception e){
            System.out.println("err");
        }
        Scanner cs = new Scanner(filea);

        String s = cs.nextLine();
        String[] tab = s.split(" ");

        //======================
        duration = Integer. parseInt(tab[0]);
        nbrIntersection= Integer. parseInt(tab[1]);
        nbStreet= Integer. parseInt(tab[2]);
        nbCase= Integer. parseInt(tab[3]);
        bonus= Integer. parseInt(tab[4]);

        int iLoop=0;

        while (iLoop!=nbStreet){
          s = cs.nextLine();
          tab = s.split(" ");

          Streets streets = new Streets(Integer.parseInt(tab[0]),
                  Integer.parseInt(tab[1]),
                  Integer.parseInt(tab[3]),
                  tab[2]);
          streetsMain.add(streets);
        }



        while (iLoop!=nbCase){
            s = cs.nextLine();
            tab = s.split(" ");
            ArrayList<String> streetsCars = new ArrayList<String>();
            streetsCars.add(tab[1]);
            for (int i=2 ; i<=Integer.parseInt(tab[0]);i++){
                streetsCars.add(tab[i]);
                for(int j=0 ; j<streetsMain.size();j++){
                    if (streetsMain.get(j).name.equals(tab[i])){
                        rest=rest+streetsMain.get(j).l;
                    }
                }
            }
            Car car =new Car(Integer.parseInt(tab[0]),streetsCars,rest);
            carsMain.add(car);
        }

    }
}
