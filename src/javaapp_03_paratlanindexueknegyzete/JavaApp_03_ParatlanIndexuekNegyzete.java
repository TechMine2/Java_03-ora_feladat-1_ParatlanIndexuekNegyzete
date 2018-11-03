package javaapp_03_paratlanindexueknegyzete;

public class JavaApp_03_ParatlanIndexuekNegyzete {

    static double[] valosTomb;
    
    public static void main(String[] args) {
        valosTomb = valosTombFeltolt(25, 1, 2);
        valosTombKiir(valosTomb);
    }
    
    public static void valosTombKiir(double[] t){
        for (int i = 1; i < t.length; i+=2) {
            System.out.println((i) + ". " + Math.pow(t[i], 2));
        }
        System.out.println("");
    }
    
    public static double[] valosTombFeltolt(int db, int min, int max){
       
        double[] tomb = new double[db];
        
        for (int i = 0; i < db; i++) {
            tomb[i]= Math.random()*(max-min)+min;
        }
        
        return tomb;
    }
    
}
