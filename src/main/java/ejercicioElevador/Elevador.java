/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioElevador;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Elevador {

    // Atributos principales.
    private String numeroSerie;
    private int capacidadMaximaPersonas;
    private double pesoMaximo;
    private LocalDate fechaFabricación;
    private LocalDate fechaUltimaRevision;
    private String fabricante;

    // Atributos adicionales. 
    private Plantas planta;
    private EstadoAscensor estadoAscensor;

    public boolean mover(int personas, double peso, Plantas plantasDeseada) {

        boolean mover = false;
        if (personas > 0 && personas < this.getCapacidadMaximaPersonas()) {
            if (peso > 0 && peso <= this.getPesoMaximo()) {
                // Solo para subir a la planta 0/8
                if (this.planta == Plantas.PLANTA_BAJA || plantasDeseada == Plantas.PLANTA_CERO || plantasDeseada == Plantas.PLANTA_OCHO) {
                    this.estadoAscensor = EstadoAscensor.SUBIENDO;
                    if (plantasDeseada == Plantas.PLANTA_CERO) {
                        this.planta = Plantas.PLANTA_CERO;
                    }
                    if (plantasDeseada == Plantas.PLANTA_OCHO) {
                        this.planta = Plantas.PLANTA_OCHO;
                    }
                    mover = true;

                } else if (this.planta == Plantas.PLANTA_OCHO || plantasDeseada == Plantas.PLANTA_CERO || plantasDeseada == Plantas.PLANTA_BAJA) {
                    this.estadoAscensor = EstadoAscensor.BAJANDO;

                    if (plantasDeseada == Plantas.PLANTA_CERO) {
                        this.planta = Plantas.PLANTA_CERO;
                    }
                    if (plantasDeseada == Plantas.PLANTA_BAJA) {
                        this.planta = Plantas.PLANTA_BAJA;
                    }
                    mover = true;
                } else if (this.planta == Plantas.PLANTA_CERO || plantasDeseada == Plantas.PLANTA_BAJA || plantasDeseada == Plantas.PLANTA_OCHO) {
                    if (plantasDeseada == Plantas.PLANTA_BAJA) {
                        this.planta = Plantas.PLANTA_BAJA;
                        this.estadoAscensor = EstadoAscensor.BAJANDO;
                    }
                    if (plantasDeseada == Plantas.PLANTA_OCHO) {
                        this.planta = Plantas.PLANTA_OCHO;
                        this.estadoAscensor = EstadoAscensor.BAJANDO;
                    }
                    mover = true;
                }
            }

        }
        if (!mover) {
            this.estadoAscensor = null;
        }
        return mover;
    }

    // Constructores
    public Elevador(int capacidadMaximaPersonas, double pesoMaximo, String fabricante) {
        this.numeroSerie = RandomStringUtils.randomNumeric(8);
        if (capacidadMaximaPersonas < 0 || capacidadMaximaPersonas > 10) {
            this.capacidadMaximaPersonas = 0;
        } else {
            this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        }
        if (pesoMaximo < 0 || pesoMaximo > 800) {
            this.pesoMaximo = 0;
        } else {
            this.pesoMaximo = pesoMaximo;
        }
        this.fechaFabricación = LocalDate.now();
        this.fechaUltimaRevision = LocalDate.now();
        this.planta = planta.PLANTA_BAJA;
        this.estadoAscensor = null;
        this.fabricante = fabricante;
    }

    // Getters
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getCapacidadMaximaPersonas() {
        return capacidadMaximaPersonas;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaFabricación() {
        return fechaFabricación;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public Plantas getPlantas() {
        return planta;
    }

    public EstadoAscensor getEstadoAscensor() {
        return estadoAscensor;
    }

    // Setters
    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public void setPlantas(Plantas plantas) {
        this.planta = plantas;
    }

    public void setEstadoAscensor(EstadoAscensor estadoAscensor) {
        this.estadoAscensor = estadoAscensor;
    }

    // toString
    @Override
    public String toString() {
        return "Elevador{" + "numeroSerie=" + numeroSerie + ", capacidadMaximaPersonas=" + capacidadMaximaPersonas + ", pesoMaximo=" + pesoMaximo + ", fechaFabricaci\u00f3n=" + fechaFabricación + ", fechaUltimaRevision=" + fechaUltimaRevision + ", plantas=" + planta + ", estadoAscensor=" + estadoAscensor + '}';
    }

}

//    public Elevador(int capacidadMaximaPersonas, double pesoMaximo, Plantas plantas, EstadoAscensor estadoAscensor) {
//
//        this.numeroSerie = RandomStringUtils.randomNumeric(8);
//        if (capacidadMaximaPersonas < 0 || capacidadMaximaPersonas > 10) {
//            throw new IllegalArgumentException("La capacidad máxima debe estar entre 0 y 10 personas.");
//        }
//        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
//        if (pesoMaximo < 0 || pesoMaximo > 800) {
//            throw new IllegalArgumentException("El peso maximo debe estar entre 0 y 800.");
//        }
//        this.pesoMaximo = pesoMaximo;
//        this.fechaFabricación = LocalDate.now();
//        this.fechaUltimaRevision = LocalDate.now();
//        this.plantas = plantas.PLANTA_BAJA;
//        this.estadoAscensor = null;
//    }
