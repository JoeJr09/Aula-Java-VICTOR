public class Main {
    public static void main(String[] args) {
        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        Recarregavel veiculoRecarregavel = carro;
        veiculoRecarregavel.recarregar(20);
        System.out.println("Tempo máximo de recarga: " + Recarregavel.TEMPO_MAXIMO + " minutos");

        Autonomo veiculoAutonomo = carro;
        veiculoAutonomo.dirigirAutonomo("Taguatinga Shopping");
        System.out.println("Suporte GPS: " + Autonomo.SUPORTE_GPS);
    }
}