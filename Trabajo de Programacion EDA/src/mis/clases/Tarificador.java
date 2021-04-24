package mis.clases;
/*
Entrada: Objeto de clase Comprobante
Salida: Debe retornar el nuevo monto
PreCondicion: El objeto a ingresar debe contar con datos completos 
PostCondicion: Debe retornar un entero
Metodo:
    Calculador de Nuevo Monto: Su objetivo es tomar la distancia más optima entre 
    la ciudad de origen y destino , y calcular el monto a cobrar segun la tarifa dada
*/
public class Tarificador{
    private int[][] valor=   {{ 0,    4,   8,   1000,1000},
                               {4,    0,   1000, 2,  1000},
                               {8,   1000, 0,    4,   2 },
                               {1000,  2,  4,    0,   7 },
                               {1000,1000, 2,    7,   0 }};
    
    
    private int[][] verdad={    {1,2,3,4,5},
                                {1,2,3,4,5},
                                {1,2,3,4,5},
                                {1,2,3,4,5},
                                {1,2,3,4,5}};
    private final String[] ciudades={"Ciudad 1","Ciudad 2","Ciudad 3","Ciudad 4","Ciudad 5"};
    private Comprobante oComprobante;
    private static int tarifaXkm=10;
    public Tarificador(Comprobante oComprobante) {
        this.oComprobante=oComprobante;
    }
    public int[][] Copy(int [][] V1){      
        return V1;
    }    
    public int HallarCiudad(String a){
        int rpta=0;
        for (int i=0;i<ciudades.length;i++){
            if(a==ciudades[i]){
                rpta=i;
            }
        }
        return rpta;
    }
    public int NuevoMonto(){
        int[][]aux=Copy(valor);
        int[][]verdadaux=Copy(verdad);
        int dist=0;
        dist=Calcu(HallarCiudad(oComprobante.CiudadOrigen),HallarCiudad(oComprobante.CiudadDestino),aux,verdadaux);       
        return (dist*tarifaXkm);
    }
     public int Calcu(int a,int b,int[][] aux,int[][] verdadaux){
         for(int i=0;i<aux.length;i++){
            for(int j=0;j<aux.length;j++){
                for(int z=0;z<aux.length;z++){
                        if(j!=i && z!=i){
                            if(aux[j][i]+aux[i][z]<=aux[j][z]){
                                    aux[j][z]=aux[j][i]+aux[i][z]; 
                                    verdadaux[j][z]=i+1;}
                                        }
                                     }
                                }
                       
           }
         return aux[a][b];
     }
     public void  Recurs(int a, int b){
          int[][]aux=Copy(valor);
          int[][]verdadaux=Copy(verdad);
          int dist=Calcu(HallarCiudad(oComprobante.CiudadOrigen),HallarCiudad(oComprobante.CiudadDestino),aux,verdadaux);
         if(aux[a][b]==b){
             System.out.print(" Se termina en la ciudad"+ b);
         }else{
             System.out.print(a+"luego ");
             Recurs(aux[a][b],b);
         }
         
     }
    
}