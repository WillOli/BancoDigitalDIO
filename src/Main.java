public class Main {
    public static void main(String[] args) {
        Cliente william = new Cliente();
        william.setNome("William");

        Conta cc = new ContaCorrente(william);
        Conta pp = new ContaPoupanca(william);

        cc.depositar(100);
        cc.transferir(100, pp);


        cc.imprimirInfosComuns();
        pp.imprimirExtrato();
    }
}