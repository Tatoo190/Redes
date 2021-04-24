
package archivos.pilas;

import mis.clases.Comprobante;

public class Pila implements IPila{
    private Comprobante[] listaComprobantes;
    int cima;
    private static final int TAM_MAX = 50;
    
    public Pila(){
        listaComprobantes = new Comprobante[TAM_MAX];
        cima = -1;
    }
    

    public boolean estaVacia(){
        boolean estado = (cima == -1);
        return estado;
    }
    
    public boolean estaLlena(){
        boolean estado = (cima + 1 == TAM_MAX);
        return estado;
    }
    
    public void apilar(Comprobante oComprobante){
        if(!estaLlena()){
            cima++;
            listaComprobantes[cima] = oComprobante;
        }else{
            
        }
    }
    
    public Comprobante desapilar(){
        Comprobante valor = null;
        if(!this.estaVacia()){
            valor = listaComprobantes[cima];
            cima--;
        }
        return valor;
    }
    
    public void mostrarElementos(){
        for(int i = 0; i <= cima; i++){
            listaComprobantes[i].escribir();
        }
    }

    public Comprobante cima() {
        return listaComprobantes[cima];
    }
}