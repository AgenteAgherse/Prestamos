package prestamo;

import java.util.ArrayList;

public class ArrayPrestamos {
    
    private ArrayList<NuevoPrestamo> carritoPrestamo;
    private Double interes; //La tasa de interés del préstamo
    private Double capitalInicial; //El capital inicial del préstamo
    private Integer diasPrestamo; //La cantidad de días dentro del préstamo
    private Integer diasGlobal; // El día en el que se hace el préstamo según el esquema.
    
    public ArrayPrestamos(Double interes, Double capitalInicial, Integer dias, Integer diasGlobal) {
        this.carritoPrestamo = new ArrayList<>();
        this.interes = interes;
        this.capitalInicial = capitalInicial;
        this.diasPrestamo = dias;
        this.diasGlobal = diasGlobal;
    }

    public ArrayPrestamos() {
        this.interes = 0.0;
        this.capitalInicial = 0.0;
        this.diasPrestamo = 0;
        this.diasGlobal = 0;
    }
    
    public ArrayList<NuevoPrestamo> getCarritoPrestamo() {
        return carritoPrestamo;
    }

    public void setCarritoPrestamo(ArrayList<NuevoPrestamo> carritoPrestamo) {
        this.carritoPrestamo = carritoPrestamo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(Double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public Integer getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(Integer diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }
    
    public Double generarCuota() {
        if (this.capitalInicial < 0) {
            return 0.0;
        }
        else {
            return (capitalInicial + (capitalInicial * interes)) / diasPrestamo;
        }
    }
    
    public void generarPrestamosAutomaticos() {
        NuevoPrestamo prestamo;
        Double cuota = generarCuota();
        /**
         * diaActual = El día que se genera dentro del préstamo.
         */
        for (int diaActual = diasGlobal; diaActual < this.diasGlobal + this.diasPrestamo; diaActual++) {
            prestamo = new NuevoPrestamo(diaActual, cuota, this.capitalInicial);
            carritoPrestamo.add(prestamo);
        }
    }
    
    public void mostrarCuotas() {
        String mensaje = "";
        System.out.println("Tamaño: " + carritoPrestamo.size());
        for (NuevoPrestamo nuevoPrestamo : carritoPrestamo) {
            mensaje += nuevoPrestamo.toString();
        }
        System.out.println(mensaje);
    }
}
