import java.util.Scanner;

import org.example.Grafo;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean loop = true;
        Grafo grafo = null;

        do {
            System.out.println("\nBem vindo ao projeto grafos 2023\n" +
                    "Selecione uma opção: \n1: novo grafo\n2: Abrir grafo\n3: sair");

            String teste = leitor.nextLine();

            if (teste.matches("[1-3]")) {
                int seleciona = Integer.parseInt(teste);
                switch (seleciona) {
                    case 1:
                        System.out.println("\nOpção selecionada: Novo Grafo");
                        grafo = Grafo.criarGrafo();
                        break;
                    case 2:
                        System.out.println("\nOpção selecionada: Abrindo Grafo");
                        if (grafo != null) {
                            System.out.println(grafo);
                        }
                        break;
                    case 3:
                        System.out.println("\nSaindo do programa");
                        loop = false;
                        break;
                }
            } else {
                System.out.println("\nOpção Invalida");
            }
        } while (loop);
    }
}
