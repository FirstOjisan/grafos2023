package org.example;

import java.util.ArrayList;

public class Grafo {
    ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
    ArrayList<Aresta> listaArestas = new ArrayList<Aresta>();
    boolean orientado; //
    boolean valorado;

    Grafo (){

    }
    int ordem()
    {
        return listaVertices.size();
    }
    int grau() //
     {
         return 0;
     }
}
