
package archivos.colas;
import archivos.colas.ICola;
import mis.clases.ClienteCorporativo;
public class Cola implements ICola{
    ClienteCorporativo[] C;
    int frente;
    int fin;
    private static final int TAM_MAX = 50;
    
    public Cola(){
        C = new ClienteCorporativo[TAM_MAX];
        frente = -1;
        fin = -1;
    }
    
    public boolean estaVacia(){
        boolean estado = false;
        if(frente == -1 && fin == -1){
            estado = true;
        }
        return estado;
    }
    
    public boolean estaLlena(){
        boolean estado = false;
        if((frente == 0 && fin == TAM_MAX - 1) || frente == fin + 1){
            estado = true;
        }
        return estado;
    }
    
    @Override
    public void encolar(ClienteCorporativo item){
        if(!this.estaLlena()){
            if(this.estaVacia()){
                frente = 0;
                fin = 0;
            }else if(fin == TAM_MAX - 1){
                fin = 0;
            }else{
                fin++;
            }
            C[fin] = item;
        }
    }
    
    @Override
    public ClienteCorporativo desencolar(){
        ClienteCorporativo elemento = null;
        if(frente != -1 && fin != -1){
            elemento = C[frente];
            if(frente == fin){
                frente = -1;
                fin = -1;
            }else{
                if(frente == TAM_MAX - 1){
                    frente = 0;
                }else{
                    frente++;
                }
            }
        }
        return elemento;
    }

    public void mostrarEementos(){
        System.out.print("frente -> ");
        if(!this.estaVacia()){
            if(frente <= fin){
                for(int i = frente; i <= fin; i++){
                    System.out.print(C[i] + " -> ");
                }
            }else{
                for(int i = frente; i < C.length; i++){
                    System.out.print(C[i] + " -> ");
                }
                for(int i = 0; i < frente; i++){
                    System.out.print(C[i] + " -> ");
                }
            }        
        }
        System.out.println("final");
    }
}
