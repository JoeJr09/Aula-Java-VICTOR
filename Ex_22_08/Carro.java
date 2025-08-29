package Ex_22_08;

public class Carro {
    String marca;
    int ano;
    Motor motor;

    void exibirInformacoes() {
        String mensagem = "Motor Ligado";
        System.out.println(mensagem );
        System.out.println("-");
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        motor.exibirInformacoes();
    }

}