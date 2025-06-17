package org.ucsal.br;

public interface Item {

    boolean estaDisponivel();

    int getQuantidadeEmEstoque();

    String getDescricao();

    void venda();

    void reposicaoEstoque();

}

