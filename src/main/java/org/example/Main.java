package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        while (true) {
            System.out.println("Bem vindo ao projeto grafos 2023");
            System.out.println("Selecione uma opção: ");
            System.out.println("1: novo grafo/n2: Abrir grafo/n3: sair");
            Int seleciona = opcao.nextInt();
            switch (seleciona){
                case 1:
                    System.out.println("Opção selecionada: novo grafo");
                    System.out.println("Informe o número de vértices: ");
                    Scanner inputVertices = new Scanner(System.in);
                    int qtdVertices = inputVertices.nextInt();
                    System.out.println("Informe o número de arestas: ");
                    Scanner inputArestas = new Scanner(System.in);
                    int qtdArestas = inputArestas.nextInt();
                    System.out.println("Informe se é Orientado ou não: ");
                    Scanner inputOrientado = new Scanner(System.in);
                    Boolean orientado = inputVertices.nextInt();
            }
        }
    }
}
