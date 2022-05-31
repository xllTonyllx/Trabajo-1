import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        double num1,num2;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese 1er numero: ");
        num1= leer.nextDouble();
        System.out.print("Ingrese 2do numero: ");
        num2= leer.nextDouble();

        Clase1 par = new Clase1(num1,num2);

        System.out.println(par);

        System.out.println(par.sumar());
        System.out.println(par.restar());
        System.out.println(par.multiplicar());
        System.out.println(par.dividir());
        System.out.println(par.potencia());
    }
}
