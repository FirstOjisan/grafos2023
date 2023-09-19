package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Grafo {
    ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
    ArrayList<Aresta> listaArestas = new ArrayList<Aresta>();
    boolean orientado;
    boolean valorado;

    public Grafo(Boolean orientado, Boolean valorado) {

        this.orientado = orientado;
        this.valorado = valorado;

    }

    public static Grafo criarGrafo() {
        Boolean loop = true;
        Boolean orientado;
        Boolean valorado;
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDeseja Criar um Grafo Orientado? S/N");
        String seleciona = leitor.nextLine();
        if (seleciona.matches("(?i)s")) {
            orientado = true;
        } else {
            orientado = false;
        }

        System.out.println("\nDeseja Criar um Grafo Valorado? S/N");
        leitor.nextLine();
        if (seleciona.matches("(?i)s")) {
            valorado = true;
        } else {
            valorado = false;
        }

        Grafo grafo = new Grafo(orientado, valorado);

        do {
            System.out.println(
                    "Escolha uma das opções:\n1:Adicionar Vértice\n2:Adicionar Aresta(Necessário Existir dois Vértices)"
                            + "\n3:Finalizar");
            String teste = leitor.nextLine();
            if (teste.matches("[1-3]")) {
                int opcao = Integer.parseInt(teste);
                switch (opcao) {
                    case 1:
                        System.out.println("\nOpção selecionada: Adicionar Vértice");
                        grafo.listaVertices.add(new Vertice());
                        break;
                    case 2:
                        System.out.println("\nOpção selecionada: Adicionar Aresta");
                        grafo.adicionarAresta();
                        break;
                    case 3:
                        System.out.println("\nGrafo Criado com Sucesso");
                        loop = false;
                        break;
                }
            } else {
                System.out.println("\nOpção Invalida");
            }
        } while (loop);

        return grafo;
    }

    public Boolean identificarVertice(String verticeComparado) {
        Boolean resultado = false;

        for (Vertice vertice : listaVertices) {
            if (vertice.id.equals(verticeComparado)) {
                resultado = true;
            }
        }

        return resultado;
    }

    public void adicionarAresta() {
        Vertice vertice1;
        Vertice vertice2;
        Aresta aresta;
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite o Identificador do Vertice de Origem");
        String seleciona = leitor.nextLine();

        if (identificarVertice(seleciona)) {
            vertice1 = new Vertice(seleciona);
        } else {
            return;
        }

        System.out.println("\nDigite o Identificador do Vertice de Destino");
        seleciona = leitor.nextLine();

        if (identificarVertice(seleciona)) {
            vertice2 = new Vertice(seleciona);
        } else {
            return;
        }

        aresta = new Aresta(vertice1, vertice2);
        listaArestas.add(aresta);
    }

    public String toString() {  
        return "Valor: "+valorado+"\nOrientação: "+orientado+"\nVertices: "
        +listaArestas+"\nVertices"+listaVertices+"\nOrdem :"+ordem();  
    }

    int ordem() {
        return listaVertices.size();
    }

    int grau() //
    {
        return 0;
    }
}
