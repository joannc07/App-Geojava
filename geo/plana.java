package geo;


public class plana extends geometria {

    
        
    
    
        public static double perimetroQuadrado (double lado) {
            return 4*lado;
        }
    
        public static double areaQuadrado (double lado ) {
            return Math.pow(lado, 2);
    
        }
    
    
        public static double perimetroRetangulo (double ladoA, double ladoB) {

            return (2 * ladoA) * (2 * ladoB);
    
    
        }
    
    
        public static double areaRetangulo(double ladoA, double ladoB) {
            return ladoA * ladoB; 
    
        }
    
    
        public static double perimetroTriangulo(double ladoA, double ladoB, double ladoC, double ladoH) {
            return ladoA+ladoB+ladoC;
    
    
        }
    
        public static double areaTriangulo(double ladoA, double ladoB, double ladoC, double ladoH) {
            return (ladoA * ladoH) / 2;
    
        }
    
        public static double trianguloEquilátero(double perimetroBase, double apotema) {
        return (perimetroBase * apotema) / 2;

        }
    
        public static double  areaTotalPiramide (double areaBase, double areaLateral) {
            return areaBase + areaLateral;
    
            
        }
    
        public static double volumePiramide (double areaBase, double altura) {
            return areaBase * altura / 3;
    
            
        }
    
        public static double areaLateralCone (double raio, double geratriz) {
            return 3.14 * raio * geratriz;
    
        }
    
        public static double areaBaseCone (double raio) {
            return 3.14 * Math.pow(raio, 2);
    
        }
    
        public static double volumeCone ( double raio, double altura) {
            return 3.14 * Math.pow(raio, 2) * altura / 3;
    
        }
    
    
        public static double volumeTronco (double raioMenor, double raioMaior, double altura) {
            return 3.14 * altura * ( Math.pow(raioMenor, 2) + raioMenor * raioMaior + Math.pow(raioMaior, 2) ) / 3;
    
        }
    
        public static double areaSuperficial (double raio) {
            return 4 * 3.14 * Math.pow(raio, 2);
            
    }

        public static double volumeEsfera (double raio) {
           return (4.0 / 3.0) * 3.14 * Math.pow(raio, 3);


    }



}






