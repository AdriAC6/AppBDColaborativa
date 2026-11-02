import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> colaboradores = new ArrayList<>();

        colaboradores.add("Óscar");
        colaboradores.add("Amer");
        colaboradores.add("Ignacio M.");
        colaboradores.add("Samuel");
        // Seguir añadiendo colaboradores

        System.out.println("Colaborador@s:");
        colaboradores.forEach(System.out::println);
    }


}
