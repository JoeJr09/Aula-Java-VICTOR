public class Main {
    public static void main(String[] args) {

        try {
            int a= 10;
            int b= 0;
            int c= a/b;
        }catch (ArithmeticException e) {
            System.out.println("Erro: Divisao por zero nao e permitida." + e.getMessage());

        }finally { //Nao e obrigatorio, mas e uma boa pratica
            System.out.println("Operacao finalizada.");
        }
    }
}