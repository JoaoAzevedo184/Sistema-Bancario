# Criando um Banco Digital com Java

---

## Sobre

Este projeto é um sistema bancário digital desenvolvido em Java. Ele permite que os usuários realizem operações bancárias básicas, como saques, depósitos, transferências e consulta de informações da conta.

---

## Estrutura do projeto

O projeto está organizado da seguinte forma:

- `src/`: Contém os arquivos de código-fonte.
  - `model/`: Contém as classes de modelo, como `Banco`, `Cliente`, `Conta`, `ContaCorrente`, `ContaPoupanca`, e interfaces como `IConta` e `IBanco`.
  - `service/`: Contém as classes de serviço, como `MenuNavigation`.
  - `utils/`: Contém utilitários, como a classe `Utils`.
- `README.md`: Este arquivo de documentação.

---

## Funcionalidades

- **Criar Conta**: Permite criar contas correntes e poupança para os clientes.
- **Adicionar Cliente**: Permite adicionar novos clientes ao banco.
- **Sacar**: Permite que o cliente realize saques de sua conta.
- **Depositar**: Permite que o cliente realize depósitos em sua conta.
- **Transferir**: Permite que o cliente transfira dinheiro para outra conta.
- **Consultar Informações**: Permite que o cliente consulte as informações de sua conta.

---

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver o sistema.
- **JDK 17**: Versão do Java Development Kit utilizada.
- **IDE**: Intellij.
- **Git** - Controle de versão para gerenciamento do código-fonte.  

---

## 🎯 Conceitos Utilizados

- **Programação Orientada a Objetos (POO)**: Utilização de classes, objetos, herança, polimorfismo e encapsulamento.
- **Tratamento de Exceções**: Captura e tratamento de exceções para garantir a robustez do sistema.
- **Coleções**: Utilização de listas para gerenciar contas e clientes.

---

## 🤝 Contribuição

---

Sinta-se à vontade para contribuir! Para isso:

1. Faça um **fork** do repositório.
2. Crie uma nova branch: `git checkout -b minha-feature`
3. Faça suas alterações e **commit**: `git commit -m 'Adicionando nova funcionalidade'`
4. Envie para o repositório remoto: `git push origin minha-feature`
5. Abra um **Pull Request**.

## 🚀 Como Executar

---

1. Clone o repositório:
   ```bash
   git clone https://github.com/JoaoAzevedo184/Sistema-Bancario.git
   ```
2. Compile os arquivos Java:
   ```bash
   javac src/*.java src/Model/*.java
   ```
3. Execute o programa:
   ```bash
   java src.Main
   ```

## 👤 Autor

---
Desenvolvido por João Azevedo. Para mais informações, entre em contato:
- **Gmail**: jonoffice37@gmail.com
- **Linkedin**: www.linkedin.com/in/joao-victor-azevedo-181-sena
- **Github**: https://github.com/JoaoAzevedo184