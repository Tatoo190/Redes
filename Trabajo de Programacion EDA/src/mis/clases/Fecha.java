/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis.clases;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1970;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Día: "); dia = entrada.nextInt();
        System.out.print("Mes: "); dia = entrada.nextInt();
        System.out.print("Año: "); anio = entrada.nextInt();
    }
    public void escribir(){
        System.out.println(dia+"/"+mes+"/"+anio);        
    }
    public String mostrar(){
        return dia+"/"+(mes+1)+"/"+anio;
    }
}
