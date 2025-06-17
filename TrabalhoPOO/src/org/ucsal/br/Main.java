package org.ucsal.br;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] itens = new Item[5];

        itens[0] = new Acessorio("Óculos de Sol", 10, 2, 20);
        itens[1] = new RoupaPMG("Camisa quadriculada", 5, 10, 15, 2, 20);
        itens[2] = new RoupaTamanhoUnico("Camisa do Bahia", 8, 2, 20);
        itens[3] = new RoupaPMG("Calça Jeans", 3, 7, 12, 2, 20);
        itens[4] = new Acessorio("Cinto de Couro", 6, 2, 20);

        int opcao = 10;

        do {
            System.out.println("------------MENU------------");
            System.out.println("0 - óculos de Sol");
            System.out.println("1 - Camisa quadriculada");
            System.out.println("2 - Camisa do Bahia");
            System.out.println("3 - Calça Jeans");
            System.out.println("4 - Cinto de Couro");
            System.out.println("5 - Sair do sistema ");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0:
                    itens[0].venda();
                    itens[0].reposicaoEstoque();
                    break;
                case 1:
                    itens[1].venda();
                    itens[1].reposicaoEstoque();
                    break;
                case 2:
                    itens[2].venda();
                    itens[2].reposicaoEstoque();
                    break;
                case 3:
                    itens[3].venda();
                    itens[3].reposicaoEstoque();
                    break;
                case 4:
                    itens[4].venda();
                    itens[4].reposicaoEstoque();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    System.out.println("Estoque atual dos produtos: ");
                    System.out.println("-----------------------------");
                    System.out.println("Óculos de Sol: " + itens[0].getQuantidadeEmEstoque());
                    System.out.println("Camisa quadriculada: " + itens[1].getQuantidadeEmEstoque());
                    System.out.println("Camisa do Bahia: " + itens[2].getQuantidadeEmEstoque());
                    System.out.println("Calça Jeans: " + itens[3].getQuantidadeEmEstoque());
                    System.out.println("Cinto de Couro: " + itens[4].getQuantidadeEmEstoque());
                    System.out.println("-----------------------------");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        sc.close();

    }

}
