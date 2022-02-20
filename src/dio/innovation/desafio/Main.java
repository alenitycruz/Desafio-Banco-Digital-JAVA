package dio.innovation.desafio;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        Conta poupança = new ContaPoupanca();
        poupança.depositar(1000);
        poupança.transferir(50,cc);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();


    }
}
