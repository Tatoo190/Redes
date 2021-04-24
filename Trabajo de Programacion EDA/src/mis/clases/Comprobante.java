
package mis.clases;

public class Comprobante {
    
    private String tipo;
    protected String CiudadOrigen;
    protected String CiudadDestino;
    //Crear clase fecha o preguntar si es especifico o solo señalar año
    private Fecha fechaEmision;
    private double monto;

    public Comprobante(String tipo, String CiudadOrigen, String CiudadDestino,Fecha fechaEmision,double monto) {
        this.tipo = tipo;
        this.CiudadOrigen = CiudadOrigen;
        this.CiudadDestino = CiudadDestino;
        this.fechaEmision=fechaEmision;
        this.monto = monto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCiudadOrigen() {
        return CiudadOrigen;
    }
    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }
    public String getCiudadDestino() {
        return CiudadDestino;
    }
    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }
    public Fecha getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(Fecha fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void escribir(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Ciudad de Origen: "+CiudadOrigen);
        System.out.println("Ciudad de Destino: "+CiudadDestino);
        System.out.println("Monto: "+monto);
        System.out.println("Fecha de emisión: ");
        this.fechaEmision.escribir();
        System.out.println("----------");
    }

    @Override
    public String toString() {
        return "Comprobante{" + "tipo=" + tipo + ", CiudadOrigen=" + CiudadOrigen + ", CiudadDestino=" + CiudadDestino + ", fechaEmision=" + fechaEmision + ", monto=" + monto + '}';
    }
}
