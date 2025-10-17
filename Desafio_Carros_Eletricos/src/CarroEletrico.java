public class CarroEletrico implements Recarregavel, Autonomo {
    private String modelo;

    public CarroEletrico(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void recarregar(int tempoMinutos) {
        System.out.println("O modelo " + modelo + " está recarregando por " + tempoMinutos + " minutos");
    }

    @Override
    public void dirigirAutonomo(String destino) {
        System.out.println("O modelo " + modelo + " está dirigindo autonomamente para " + destino);
    }

    public String getModelo() {
        return modelo;
    }
}