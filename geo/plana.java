package geo;



public class plana extends geometria {
    
    private double area;;
    public Quadrado(double area) {
        this.area = area;   

    }
    public int Perimetro() {
        return area * 4;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = scanner.nextInt();
        System.out.println("Digite a altura: ");
        int altura = scanner.nextInt();
        double quadrado = new quadrado(base, altura);
        System.out.println("O perimetro do quadrado é: " + perimetro);
    }
            
        
}
