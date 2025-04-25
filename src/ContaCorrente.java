public class ContaCorrente extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
        System.out.println("Olá, Sr(a). " + nome);
        System.out.println("Você depositou R$" + valor + "  Taxa de Operação: 1%");
        System.out.println("Assim o valor depositado foi de " + (valor*0.99) + " reais");
        super.saldo += valor*0.99;
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------------------------------");
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public ContaCorrente(String nome, int rg, double saldo) {
        super(nome, rg, saldo);
    }

    public ContaCorrente(String nome, int rg, double saldo, TipoConta contaCorrenteOuContaPoupanca) {
        super(nome, rg, saldo, contaCorrenteOuContaPoupanca);
    }
}
