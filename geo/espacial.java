package geo;


public class espacial extends geometria {

    public double volume;
    public double areaTotal;
    public double areaBase;
    public double areaLateral;
    public double areaFaces;
    public double diagonal;
    


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


    public void areaBaseCilindro (double raio, double pi) {
        super(raio, pi);
    }



}


