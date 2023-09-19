package org.example;

import java.util.Scanner;

public class Vertice {
    String id;
    int grau;

    public Vertice() {
        Scanner leitor = new Scanner(System.in);
            System.out.println("\nDigite a identificação do Vértice");
            String seleciona = leitor.nextLine();
            this.id = seleciona;
            this.grau =0;
    }

    public Vertice(String id) {
            this.id = id;
    }


    public String toString(){

        return id+" Grau: "+grau;
    }
}
