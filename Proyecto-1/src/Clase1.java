public class Clase1 {
    private Double num1;
    private Double num2;

    public Clase1(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Clase1(){
        num1=0.0;
        num2=0.0;
    }

    public double sumar(){
        return num1+num2;
    }

    public double restar(){
        return num1-num2;
    }

    public double multiplicar(){
        return num1*num2;
    }
    public double dividir(){
        return num1/num2;
    }
    public double potencia(){
        return Math.pow(num1,num2);
    }

    @Override
    public String toString() {
        return
                "\nnum1=" + num1 +
                ", num2=" + num2;
    }
}
