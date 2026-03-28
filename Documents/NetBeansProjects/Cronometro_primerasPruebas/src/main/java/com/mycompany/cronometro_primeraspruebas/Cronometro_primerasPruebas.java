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
        Timer  Mytemp = new Timer();
        TimerTask task =new TimerTask() {
            int centesimas=0;
            int segundos =0;
            int minutos =0;
            @Override
            public void run() {
                if(centesimas <=99) //condicion clave // \n centesimas == 0 || 
                {
                    centesimas++; //incrementar en 1 a centesimas
                    System.out.println(centesimas +" centesimas");
                }
                else{
                    centesimas=centesimas%100; //reiniciar centesimas
                    segundos++; // cuando centesimas alcanza su maximo se reinicia y suma valor 01 a los minutos
                    System.out.println(segundos+"======================================== segundos=====================================");// mostrar por consola 
                    if(segundos==60){
                        segundos=segundos%60;
                        minutos++;
                        System.out.println(minutos +"========minutos=========================minutos==============================minutos============");
                    }else{
                        
                    }
                }
                /**
                if(segundos==60)
                {
                    System.out.println("============ se han cumplido los 60 segundos, sumamos 1 minuto ============");
                }**/
            }
        };
        
        Mytemp.scheduleAtFixedRate(task, 0, 10);
    }
}
