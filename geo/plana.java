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




