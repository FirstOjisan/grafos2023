package org.example;

public class Aresta {
    Vertice origem, destino;
    double valor;

    public Aresta(Vertice origem, Vertice destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public String toString() {

        return "(" + origem.id + ")" + "(" + destino.id + ")";
    }
}
