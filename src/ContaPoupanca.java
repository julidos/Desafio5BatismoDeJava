public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
        System.out.println("Olá, Sr(a). " + nome);
        System.out.println("Você depositou R$" + valor + " reais. Taxa de Operação: 1%");
        System.out.println("Assim o valor depositado foi de R$" + (valor*0.99));
        super.saldo += valor*0.99;
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------------------------------");
    }

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    public ContaPoupanca(String nome, int rg, double saldo) {
        super(nome, rg, saldo);
    }

    public ContaPoupanca(String nome, int rg, double saldo, TipoConta contaCorrenteOuContaPoupanca) {
        super(nome, rg, saldo, contaCorrenteOuContaPoupanca);
    }
}
