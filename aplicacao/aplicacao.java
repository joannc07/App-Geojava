package aplicacao;

import java.util.Scanner;

import geo.espacial;

public class aplicacao {

    static int escolhaConta;
    static int escolhaFigura;
    static int escolhaFormula;
    static double valores;
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            
            System.out.println("\nOlá, seja bem-vindo!:");
            System.out.println("\nEscolha qual das geometrias deseja calcular:");

    
            System.out.printf("Espacial (1) / Plana (2) ");
            escolhaConta = ler.nextInt();

            if (1 == escolhaConta) {
                System.out.println("\nVocê escolheu a Geometria Espacial.");
            
                System.out.printf("Qual figura você deseja calcular: Pirâmide (1) / Esfera (2) / Cones (3) / Troncos (4) / Cilindro (5) / Prismas (6) ");
                escolhaFigura = ler.nextInt();
            
                if ( 1 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Pirâmide você deseja: Área Lateral (1) / Área Total (2) / Volume (3) ");
                    escolhaFormula = ler.nextInt();

                    if (escolhaFormula == 1) { System.out.print("Digite o perímetro da base: "); double pBase = ler.nextDouble(); 
                    System.out.print("Digite o apótema: "); double apotema = ler.nextDouble(); 
                    double resultado = espacial.areaLateralPiramide (pBase, apotema); 
                    System.out.println("O resultado da Área Lateral é " + resultado); }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite a Área da Base: "); double areaBase = ler.nextDouble(); 
                    System.out.print("Digite a Área Lateral: "); double areaLateral = ler.nextDouble(); 
                    double resultado = espacial.areaTotalPiramide (areaBase, areaLateral); 
                    System.out.println("O resultado da Área Total é " + resultado);
                        
                    }

                    else if (3 == escolhaFormula) {
                        System.out.printf("Vamos calcular o Volume da Pirâmide! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }
                }
            
                else if (2 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Esfera você deseja: Área Superficial (1) / Volume (2) ");
                    escolhaFormula = ler.nextInt();
            
                    if (1 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área Superficial! Insira o valor do raio: ");
                        valores = ler.nextInt();
                    }

                    else if (2 == escolhaFormula) {
                        System.out.printf("Vamos calcular o Volume! Insira o valor do raio: ");
                        valores = ler.nextInt();
                    }
                }
            
                else if (3 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Cones você deseja: Área Lateral (1) / Área da Base (2) / Volume (3) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área Lateral do cone! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    else if (2 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área da Base do cone! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    else if (3 == escolhaFormula) {
                        System.out.printf("Vamos calcular o Volume do cone! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }
                }
            
                else if (4 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Troncos você deseja: Área Lateral (1) / Área Total (2) / Volume (3) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área Superficial! Insira o valor do raio: ");
                        valores = ler.nextInt();
                    }
                }
            
                else if (5 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Cilindro você deseja: Área da Base (1) / Área Lateral (2) / Volume (3) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área da Base do cilindro! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    else if (2 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área Lateral do cilindro! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    else if (3 == escolhaFormula) {
                        System.out.printf("Vamos calcular o Volume do cilindro! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }
                }
            
                else if (6 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Prisma você deseja: Área Lateral (1) / Área Total (2) / Volume (3) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área Lateral do Prisma! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    else if (2 == escolhaFormula) {
                        System.out.printf("Vamos calcular a Área Total do Prisma! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    else if (3 == escolhaFormula) {
                        System.out.printf("Vamos calcular o Volume do Prisma! Insira o valor ... : ");
                        valores = ler.nextInt();
                    }

                    
                }
            }
            
            else if (2 == escolhaConta) {
                System.out.println("Você escolheu a Geometria Plana.");
            }


        System.out.println(escolhaConta);

}

    
}
