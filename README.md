# Sistema de Controle de Estoque

## Descrição
Sistema desenvolvido em Java para gerenciamento de estoque de produtos diversos, implementando conceitos de Programação Orientada a Objetos como herança, polimorfismo, classes abstratas e interfaces.

## Objetivos do Projeto
- Implementar um sistema de controle de estoque para 5 produtos
- Aplicar conceitos de POO: herança, polimorfismo, classes abstratas e interfaces
- Desenvolver uma aplicação interativa com menu de opções

## Estrutura do Sistema

### Hierarquia de Classes
O sistema é baseado em uma hierarquia de classes com:
- **Classe abstrata `Peca`**: Classe base que define a estrutura comum
- **Classes filhas**: `Acessorio`, `RoupaTamanhoUnico` e `RoupaPMG`

### Funcionalidades Principais

#### Classe Abstrata Peca
- Construtor que recebe descrição, quantidade em estoque, estoque mínimo e máximo
- Método abstrato `venda()` (implementado pelas classes filhas)
- Método `reposicaoEstoque()`: verifica se estoque está abaixo do mínimo e repõe automaticamente
- Métodos get/set necessários

#### Classes Implementadas
- **Acessorio**: Permite venda de quantidade variável inserida pelo usuário
- **RoupaTamanhoUnico**: Venda fixa de 1 unidade por transação
- **RoupaPMG**: Implementação específica para roupas com tamanhos P, M, G

#### Interface
Sistema implementa interface com métodos para:
- Identificação do produto (ID, nome, descrição, categoria)
- Controle de preço
- Gerenciamento de estoque (quantidade, adição, remoção)
- Verificação de disponibilidade
- Unidade de medida

### Funcionalidades da Aplicação
- **Menu interativo**: Exibe lista de produtos com índices para seleção
- **Sistema de vendas**: Processa vendas específicas para cada tipo de produto  
- **Reposição automática**: Verifica e repõe estoque quando necessário
- **Relatório final**: Mostra estoque atual de todos os produtos ao encerrar

### Exemplo de Menu
```
0 – Camisa
1 – Saia  
2 – Cinto
3 – Pulseira
4 – Saída de praia
5 – Sair do sistema
```

## Especificações Técnicas
- **Linguagem**: Java
- **Pacote**: org.ucsal.br
- **Estrutura**: Array de 5 posições utilizando polimorfismo
- **Conceitos aplicados**: Classes abstratas, interfaces, herança, polimorfismo

## Como Usar
1. Execute a aplicação
2. Escolha um produto pelo número do menu
3. Realize a venda (quantidade varia conforme tipo do produto)
4. Sistema automaticamente verifica e repõe estoque se necessário
5. Escolha opção 5 para sair e visualizar relatório final

## Estrutura do Código
- Implementação sem uso de anotações (ex: @Override)
- Código limpo sem comentários explicativos
- Aplicação de boas práticas de POO
