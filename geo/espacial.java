package geo;


public class espacial extends geometria {

    public double volume;
    public double areaTotal;
    public double areaBase;
    public double areaLateral;
    public double areaFaces;
    public double numFaces;
    public double diagonal;
    public double geratriz;
    public double raioMenor;
    public double raioMaior;
    public double areaTriangulo;
    public double areaSuperficial;
        
    
    
        public double areaLateralPrisma (double areaFaces, double numFaces, double altura) {
            return (areaFaces * altura) * numFaces;
        }
    
        public double areaTotalPrisma (double areaBase, double areaLateral ) {
            return areaBase + areaLateral;
    
        }
    
    
        public double volumePrisma (double altura, double areaBase) {

            return areaBase * altura;
    
    
        }
    
    
        public double areaBaseCilindro(double raio, double pi) {
            return pi * Math.pow(raio, 2); 
    
        }
    
    
        public double areaLateralCilindro(double raio, double pi, double altura) {
            return 2 * pi * raio * altura;
    
    
        }
    
        public double volumeCilindro(double raio, double pi, double altura) {
            return pi * Math.pow(raio, 2) * altura;
    
        }
    
        public static double areaLateralPiramide(double perimetroBase, double apotema) {
        return (perimetroBase * apotema) / 2;

        }
    
        public double areaTotalPiramide (double areaBase, double areaLateral) {
            return areaBase + areaLateral;
    
            
        }
    
        public double volumePiramide (double areaBase, double altura) {
            return areaBase * altura / 3;
    
            
        }
    
        public double areaLateralCone (double pi, double raio, double geratriz) {
            return pi * raio * geratriz;
    
        }
    
        public double areaBaseCone (double pi, double raio) {
            return pi * Math.pow(raio, 2);
    
        }
    
        public double volumeCone (double pi, double raio, double altura) {
            return pi * Math.pow(raio, 2) * altura / 3;
    
        }
    
    
        public double volumeTronco (double raioMenor, double raioMaior, double pi, double altura) {
            return pi * altura * ( Math.pow(raioMenor, 2) + raioMenor * raioMaior + Math.pow(raioMaior, 2) ) / 3;
    
        }
    
        public double areaSuperficial (double pi, double raio) {
            return 4 * pi * Math.pow(raio, 2);
            
    }

        public double volumeEsfera (double pi, double raio) {
           return (4.0 / 3.0) * pi * Math.pow(raio, 3);


    }



}






