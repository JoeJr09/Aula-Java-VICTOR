package Trabalho2;

public abstract class Conta {
    // atributos da conta
    private String titular;
    private int numero;
    private double saldo;

    // construtor
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    // adiciona valor na conta
    public void depositar(double valor){
        if (valor > 0){
            setSaldo( getSaldo() + valor);
            System.out.printf("Deposito de R$%.2f realizado! %n", getSaldo());
        }else {
            System.out.println("Valor inválido! Depósito não realizado.");
        }
    }

    // retira valor da conta
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
        }else {
            saldo -= valor;
        }
    }

    
    // metodo abstrato pra atualizar saldo
    public abstract void atualizarSaldo();

    // getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}