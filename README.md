# Sistema Bancário

Este é um sistema bancário simples implementado em Java. O projeto permite a criação de clientes e contas bancárias, bem como operações básicas como depósito, saque e transferência de fundos entre contas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

### Banco
A classe `Banco` representa uma instituição bancária. Ela possui um nome e listas de clientes e contas associadas a este banco.

- **Atributos:**
  - `nome`: O nome do banco.
  - `contas`: Uma lista de contas pertencentes ao banco.
  - `clientes`: Uma lista de clientes que possuem contas no banco.

- **Métodos:**
  - `adicionarConta(Conta conta)`: Adiciona uma conta à lista de contas do banco.
  - `adicionarCliente(Cliente cliente)`: Adiciona um cliente à lista de clientes do banco.
  - `imprimirBanco()`: Imprime informações sobre o banco, incluindo a lista de clientes e contas.

### Cliente
A classe `Cliente` representa um cliente do banco.

- **Atributos:**
  - `nome`: O nome do cliente.

- **Métodos:**
  - `getNome()`: Retorna o nome do cliente.
  - `setNome(String nome)`: Define o nome do cliente.

### Conta
A classe abstrata `Conta` representa uma conta bancária. Esta classe é estendida por tipos específicos de contas, como `ContaCorrente` e `ContaPoupanca`.

- **Atributos:**
  - `agencia`: O número da agência da conta.
  - `numero`: O número da conta.
  - `saldo`: O saldo atual da conta.
  - `cliente`: O cliente associado a esta conta.

- **Métodos:**
  - `sacar(double valor)`: Subtrai um valor do saldo da conta.
  - `depositar(double valor)`: Adiciona um valor ao saldo da conta.
  - `transferir(double valor, IConta contaDestino)`: Transfere um valor para outra conta.
  - `imprimirInfosComuns()`: Imprime informações básicas da conta (titular, agência, número e saldo).

### ContaCorrente
A classe `ContaCorrente` estende a classe `Conta` e representa uma conta corrente.

- **Métodos:**
  - `imprimirExtrato()`: Imprime o extrato da conta corrente, incluindo as informações comuns da conta.

### ContaPoupanca
A classe `ContaPoupanca` estende a classe `Conta` e representa uma conta poupança.

- **Métodos:**
  - `imprimirExtrato()`: Imprime o extrato da conta poupança, incluindo as informações comuns da conta.

### IConta
A interface `IConta` define as operações que uma conta deve implementar.

- **Métodos:**
  - `sacar(double valor)`: Define a operação de saque.
  - `depositar(double valor)`: Define a operação de depósito.
  - `transferir(double valor, IConta contaDestino)`: Define a operação de transferência.
  - `imprimirExtrato()`: Define a operação para imprimir o extrato da conta.

## Uso

No método `main`, você pode criar instâncias de `Cliente`, `ContaCorrente`, e `ContaPoupanca`, realizar operações e imprimir informações sobre as contas.

```java
public class Main {
    public static void main(String[] args) {
        Cliente william = new Cliente();
        william.setNome("William");

        Conta cc = new ContaCorrente(william);
        Conta pp = new ContaPoupanca(william);

        cc.depositar(100);
        cc.transferir(100, pp);

        cc.imprimirInfosComuns();
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
