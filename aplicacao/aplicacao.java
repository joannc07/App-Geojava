package aplicacao;

import java.util.Scanner;

import geo.espacial;

public class aplicacao {

    static String escolhaConta;
    static String escolhaFigura;
    static String escolhaFormula;
    static double valores;
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            
            System.out.println("Olá, seja bem-vindo!:");
            System.out.println("Escolha qual das geometrias deseja calcular:");

    
            System.out.printf("Espacial / Plana: ");
            escolhaConta = ler.next();

            if ("espacial".equalsIgnoreCase(escolhaConta)) {
                System.out.println("Você escolheu a Geometria Espacial.");
            
                System.out.printf("Qual figura você deseja calcular: Pirâmide / Esfera / Cones / Troncos / Prismas / Cilindro: ");
                escolhaFigura = ler.next();
            
                if ("Pirâmide".equalsIgnoreCase(escolhaFigura)) {
                    System.out.printf("Qual cálculo de Pirâmide você deseja: Área Lateral / Área Total / Volume: ");
                    escolhaFormula = ler.next();
                }
            
                else if ("esfera".equalsIgnoreCase(escolhaFigura)) {
                    System.out.printf("Qual cálculo de Esfera você deseja: Área Superficial / Volume: ");
                    escolhaFormula = ler.next();
            
                    if ("Área superficial".equalsIgnoreCase(escolhaFormula)) {
                        System.out.printf("Vamos calcular a Área Superficial! Insira o valor do raio: ");
                        valores = ler.nextDouble();
                    }
                }
            
                else if ("cones".equalsIgnoreCase(escolhaFigura)) {
                    System.out.printf("Qual cálculo de Cones você deseja: Área Lateral / Área da Base / Volume: ");
                    escolhaFormula = ler.next();
                }
            
                else if ("troncos".equalsIgnoreCase(escolhaFigura)) {
                    System.out.printf("Qual cálculo de Troncos você deseja: Área Lateral / Área Total / Volume: ");
                    escolhaFormula = ler.next();
                }
            
                else if ("cilindro".equalsIgnoreCase(escolhaFigura)) {
                    System.out.printf("Qual cálculo de Cilindro você deseja: Área da Base / Área Lateral / Volume: ");
                    escolhaFormula = ler.next();
                }
            
                else if ("prismas".equalsIgnoreCase(escolhaFigura)) {
                    System.out.printf("Qual cálculo de Prisma você deseja: Área Lateral / Área Total / Volume: ");
                    escolhaFormula = ler.next();
                }
            }
            
            else if ("plana".equalsIgnoreCase(escolhaConta)) {
                System.out.println("Você escolheu a Geometria Plana.");
            }


        System.out.println(escolhaConta);

}

    
}
