/*
Método encolar objeto
**Expresado como un arreglo, agregando elementos al final
**Cola es un arreglo de 50 elementos
**Se utiliza el pseudocódigo porque aún no conocemos 
*Entrada: objeto ClienteCorporativo
*Salida: 
inicio
	Para i = 0, menor que 50, se irá sumando 1
		arreglo en posicion i es iugal al objeto clienteCorporativo
		se suma 1 a i
	Fciclo
Fin	
*/


/*
Método reporte recaudación
**Expresado como un arreglo
**Cola es un arreglo de 50 elementos
*Entrada: clienteCorporativo cola
*Salida: recaudacionGiros, recaudacionEncomiendas
inicio 
entero recaudaciónEncomiendas igual a 0
entero recaudaciónGiros igual a 0
	Para i = 0, menor que 50, se ira sumando 1
		si en el arreglo posicion i su tipo es igual a Giro
			recaudacionGiros igual a recaudacionGiros más monto
		pCi1
		si en el arreglo posicion i su tipo es igual a Encomienda
			recaudacionEncomiendas es igual a recaudaciónEncomiendas más monto
		pCi2
	fciclo
	imprimir recaudacionGiros
	imprimir recaudacionEncomiendas
Fin
*/

package miGestion;

import archivos.colas.Cola;
import archivos.pilas.Pila;
import mis.clases.ClienteCorporativo;
import mis.clases.Comprobante;
import mis.clases.Fecha;

public class GestionMensajeria {
    private Cola ClientesCorp;
    private double giros, encomiendas;
    public GestionMensajeria() {
        giros=0;encomiendas=0;
        ClientesCorp=new Cola();
    }

    public Cola getClientesCorp() {
        return ClientesCorp;
    }

    public double getGiros() {
        return giros;
    }

    public double getEncomiendas() {
        return encomiendas;
    }
    public void EncolarCliente(ClienteCorporativo Cliente){
        ClientesCorp.encolar(Cliente);
    }
    //Me falta la de toString, no la entendi
    
    public Cola CantidadEnCola(){
        Cola AuxCola= new Cola();
        
        return AuxCola;
    }
    public String Calcular(){
        Cola AuxCola= new Cola();       
        Comprobante comprobante;
        ClienteCorporativo clientea;
        Pila aux=new Pila();
        while(!ClientesCorp.estaVacia()){
            clientea=ClientesCorp.desencolar();
            AuxCola.encolar(clientea);
            
            while(!clientea.getListaComprobantes().estaVacia()){
                comprobante=clientea.getListaComprobantes().desapilar();
                Comprobante oComprobante=comprobante;
                aux.apilar(oComprobante);
                if("Giro".equals(comprobante.getTipo())){
                    giros=giros+comprobante.getMonto();                    
                }if("Encomienda".equals(comprobante.getTipo())){
                    encomiendas=encomiendas+comprobante.getMonto();                    
                }
            }
            while(!aux.estaVacia()){
                clientea.getListaComprobantes().apilar(aux.desapilar());
            }
        }
        while(!AuxCola.estaVacia()){
            ClientesCorp.encolar(AuxCola.desencolar());
        }
        
        int Total=(int) (giros+encomiendas);
        return ("Monto total por Giros: "+ giros+
                "\nMonto total por Encomiendas: "+ encomiendas+
                "\nLa Ganancia Total es "+ Total);
    }
    public double CalcFecha(Fecha fecha){
        double n=0;
        Cola AuxCola= new Cola();       
        Comprobante comprobante;
        ClienteCorporativo clientea;
        Pila aux=new Pila();
        while(!ClientesCorp.estaVacia()){
            clientea=ClientesCorp.desencolar();
            AuxCola.encolar(clientea);
            while(!clientea.getListaComprobantes().estaVacia()){
                comprobante=clientea.getListaComprobantes().desapilar(); 
                Comprobante oComprobante=comprobante;
                aux.apilar(oComprobante);
                if(comprobante.getFechaEmision().mostrar().equals(fecha.mostrar())){
                    n=n+comprobante.getMonto();
                }
            }
            while(!aux.estaVacia()){
                clientea.getListaComprobantes().apilar(aux.desapilar());
            }
        }
        while(!AuxCola.estaVacia()){
            ClientesCorp.encolar(AuxCola.desencolar());
    }
        return n;
    }
}
/*
        }*/
