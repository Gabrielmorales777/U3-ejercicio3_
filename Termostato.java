public class Termostato {

    private static final double TEMP_MINIMA = 15.0;
    private static final double TEMP_MAXIMA = 30.0;

    private double temperaturaActual;
    private String modoOperacion;

    public Termostato(double temperaturaInicial, String modoInicial) {
        if (!esTemperaturaValida(temperaturaInicial)) {
            throw new IllegalArgumentException(
                    "La temperatura inicial debe estar entre " + TEMP_MINIMA + "°C y " + TEMP_MAXIMA + "°C.");
        }
        if (!esModoValido(modoInicial)) {
            throw new IllegalArgumentException("Modo de operación inválido: " + modoInicial);
        }
        this.temperaturaActual = temperaturaInicial;
        this.modoOperacion = modoInicial.toUpperCase();
    }

    public double getTemperatura() {
        return temperaturaActual;
    }

    public void setTemperatura(double nuevaTemperatura) {
        if (!esTemperaturaValida(nuevaTemperatura)) {
            System.out.println("ADVERTENCIA: " + nuevaTemperatura + "°C está fuera del rango permitido ("
                    + TEMP_MINIMA + "°C a " + TEMP_MAXIMA + "°C). Se mantiene en " + temperaturaActual + "°C.");
            return;
        }
        temperaturaActual = nuevaTemperatura;
        System.out.println("Temperatura configurada en " + temperaturaActual + "°C.");
    }

    public String getModoOperacion() {
        return modoOperacion;
    }

    public void setModoOperacion(String nuevoModo) {
        if (!esModoValido(nuevoModo)) {
            System.out.println("ADVERTENCIA: modo '" + nuevoModo
                    + "' no válido. Modos permitidos: FRIO, CALOR, AUTO. Se mantiene en " + modoOperacion + ".");
            return;
        }
        modoOperacion = nuevoModo.toUpperCase();
        System.out.println("Modo de operación cambiado a " + modoOperacion + ".");
    }

    private boolean esTemperaturaValida(double temperatura) {
        return temperatura >= TEMP_MINIMA && temperatura <= TEMP_MAXIMA;
    }

    private boolean esModoValido(String modo) {
        if (modo == null) {
            return false;
        }
        String m = modo.toUpperCase();
        return m.equals("FRIO") || m.equals("CALOR") || m.equals("AUTO");
    }

    public String obtenerEstado() {
        return "Termostato | Temperatura: " + temperaturaActual + "°C | Modo: " + modoOperacion;
    }
}