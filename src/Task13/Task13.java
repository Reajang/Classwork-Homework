package Task13;

public class Task13 {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        switch (args[0]){
            case "+": System.out.println(plus(a,b)); break;
            case "-": System.out.println(minus(a,b)); break;
            case "m": System.out.println(mult(a,b)); break;
            case "/": System.out.println(div(a,b)); break;
            default: System.out.println("Неверная операция.");
        }

    }
    public static double plus(double x1, double x2){
        return x1+x2;
    }
    public static double minus(double x1, double x2){
        return x1-x2;
    }
    public static double mult(double x1, double x2){
        return x1*x2;
    }
    public static double div(double x1, double x2){
        return x1/x2;
    }
}
