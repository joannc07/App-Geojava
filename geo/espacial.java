package geo;


public class espacial extends geometria {

    
        
    
    
        public static double areaLateralPrisma (double areaFaces, double numFaces, double altura) {
            return (areaFaces * altura) * numFaces;
        }
    
        public static double areaTotalPrisma (double areaBase, double areaLateral ) {
            return areaBase + areaLateral;
    
        }
    
    
        public static double volumePrisma (double altura, double areaBase) {

            return areaBase * altura;
    
    
        }
    
    
        public static double areaBaseCilindro(double raio, double pi) {
            return pi * Math.pow(raio, 2); 
    
        }
    
    
        public static double areaLateralCilindro(double raio, double pi, double altura) {
            return 2 * pi * raio * altura;
    
    
        }
    
        public static double volumeCilindro(double raio, double pi, double altura) {
            return pi * Math.pow(raio, 2) * altura;
    
        }
    
        public static double areaLateralPiramide(double perimetroBase, double apotema) {
        return (perimetroBase * apotema) / 2;

        }
    
        public static double  areaTotalPiramide (double areaBase, double areaLateral) {
            return areaBase + areaLateral;
    
            
        }
    
        public static double volumePiramide (double areaBase, double altura) {
            return areaBase * altura / 3;
    
            
        }
    
        public static double areaLateralCone (double pi, double raio, double geratriz) {
            return pi * raio * geratriz;
    
        }
    
        public static double areaBaseCone (double pi, double raio) {
            return pi * Math.pow(raio, 2);
    
        }
    
        public static double volumeCone (double pi, double raio, double altura) {
            return pi * Math.pow(raio, 2) * altura / 3;
    
        }
    
    
        public static double volumeTronco (double raioMenor, double raioMaior, double pi, double altura) {
            return pi * altura * ( Math.pow(raioMenor, 2) + raioMenor * raioMaior + Math.pow(raioMaior, 2) ) / 3;
    
        }
    
        public static double areaSuperficial (double raio) {
            return 4 * 3.14 * Math.pow(raio, 2);
            
    }

        public static double volumeEsfera (double raio) {
           return (4.0 / 3.0) * 3.14 * Math.pow(raio, 3);


    }



}






