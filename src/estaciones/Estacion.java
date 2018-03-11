/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaciones;

import javax.swing.DefaultButtonModel;

/**
 *
 * @author Jonathan
 */
public class Estacion {
    private double[][] estacion = new double[4][12];
       
    public double[][] getEstacion() {
        return estacion;
    }
    
    public void setEstacion(double[][] estacion) {
        this.estacion = estacion;
        
    }
            
    public double promedio(){
        double promedio = 0;
        double suma = 0;
        double promedioAux = 0;
        
        for(int i = 0; i < estacion.length;i++){
            for(int j = 0; j < estacion[0].length; j++){
                suma = suma + estacion[i][j];
            }
            promedioAux = suma / 12;
            promedio = promedio + promedioAux;
            suma = 0;
        }
        
        promedio = promedio / 4;
        return promedio;
       
    }
    
    public String MesesTemperaturaSuperior(){
        double suma = 0;
        int n = 0;
        String superior = "";
       
        String nombreMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
                                "Junio","Julio", "Agosto", "Septiembre", 
                                "Octubre", "Nombiembre","Diciembre"};
        
        
        double[] meses = new double[12];
        double promedioComparar = promedio();
        
        for(int j = 0; j < estacion[0].length; j++){
            for(int i = 0; i < estacion.length; i++ ){
                suma = suma + estacion[i][j];
                System.out.println(suma);
            }
            meses[n] = suma / 12;
            n++;
        }
        
        for(int i = 0; i < meses.length; i++){
            if(meses[i] > promedioComparar){
                superior = superior + nombreMeses[i] + "\n";
            }
        }
        
        return superior;
    }

   

    
    
}
