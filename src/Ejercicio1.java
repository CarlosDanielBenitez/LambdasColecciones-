import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static List<String> convertirAMayusculas(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> listaOriginal = List.of("java", "es", "un", "lenguaje", "backend");

        List<String> listaEnMayusculas = convertirAMayusculas(listaOriginal);

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista en mayúsculas: " + listaEnMayusculas);
    }
}
