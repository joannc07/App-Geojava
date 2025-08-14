package aplicacao;

import java.util.Scanner;

import geo.espacial;

public class aplicacao {

    static String escolhaConta;
    static String escolhaFigura;
    static String escolhaFormula;
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            
            System.out.println("Olá, seja bem-vindo!:");
            System.out.println("Escolha qual das geometrias deseja calcular:");

    
            System.out.printf("Espacial / Plana: ");
            escolhaConta = ler.next();

        if ("espacial".equalsIgnoreCase(escolhaConta)) {
            escolhaConta = "Você escolheu a Geometria Espacial.";

            System.out.printf("Qual figura você deseja calcular: Pirâmide / Esfera / Cones / Troncos / Prismas / Cilindro: ");
            escolhaFigura = ler.next();

            if ("Pirâmide".equalsIgnoreCase(escolhaFigura)) {

                System.out.printf("Qual cálculo de Pirâmide você deseja: Área Lateral / Área Total / Volume: ");
            escolhaFormula = ler.next();

            }

            else if ("esfera".equalsIgnoreCase(escolhaFigura)) {

                System.out.printf("Qual cálculo de Esfera você deseja: Área Lateral / Área Total / Volume: ");
            escolhaFormula = ler.next();

            }

            else if ("cones".equalsIgnoreCase(escolhaFigura)) {

                System.out.printf("Qual cálculo de Cones você deseja: Área Lateral / Área Total / Volume: ");
            escolhaFormula = ler.next();

            }

            else if ("troncos".equalsIgnoreCase(escolhaFigura)) {

                System.out.printf("Qual cálculo de Troncos você deseja: Área Lateral / Área Total / Volume: ");
            escolhaFormula = ler.next();

            }

            else if ("cilindro".equalsIgnoreCase(escolhaFigura)) {

                System.out.printf("Qual cálculo de Cilindro você deseja: Área Lateral / Área Total / Volume: ");
            escolhaFormula = ler.next();

            }


        }

        else if ("plana".equalsIgnoreCase(escolhaConta)) {
            escolhaConta = "Você escolheu a Geometria Plana.";

            
        }


        System.out.println(escolhaConta);

}

    
}
