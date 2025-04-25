public class Main {
    public static void main(String[] args) {

/*        ContaCorrente Conta1 = new ContaCorrente("Naruto Uzumaki", 123123, 500, TipoConta.CORRENTE);
        Conta1.consultarSaldo();
        Conta1.depositar(100);
        Conta1.consultarSaldo();

        ContaPoupanca CP1 = new ContaPoupanca("Sasuke Uchiha", 234234, 100, TipoConta.POUPANCA);
        CP1.consultarSaldo();
        CP1.depositar(100);
        CP1.consultarSaldo();*/

        ContaBancaria conta1 = new ContaCorrente("Sakura Haruno", 234432, 300, TipoConta.CORRENTE);
        ContaBancaria conta2 = new ContaPoupanca("Hinata Hyuuga", 321321, 1000, TipoConta.POUPANCA);

        conta1.consultarSaldo();
        conta2.consultarSaldo();

        conta1.transferirEnviar(conta2, conta1, 200);
        conta2.sacar(100);
        conta1.depositar(200);

        conta1.consultarSaldo();
        conta2.consultarSaldo();

    }
}
