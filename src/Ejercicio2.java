import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static String concatenarPalabrasMasLargas(List<String> lista, int n){
        return lista.stream()
                .filter(s -> s.length() > n)
                .collect(Collectors.joining(", "));
    }

     public static void main(String[] args) {
List<String> listaPalabras = List.of("Java", "es", "compilado","y","fuertemente", "tipado");
int longitudMinima = 3;
String resultado = concatenarPalabrasMasLargas(listaPalabras, longitudMinima);

System.out.println("Palabras en lista con mas de " + longitudMinima + " caracteres: " + resultado);
    }
}
