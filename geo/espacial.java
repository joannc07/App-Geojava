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
    


    public void areaLateralPrisma (double areaFaces) {
        this.areaFaces = areaFaces;
    }

    public void areaTotalPrisma (double areaBase, double areaLateral ) {
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
    }


    public void volumePrisma (double altura, double areaBase) {
        this.altura = altura;
        this.areaBase = areaBase;
    }


    public void areaBaseCilindro(double raio, double pi) {
        this.pi = pi;
        this.raio = raio;
    }


    public void areaLateralCilindro(double raio, double pi, double altura) {
        this.pi = pi;
        this.raio = raio;
        this.altura = altura;
    }

    public void volumeCilindro(double raio, double pi, double altura) {
        this.pi = pi;
        this.raio = raio;
        this.altura = altura;
    }

    public void areaLateralPiramide (double areaFaces) {
        this.areaFaces = areaFaces;

    }

    public void areaTotalPiramide (double areaBase, double areaLateral) {
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
    }

    public void volumePiramide (double areaBase, double altura) {
        this.areaBase = areaBase;
        this.altura = altura;
    }

    public void areaLateralCone (double pi, double raio, double geratriz) {
        this.pi = pi;
        this.raio = raio;
        this.geratriz = geratriz;
    }

    public void areaBaseCone (double pi, double raio) {
        this.pi = pi;
        this.raio = raio;
    }

    public void volumeCone (double pi, double raio, double altura) {
        this.pi = pi;
        this.raio = raio;
        this.altura = altura;
    }


    public void volumeTronco (double raioMenor, double raioMaior, double pi, double altura) {
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }


}






