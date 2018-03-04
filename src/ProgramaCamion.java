package programacamion;

import java.util.Scanner;

public class ProgramaCamion {
        
    static double nviajes(double k, double kc){
     
        double V=0;
        V= k/kc;
        V=Math.ceil(V);
        return V;
        
    }
    
    static double ngas(double n, double g){
     
        double G=0;
        double K=78.6;
        G=g*K*n*2;
        return G;
        
    }
       
    public static void main(String[] args) {
        
        
       double Kilos;
       double Gas;
       double KilosC;
       
       Scanner Teclado= new Scanner (System.in);
        
       System.out.println("Kilos de carga: ");
       Kilos = Teclado.nextFloat();
       System.out.println("Kilos que puede cargar el camion: ");
       KilosC = Teclado.nextFloat();
       System.out.println("Consumo de galones por Kilometro: ");
       Gas = Teclado.nextFloat();
       
       System.out.println("Dsitancia bogota-sasaima: 78.6 ");
       double Nv=nviajes(Kilos,KilosC);  
       System.out.println("No de viajes de idá y vuelta: " +Nv);
       double Ng=ngas(Nv,Gas);
       System.out.println("Galones de gasolina : " +Ng);
    }  
    
}
