package geo;

public class plana extends geometria {

    public static double perimetroTrianguloEquilatero(double lado, double h) {
        return 3 * lado;
    }

    public static double areaTrianguloEquilatero(double lado, double h) {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }

    public static double perimetroParalelogramo(double a, double b, double altura) {
        return 2 * a + 2 * b;
    }

    public static double areaParalelogramo(double a, double altura) {
        return a * altura;
    }

    public static double perimetroLosangulo(double lados, double diagonalMaior, double diagonalMenor) {
        return 4 * lados;
    }

    public static double areaLosangulo(double diametroMaior, double diametroMenor) {
        return (diametroMaior * diametroMenor) / 2;
    }

    public static double perimetroTrapezio(double baseMaior, double baseMenor, double ladoC, double ladoD, double altura) {
        return baseMaior + baseMenor + ladoC + ladoD;
    }

    public static double areaDoTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static double circunferenciaCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public static double areaDoCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
