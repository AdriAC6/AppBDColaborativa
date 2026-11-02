import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> colaboradores = new ArrayList<>();

        colaboradores.add("Óscar");
        colaboradores.add("Amer");
        colaboradores.add("Ignacio M.");
        colaboradores.add("Samuel");
        colaboradores.add("Anxo");
        colaboradores.add("Darío");
        colaboradores.add("Alejandro Araujo");
        colaboradores.add("Adrián Gómez");
        colaboradores.add("Hugo D.");
        colaboradores.add("Adam");
        colaboradores.add("Adrian Santos");
        colaboradores.add("Ignacio R.");
        colaboradores.add("HugoR");
        colaboradores.add("Eusebio");
        // Seguir añadiendo colaboradores

        System.out.println("Colaborador@s:");
        colaboradores.forEach(System.out::println);
    }


}
