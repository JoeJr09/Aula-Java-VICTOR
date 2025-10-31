class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String msg) {
        super(msg);
    }
}

class Calculadora extends DivisaoPorZeroException {
    public Calculadora(String msg) {
        super(msg);
    }

    public void  dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Divisao por zero nao e permitida.");
        }
        int c = a / b;
    }
        }

public class Main {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora("Calculadora Iniciada");

        try {
            calculadora.dividir(10, 0);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}