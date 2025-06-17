package org.ucsal.br;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    public void venda() {
        Scanner sc = new Scanner(System.in);
        int quantidadeVenda;

        do {
            System.out.print("Digite a quantidade que deseja vender: ");
            quantidadeVenda = sc.nextInt();

            if (quantidadeVenda > getQuantidade()) {
                System.out.println("Quantidade insuficiente em estoque para venda.");
                System.out.println("Estoque atual: " + getQuantidade());
            }
        } while (quantidadeVenda > getQuantidade());

        setQuantidade(getQuantidade() - quantidadeVenda);
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Estoque atual: " + getQuantidade());
    }

    public boolean estaDisponivel() {
        if (getQuantidade() > 0) {
            System.out.println("Acessório " + getDescricao() + " está disponível.");
            return true;
        } else {
            System.out.println("Acessório " + getDescricao() + " não está disponível.");
            return false;
        }
    }

    public int getQuantidadeEmEstoque() {
        return getQuantidade();
    }

}
