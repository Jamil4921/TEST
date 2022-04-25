package Opdracht2;

import java.util.TreeSet;

public final class SnackSingleton {

    private static final  SnackSingleton INSTANCE = new SnackSingleton();

    private SnackSingleton(){

    }

    public static SnackSingleton getINSTANCE(){
        return INSTANCE;
    }

    private static TreeSet<Snack> snackSet = new TreeSet<>();

    public void addSnack(Snack snack){
        snackSet.add(snack);
    }

    public void removeSnack(Snack snack){
        snackSet.remove(snack);
    }

    public TreeSet<Snack> getSnackSet() {
        return snackSet;
    }



}
