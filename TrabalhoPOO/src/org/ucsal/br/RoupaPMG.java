package org.ucsal.br;

import java.util.Scanner;

public class RoupaPMG implements Item {

    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public boolean estaDisponivel() {
        if (getQuantidadeEmEstoque() > 0) {
            ;
            System.out.println("Roupa " + getDescricao() + " está disponível.");
            return true;
        } else {
            System.out.println("Roupa " + getDescricao() + " não está disponível.");
            return false;
        }
    }

    public int getQuantidadeEmEstoque() {
        return getQuantidadeG() + getQuantidadeM() + getQuantidadeP();
    }

    public void venda() {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        int quantidadeVenda;
        boolean vendaRealizada = false;

        while (vendaRealizada == false) {
            System.out.println("Qual tamanho deseja vender? (1-P, 2-M, 3-G)");
            tamanho = sc.nextInt();

            System.out.print("Digite a quantidade que deseja vender: ");
            quantidadeVenda = sc.nextInt();

            switch (tamanho) {
                case 1:
                    if (quantidadeP >= quantidadeVenda) {
                        quantidadeP -= quantidadeVenda;
                        System.out.println("Venda realizada com sucesso! Tamanho P - Quantidade: " + quantidadeVenda);
                        System.out.println("Estoque atual P: " + quantidadeP);
                        vendaRealizada = true;
                    } else {
                        System.out.println("Estoque insuficiente para tamanho P.");
                        System.out.println("Estoque atual P: " + quantidadeP);
                    }
                    break;
                case 2:
                    if (quantidadeM >= quantidadeVenda) {
                        quantidadeM -= quantidadeVenda;
                        System.out.println("Venda realizada com sucesso! Tamanho M - Quantidade: " + quantidadeVenda);
                        System.out.println("Estoque atual M: " + quantidadeM);
                        vendaRealizada = true;
                    } else {
                        System.out.println("Estoque insuficiente para tamanho M.");
                        System.out.println("Estoque atual M: " + quantidadeM);
                    }
                    break;
                case 3:
                    if (quantidadeG >= quantidadeVenda) {
                        quantidadeG -= quantidadeVenda;
                        System.out.println("Venda realizada com sucesso! Tamanho G - Quantidade: " + quantidadeVenda);
                        System.out.println("Estoque atual G: " + quantidadeG);
                        vendaRealizada = true;
                    } else {
                        System.out.println("Estoque insuficiente para tamanho G.");
                        System.out.println("Estoque atual G: " + quantidadeG);
                    }
                    break;
                default:
                    System.out.println("Tamanho inválido.");
                    break;
            }
        }
    }

    public void reposicaoEstoque() {
        if (getQuantidadeEmEstoque() < estoqueMinimo) {
            System.out.println("Repondo estoque de " + getDescricao() + "...");
            quantidadeP = estoqueMaximo / 3;
            quantidadeM = estoqueMaximo / 3;
            quantidadeG = estoqueMaximo / 3;
        } else {
            System.out.println("Estoque de " + getDescricao() + " está adequado!");
            System.out.println();
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }

    public void setQuantidadeG(int quantidadeG) {
        this.quantidadeG = quantidadeG;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

}
