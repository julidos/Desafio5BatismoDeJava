public abstract class ContaBancaria implements Conta{

    String nome;
    int rg;
    double saldo;
    TipoConta contaCorrenteOuContaPoupanca;



    @Override
    public void consultarSaldo() {
        System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
        System.out.println("Olá, Sr(a). " + nome + " seu saldo é de R$" + saldo);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public abstract void depositar(double valor);


    @Override
    public void transferirReceber(ContaBancaria origem, ContaBancaria destino, double valor) {
        System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
        System.out.println("Olá, Sr(a). " + destino.nome);
        System.out.println("Tranferência de recebida de " + origem.nome);
        System.out.println("Valor: R$" + valor);
        destino.saldo += valor;
        System.out.println("Saldo: R$" + destino.saldo);
        System.out.println("----------------------------------------------------");
    }

    public boolean verificarSaldo(double valor) {
        if (valor > saldo) {
            return false;
        }
        return true;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
            System.out.println("Olá, Sr(a). " + nome);
            System.out.println("Saldo insuficiente para fazer o saque!");
            System.out.println("----------------------------------------------------");
            return false;
        }
        System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
        System.out.println("Olá, Sr(a). " + nome);
        System.out.println("Saque de R$" + valor);
        saldo -= valor;
        System.out.println("Saldo: R$" + saldo);
        System.out.println("----------------------------------------------------");
        return true;
    }

    public void transferirEnviar(ContaBancaria origem, ContaBancaria destino, double valor) {
        if(this.verificarSaldo(valor)) {
            destino.transferirReceber(origem,destino,valor);
            System.out.println("-------- Banco de Konoha --- CONTA "+ contaCorrenteOuContaPoupanca +"  -------");
            System.out.println("Olá, Sr(a). " + origem.nome);
            System.out.println("Tranferência de enviada para " + destino.nome);
            System.out.println("Valor: R$" + valor);
            origem.saldo -= valor;
            System.out.println("Saldo: R$" + origem.saldo);
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("Transferência falhou por saldo insuficiente.");
        }
    }

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public ContaBancaria(String nome, int rg, double saldo) {
        this.nome = nome;
        this.rg = rg;
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, int rg, double saldo, TipoConta contaCorrenteOuContaPoupanca) {
        this(nome,rg,saldo);
        this.contaCorrenteOuContaPoupanca = contaCorrenteOuContaPoupanca;
    }
}
