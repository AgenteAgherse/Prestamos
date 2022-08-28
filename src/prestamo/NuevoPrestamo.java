package prestamo;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class NuevoPrestamo {
    private Integer diaPrestamo;
    private Double valorPrestamo;
    private Double capitalInicial;

    public NuevoPrestamo(Integer diaPrestamo, Double valorPrestamo, Double capitalInicial) {
        this.diaPrestamo = diaPrestamo;
        this.valorPrestamo = valorPrestamo;
        this.capitalInicial = capitalInicial;
    }

    public Integer getDiaPrestamo() {
        return diaPrestamo;
    }

    public Double getValorPrestamo() {
        return valorPrestamo;
    }

    public String toString() {
        return valorPrestamo + "\t";
    }
    
}
