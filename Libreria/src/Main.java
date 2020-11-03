import Converciones.Conversion;

public class Main {
    public static void main(String[] args) {
        Conversion conversion= new Conversion();
        String res=conversion.binario(2);

        res=conversion.hexa(2);
        System.out.println(res );

        res=conversion.hexa(15);
        System.out.println(res );


    }

}
