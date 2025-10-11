import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Cachorro("Bolt"));
        animais.add(new Gato("Mimi"));
        animais.add(new Gato("Luna"));

        for (Animal animal : animais) {
            animal.dormir();
            animal.fazerSom();
        }
    }
}