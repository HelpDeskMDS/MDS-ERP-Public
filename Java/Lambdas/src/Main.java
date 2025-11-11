import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Expresión lambda (implementa ejecutar)
        OperacionMatematica suma = (a, b) -> a + b;
        OperacionMatematica resta = (a, b) -> a - b;
        OperacionMatematica multiplicacion = (a, b) -> a * b;
        OperacionMatematica division = (a, b) -> a / b;

        System.out.println(suma.ejecutar(5, 3));
        System.out.println(resta.ejecutar(5, 3));
        System.out.println(multiplicacion.ejecutar(5, 3));
        System.out.println(division.ejecutar(5, 3));


        List<String> palabras = Arrays.asList("java", "lambda", "funcional");
        palabras.stream()
                .filter(palabra -> palabra.length() > 4) // Predicate como lambda
                .forEach(System.out::println);            // Consumer como referencia
                // Salida: "lambda", "funcional"

        
        List<Integer> números = Arrays.asList(1, 2, 3, 4, 5);
        números.stream()
                .filter(n -> n % 2 == 0)       // Predicate (SAM)
                .map(n -> n * 2)               // Function (SAM)
                .forEach(System.out::println);  // Consumer (SAM)
    }


}