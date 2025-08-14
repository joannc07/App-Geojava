package geo;


public class espacial extends geometria {

    public double volume;
    public double areaTotal;
    public double areaBase;
    public double areaLateral;
    public double areaFaces;
    public double diagonal;
    public double geratriz;
    public double raioMenor;
    public double raioMaior;
    public double areaTriangulo;
    public double areaSuperficial;
        
    
    
        public void areaLateralPrisma (double areaFaces) {
            this.areaFaces = areaFaces;
    
            this.areaLateral = areaFaces + areaFaces;
        }
    
        public void areaTotalPrisma (double areaBase, double areaLateral ) {
            this.areaBase = areaBase;
            this.areaLateral = areaLateral;
    
            this.areaTotal = areaBase + areaLateral;
        }
    
    
        public void volumePrisma (double altura, double areaBase) {
            this.altura = altura;
            this.areaBase = areaBase;
    
            this.volume = areaBase * altura;
        }
    
    
        public void areaBaseCilindro(double raio, double pi) {
            this.pi = pi;
            this.raio = raio;
    
            this.areaBase = pi * Math.pow(raio, 2); 
        }
    
    
        public void areaLateralCilindro(double raio, double pi, double altura) {
            this.pi = pi;
            this.raio = raio;
            this.altura = altura;
    
            this.areaLateral = 2 * pi * raio * altura;
    
    
        }
    
        public void volumeCilindro(double raio, double pi, double altura) {
            this.pi = pi;
            this.raio = raio;
            this.altura = altura;
    
            this.volume = pi * Math.pow(raio, 2) * altura;
        }
    
        public void areaLateralPiramide (double areaTriangulo) {
            this.areaTriangulo = areaTriangulo;
    
            this.areaLateral = areaTriangulo + areaTriangulo;
    
    
        }
    
        public void areaTotalPiramide (double areaBase, double areaLateral) {
            this.areaBase = areaBase;
            this.areaLateral = areaLateral;
    
            this.areaTotal = areaBase + areaLateral;
        }
    
        public void volumePiramide (double areaBase, double altura) {
            this.areaBase = areaBase;
            this.altura = altura;
    
            this.volume = areaBase * altura / 3;
        }
    
        public void areaLateralCone (double pi, double raio, double geratriz) {
            this.pi = pi;
            this.raio = raio;
            this.geratriz = geratriz;
    
            this.areaLateral = pi * raio * geratriz;
        }
    
        public void areaBaseCone (double pi, double raio) {
            this.pi = pi;
            this.raio = raio;
    
            this.areaBase = pi * Math.pow(raio, 2);
        }
    
        public void volumeCone (double pi, double raio, double altura) {
            this.pi = pi;
            this.raio = raio;
            this.altura = altura;
    
            this.volume = pi * Math.pow(raio, 2) * altura / 3;
        }
    
    
        public void volumeTronco (double raioMenor, double raioMaior, double pi, double altura) {
            this.raioMaior = raioMaior;
            this.raioMenor = raioMenor;
            this.pi = pi;
            this.altura = altura;
    
            this.volume = pi * altura * ( Math.pow(raioMenor, 2) + raioMenor * raioMaior + Math.pow(raioMaior, 2) ) / 3;
        }
    
        public void areaSuperficial (double pi, double raio) {
            this.raio = raio;
            this.pi = pi;
    
            this.areaSuperficial = 4 * pi * Math.pow(raio, 2);
    }

        public void volumeEsfera (double pi, double raio) {
           this.raio = raio;
           this.pi = pi;

           this.volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }



}






