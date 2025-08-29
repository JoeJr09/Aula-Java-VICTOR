package Ex_22_08;

public class Motor {
    String combustível;
    int potencia;

    void exibirInformacoes() {
        System.out.println("Combustível: " + combustível);
        System.out.println("Potência: " + potencia + " CV");
        System.out.println("-");
        String mensagem = "Motor Desligado";
        System.out.println(mensagem);
        System.out.println("-");
    }

}
