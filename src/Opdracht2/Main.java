package Opdracht2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        //snacks.add(new Snack("Frituur", 17, 5.50));
        //snacks.add(new Snack("Doner", 55, 4.50));
        //snacks.add(new Snack("Kebeb", 74, 4.00));

        //Collections.sort(snacks);

        //for (Snack o:snacks){
         //   System.out.println(o.getNaam());
        //}

        Snack s1 = new Snack("Coca", 17, 5.50);
        Snack s2 = new Snack("plat water", 55, 4.50);
        Snack s3 =new Snack("Kebeb", 74, 4.00);

        SnackSingleton.getINSTANCE().addSnack(s1);
        SnackSingleton.getINSTANCE().addSnack(s2);
        SnackSingleton.getINSTANCE().addSnack(s3);
        System.out.println(SnackSingleton.getINSTANCE().getSnackSet());



    }
}
