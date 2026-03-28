/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cronometro_primeraspruebas;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Timer;
import java.util.TimerTask;

public class Cronometro_primerasPruebas {
    
    

    public static void main(String[] args) {
        System.out.println("Cronometro Iniciado");
        Timer  myTemp = new Timer();
        TimerTask task =new TimerTask() {
            int centesimas=0;
            int segundos =0;
            int minutos =0;
            int horas = 0;
            
            @Override
            public void run() {
                
                if(centesimas <=98) //condicion clave 
                {
                    centesimas++; //incrementar en 1 a centesimas
                    //System.out.println(centesimas +" centesimas");                    
                }
                else{
                    centesimas=centesimas%99; //reiniciar centesimas
                    segundos++; // cuando centesimas alcanza su maximo se reinicia y suma valor 01 a los minutos
                    System.out.println(segundos+"======================================== segundos=====================================");// mostrar por consola 
                    if(segundos == 59){
                        segundos = segundos%59;
                        minutos++;
                        System.out.println(minutos +"========minutos=========================minutos==============================minutos============");
                    }
                    if(minutos==59){
                        minutos=minutos%59;//reiniciar a cero
                        horas++;
                        System.out.print(horas+" Horas");  
                    }   
                }
            }
        };
        
        myTemp.scheduleAtFixedRate(task, 0, 10);
    }
}
