public interface Conta {

    void consultarSaldo();

    void depositar(double valor);

    void transferirReceber(ContaBancaria origem, ContaBancaria destino,double valor);

}
