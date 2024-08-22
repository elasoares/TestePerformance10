# Cadeira: Desenvolvimento de Serviços Web e Testes com Java
## Teste performance 1
## Exercício 10: Verificação de Nome na Classe `Aluno` e Teste de Unidade

### Descrição

Neste exercício, o objetivo é ampliar a funcionalidade da classe `Aluno` desenvolvida anteriormente. Agora, será necessário implementar uma validação para o nome do aluno e criar um novo teste de unidade para verificar essa validação.

### Objetivo

O objetivo principal é garantir que o nome do aluno atenda aos seguintes critérios ao ser definido:
1. Deve possuir, pelo menos, quatro caracteres.
2. Deve conter dois nomes, ou seja, o nome e o sobrenome.

Caso o nome não atenda a esses critérios, o método `setNome` deve lançar uma exceção específica. A classe de testes deve verificar esse comportamento.

### Especificações

1. **Classe `Aluno`**:
   - A classe deve ser estendida para incluir a validação do nome do aluno.
   - O método `setNome` deve verificar se o nome possui pelo menos quatro caracteres e se contém dois nomes (nome e sobrenome).
   - Se o nome não atender a esses critérios, o método deve lançar uma exceção.

2. **Classe de Testes**:
   - Desenvolva uma classe de testes utilizando JUnit para verificar se o método `setNome` lança uma exceção quando o nome não atende aos critérios estabelecidos.
   - A classe de testes deve capturar e tratar a exceção, garantindo que o método está funcionando corretamente.

### Considerações

Este exercício reforça a prática de validação de dados de entrada e a importância de testes de unidade para assegurar a qualidade do código. A verificação de nomes é essencial em muitos sistemas e deve ser feita com cuidado para evitar erros de dados.
