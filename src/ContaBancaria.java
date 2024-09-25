public class ContaBancaria {
    private double saldo;
    private int contadorConsultas;

    // Metodo Construtor da classe
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.contadorConsultas = 0;
    }


    // Método que recebe um valor, subtrai a taxa, subtrai o valor do deposito no saldo e retorna o valor depositado.
    public double saque(double valor) {
        double taxa = valor * 0.005;
        saldo -= valor + taxa;
        return valor;
    }

    // Método que recebe um valor, subtrai a taxa, adiciona o resultado ao saldo e retorna o valor inserido.
    public double deposito(double valor) {
        double taxa = valor * 0.01;
        saldo += valor - taxa;
        return valor;
    }

    // Método que retorna o saldo. Se o número do contador exceder 5, ele subtrai a taxa do saldo antes de retornar o valor.
    public double consultaSaldo() {
        contadorConsultas++;
        if (contadorConsultas % 5 == 0) {
            saldo -= 0.10;
            System.out.println("Cobrança de 10 centavos pela consulta. Saldo atual: " + saldo);
        }
        return saldo;
    }
}
