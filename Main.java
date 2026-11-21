public class Main {

    public static void main(String[] args) {

        Termostato termostato = new Termostato(22, "AUTO");

        System.out.println("=== Estado inicial ===");
        System.out.println(termostato.obtenerEstado());

        System.out.println("\n=== Temperaturas válidas ===");
        termostato.setTemperatura(18.5);
        termostato.setTemperatura(15);  // límite inferior
        termostato.setTemperatura(30);  // límite superior
        System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");

        System.out.println("\n=== Temperaturas inválidas ===");
        termostato.setTemperatura(10);   // por debajo del mínimo
        termostato.setTemperatura(45);   // por encima del máximo
        termostato.setTemperatura(-5);   // negativa
        System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");

        System.out.println("\n=== Modo de operación ===");
        termostato.setModoOperacion("calor");
        termostato.setModoOperacion("turbo"); // modo inexistente

        System.out.println("\n=== Estado final ===");
        System.out.println(termostato.obtenerEstado());


    }
}