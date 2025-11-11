@FunctionalInterface
interface OperacionMatematica {
    int ejecutar(int a, int b);  // Único método abstracto

    // Método default permitido
    default void mostrarResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }
}