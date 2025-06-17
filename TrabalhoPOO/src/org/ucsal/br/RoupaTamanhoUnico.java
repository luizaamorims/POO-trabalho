package org.ucsal.br;

public class RoupaTamanhoUnico extends Peca implements Item {

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    public void venda() {
        System.out.println("Venda de roupa tamanho único: " + getDescricao());
        if (getQuantidade() > 0) {
            setQuantidade(getQuantidade() - 1);
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente para venda.");
        }
    }

    public boolean estaDisponivel() {
        if (getQuantidade() > 0) {
            System.out.println("Roupa de tamanho unico" + getDescricao() + " está disponível.");
            return true;
        } else {
            System.out.println("Roupa de tamanho unico " + getDescricao() + " não está disponível.");
            return false;
        }
    }

    public int getQuantidadeEmEstoque() {
        return getQuantidade();
    }

}
