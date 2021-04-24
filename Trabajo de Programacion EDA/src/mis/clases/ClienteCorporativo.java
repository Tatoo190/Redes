


package mis.clases;

import archivos.pilas.Pila;


public class ClienteCorporativo {
    private String RUC;
    private String RazonSocialCliente;
    //PILA
    private Pila ListaComprobantes=new Pila();

    public ClienteCorporativo(String RUC, String RazonSocialCliente) {
        this.RUC = RUC;
        this.RazonSocialCliente = RazonSocialCliente;      
    }

    
    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    public int cantidaddePilasValidas(){
        int a=0;
        Pila xd=new Pila();
        while(!ListaComprobantes.estaVacia()){
            xd.apilar(ListaComprobantes.desapilar());
            a++;
        }while(!xd.estaVacia()){
            ListaComprobantes.apilar(xd.desapilar());
           
        }
        return a;
    }
    public String getRazonSocialCliente() {
        return RazonSocialCliente;
    }

    public void setRazonSocialCliente(String RazonSocialCliente) {
        this.RazonSocialCliente = RazonSocialCliente;
    }

    public Pila getListaComprobantes() {
        return ListaComprobantes;
    }

    public void setListaComprobantes(Pila ListaComprobantes) {
        this.ListaComprobantes = ListaComprobantes;
    }

    @Override
    
    public String toString() {
        return "ClienteCorporativo{" + "RUC=" + RUC + ", RazonSocialCliente=" + RazonSocialCliente + ", ListaComprobantes=" + ListaComprobantes + '}';
    }
    public void apilarComprobantes(Comprobante oComprobante){
        Tarificador oTarificador=new Tarificador(oComprobante);
        if(oTarificador.NuevoMonto()>0){
            oComprobante.setMonto(oTarificador.NuevoMonto());
            ListaComprobantes.apilar(oComprobante);
        }
    }  
}