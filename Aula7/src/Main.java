public class Main {
    public static void main(String[] args) {

        Passaro passaro = new Passaro("Papagaio");
        passaro.voar();
        System.out.println("==============================");
        Voavel voador = passaro;
        voador.voar();

    }
}