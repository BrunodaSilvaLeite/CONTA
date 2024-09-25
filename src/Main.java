public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0); // Saldo inicial de R$ 1000

        //Printa na tela o retorno do deposito
        System.out.println("Deposito: R$ " + conta.deposito(1000));

        //Printa na tela o retorno do saque
        System.out.println("Saque R$ " +  conta.saque(100));

        //Printa na tela o retorno da consulta
        System.out.println("Saldo : R$ " +conta.consultaSaldo());
    }
}
