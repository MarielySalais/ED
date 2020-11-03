public class Principal {



    public static void main(String[] args) {
        int[] arregloA={2,3,8,7,1};
        int mayor=arregloA[0];
        for (int dato:arregloA) {
            mayor=Math.max(dato,mayor);
        }
        System.out.println("El numero mayor es: " + mayor);






    }//main
}//class
 