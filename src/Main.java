import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        //Command para pedir texto en console

        System.out.print("Hola por favor escriba tre números, comenzando con el primero: ");
        String strNumero1 = br.readLine();
        Integer numero1 = Integer.parseInt(strNumero1);

        System.out.print("Ingrese segundo Número: ");
        String strNumero2 = br.readLine();
        Integer numero2 = Integer.parseInt(strNumero2);

        System.out.print("Ingrese segundo Número: ");
        String strNumero3 = br.readLine();
        Integer numero3 = Integer.parseInt(strNumero3);


        int suma = numero1 + numero2 + numero3;
        int prom = suma / 3;
        System.out.println("promedio de números:"+prom );



    }
}