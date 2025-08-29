package Ex_22_08;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.ano = 2020;

        Motor motor = new Motor();
        motor.combustível = "Gasolina";
        motor.potencia = 150;

        carro.motor = motor;

        carro.exibirInformacoes();

        Carro outroCarro = new Carro();
        outroCarro.marca = "Honda";
        outroCarro.ano = 2021;

        Motor outroMotor = new Motor();
        outroMotor.combustível = "Álcool";
        outroMotor.potencia = 130;

        outroCarro.motor = outroMotor;

        outroCarro.exibirInformacoes();

    }


    
}


