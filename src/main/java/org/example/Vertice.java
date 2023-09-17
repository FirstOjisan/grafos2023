package org.example;

public class Vertice {
    public static void setCont(int cont) {
        Vertice.cont = cont;
    }

    static int cont;

    Vertice(){
        cont++;
    }
}
