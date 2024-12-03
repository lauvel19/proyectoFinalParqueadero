
package modelo;

/**
 *
 * @author royer
 */
public class Vehiculo {
 private int idVehiculo;
 private String placa;
 private String tipoVehiculo;
 private String horaEntrada;
 private String horaSalida;
 private double totalValor;
 private String estado;
 
 public Vehiculo(){
     this.idVehiculo = 0;
     this.placa = "";
     this.tipoVehiculo = "";
     this.horaEntrada = "";
     this.horaSalida = "";
     this.totalValor = 0.00;
     this.estado = "";
 }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(double totalValor) {
        this.totalValor = totalValor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", placa=" + placa + ", tipoVehiculo=" + tipoVehiculo + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", totalValor=" + totalValor + ", estado=" + estado + '}';
    }
 
}
