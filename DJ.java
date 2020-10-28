
package Algoritmo_Dijkstra;

public class DJ {
    private int grafo[][];
    private int distancia[];//distancia minima 
    private boolean Visitados[];//Es true si ya se paso por el vertice
    private int origen;
    private int nro_vertices;

    public DJ(int[][] grafo,int origen, int nro_vertices) {
        this.grafo = grafo;
        this.origen = origen;
        this.nro_vertices = nro_vertices;
    }
    public void Dijsktra(){
        
        distancia = new int[nro_vertices];
        Visitados = new boolean[nro_vertices];
        //Inicializar todos los vertices en no visitados y asignar distancias 
        for(int i=0;i<nro_vertices;i++){
            Visitados[i]=false;
            distancia[i]=grafo[origen][i];//Donde no haya puntos de conexion directo la distancia es de 99999
            
        }
        //La distancia al vertice de origen siempre sera 0 y como se le evalua ya se le visito y no repite
        Visitados[origen]=true;
        distancia[origen]=0;
        //
        for(int i=0;i<nro_vertices;i++){
            int aux=100000;
            int min = 0;
            for(int k=0;k<nro_vertices;k++){
                if(!Visitados[k]&&(distancia[k]<=aux)){
                    aux=distancia[k];
                    min=k;
                }
            }
            Visitados[min]=true;
            //Se actualizan las distancias de los vertices adyacentes al vertice min escogido
            for(int j=0;j<nro_vertices;j++){
                if((distancia[min]+grafo[min][j]<distancia[j])&& !Visitados[j]){
                    distancia[j]=distancia[min]+grafo[min][j];
                }
            }
        }
        for(int i=0;i<nro_vertices;i++){
            System.out.println("Costo minimo de "+origen+" a "+i+" : "+distancia[i]);
        }
    }
}
