# 📚 ESIII Teste

Este README fornece uma descrição geral dos testes que devem ser realizados no sistema de biblioteca, utilizando técnicas como Tabela de Decisões, Partições de Equivalência e Análise do Valor Limite.

## 🚀 Testes do Sistema de Biblioteca

### 1. Testes no Fluxo Principal

#### 1.1 O aluno apresenta os livros ao funcionário e sua identificação.

- Teste 1: Identificação válida e livros corretos.
- Teste 2: Identificação inválida ou livros inválidos.

#### 1.2 O funcionário insere a identificação e os livros no sistema.

- Teste 3: Entrada correta.
- Teste 4: Entrada incorreta.

#### 1.3 O sistema verifica se o aluno está cadastrado.

- Teste 5: Aluno cadastrado corretamente.
- Teste 6: Aluno não cadastrado corretamente.

#### 1.4 O sistema verifica se o aluno possui pendências.

- Teste 7: Aluno com pendências corretamente.
- Teste 8: Aluno sem pendências corretamente.

#### 1.5 O sistema cria um empréstimo.

- Teste 9: Sistema cria um empréstimo corretamente.

#### 1.6 Para Cada Livro.

- Teste 10: Sistema verifica se o livro pode ser emprestado corretamente.
- Teste 11: Sistema cria um item de empréstimo corretamente.
- Teste 12: Sistema associa o livro ao item corretamente.

#### 1.7 O sistema Calcula a Data de Devolução.

- Teste 13: Sistema calcula a data de devolução corretamente para diferentes números de livros.

#### 1.8 O sistema grava os dados do empréstimo.

- Teste 14: Sistema grava os dados do empréstimo corretamente.

#### 1.9 O sistema imprime os dados do empréstimo.

- Teste 15: Sistema imprime os dados do empréstimo corretamente.

### 2. Testes nos Fluxos Alternativos

- Teste 16: Aluno não cadastrado.
- Teste 17: Aluno com débitos.
- Teste 18: Livro reservado.
- Teste 19: Livro não pode ser emprestado.

### 3. Testes Adicionais

#### 3.1 Testes de Validação

- Teste 20: Validação de Identificação inválida.
- Teste 21: Validação de Livro inexistente.
- Teste 22: Validação de Quantidade de Livros excedida.
- Teste 23: Lançamento de Exceção durante o processo de empréstimo.
- Teste 24: Validação de Data de Devolução inválida.
- Teste 25: Validação de Prazo de Devolução menor que o permitido.
- Teste 26: Validação de Pendências do Aluno.
- Teste 27: Validação de Reservas do Livro.
- Teste 28: Validação de Empréstimos máximos do Aluno.
- Teste 29: Validação de Dados do Empréstimo em formato inválido.

## Execução dos Testes

Para executar os testes, siga os seguintes passos:

1. Certifique-se de que o ambiente de desenvolvimento esteja configurado corretamente.
2. Execute os casos de teste definidos utilizando uma estrutura de testes, como JUnit.
3. Analise os resultados e verifique se o sistema atende aos requisitos especificados.

Lembre-se de ajustar os números de teste conforme necessário para refletir o conjunto de testes que você planeja executar.


## 🛠️ Tecnologias Utilizadas

- **Java:** Linguagem de programação principal para implementação do projeto.
- **JUnit:** Um framework de testes para Java.
- **Maven:** Uma ferramenta de gerenciamento e compreensão de projetos.

## 📋 Como Executar os Testes

Para executar os testes deste projeto, siga estas etapas:

1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Execute o seguinte comando Maven:
   ```bash
   mvn test
   ```

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar solicitações de pull.

Obrigado por conferir este projeto! 🚀
