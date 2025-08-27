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
            
            while (true) {

            System.out.println("\nOlá, seja bem-vindo!:");
            System.out.println("\nEscolha qual das geometrias deseja calcular:");

    
            System.out.printf("Espacial (1) / Plana (2) / Sair (0) ");
            escolhaConta = ler.nextInt();

            if (escolhaConta == 0) {
                System.out.println("Programa encerrado. Até mais!");
                break; 
            }

            else if (1 == escolhaConta) {
                System.out.println("\nVocê escolheu a Geometria Espacial.");
            
                System.out.printf("\nQual figura você deseja calcular: Pirâmide (1) / Esfera (2) / Cones (3) / Troncos (4) / Cilindro (5) / Prismas (6) / Sair (0) ");
                escolhaFigura = ler.nextInt();

        
                if (0 == escolhaFigura) {
                    System.out.println("Programa encerrado. Até mais!");
                    break; 
                }

                else if ( 1 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Pirâmide você deseja: Área Lateral (1) / Área Total (2) / Volume (3) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    

                    if (escolhaFormula == 1) { 
                        
                        System.out.print("Digite o perímetro da base: "); double pBase = ler.nextDouble(); 
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

                        System.out.print("Digite a Área da Base: "); double areaBase = ler.nextDouble(); 
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble(); 
                        double resultado = espacial.volumePiramide (areaBase, altura); 
                        System.out.println("O resultado do Volume é " + resultado);


                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (2 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Esfera você deseja: Área Superficial (1) / Volume (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();
            
                    if (1 == escolhaFormula) {


                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble(); 
                        double resultado = espacial.areaSuperficial (raio); 
                        System.out.println("O resultado da Área Superficial é " + resultado);

                    }




                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble(); 
                        double resultado = espacial.volumeEsfera(raio); 
                        System.out.println("O resultado do Volume é " + resultado);

                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (3 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Cones você deseja: Área Lateral (1) / Área da Base (2) / Volume (3) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble(); 
                        System.out.print("Digite a Geratriz: "); double geratriz = ler.nextDouble(); 
                        double resultado = espacial.areaLateralCone(geratriz, raio); 
                        System.out.println("O resultado da Área Lateral é " + resultado);

                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble(); 
                        double resultado = espacial.areaBaseCone(raio); 
                        System.out.println("O resultado da Área da Base é " + resultado);

                    }

                    else if (3 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble(); 
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble(); 
                        double resultado = espacial.volumeCone(altura, raio); 
                        System.out.println("O resultado do Volume é " + resultado);

                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (4 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Troncos você deseja: Volume (1) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o Raio menor: "); double raioMenor = ler.nextDouble(); 
                        System.out.print("Digite o Raio maior: "); double raioMaior = ler.nextDouble(); 
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble(); 
                        double resultado = espacial.volumeTronco(raioMenor, altura, raioMaior); 
                        System.out.println("O resultado do Volume é " + resultado);
                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (5 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Cilindro você deseja: Área da Base (1) / Área Lateral (2) / Volume (3) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble(); 
                        double resultado = espacial.areaBaseCilindro(raio); 
                        System.out.println("O resultado da Área da Base é " + resultado);
                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble();
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble();  
                        double resultado = espacial.areaLateralCilindro(raio, altura); 
                        System.out.println("O resultado da Área Lateral é " + resultado);
                    }

                    else if (3 == escolhaFormula) {

                        System.out.print("Digite o Raio: "); double raio = ler.nextDouble();
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble();  
                        double resultado = espacial.volumeCilindro(raio, altura); 
                        System.out.println("O resultado do Volume é " + resultado);
                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (6 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Prisma você deseja: Área Lateral (1) / Área Total (2) / Volume (3) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite a Área de faces: "); double areaFaces = ler.nextDouble();
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble();
                        System.out.print("Digite a Altura: "); double numFaces = ler.nextDouble();  
                        double resultado = espacial.areaLateralPrisma(areaFaces, altura, numFaces); 
                        System.out.println("O resultado da Área Lateral é " + resultado);
                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite a Área da Base: "); double areaBase = ler.nextDouble();
                        System.out.print("Digite a Área Lateral: "); double areaLateral = ler.nextDouble();  
                        double resultado = espacial.areaTotalPrisma(areaBase, areaLateral); 
                        System.out.println("O resultado da Área Total é " + resultado);
                    }

                    else if (3 == escolhaFormula) {

                        System.out.print("Digite a Área da Base: "); double areaBase = ler.nextDouble();
                        System.out.print("Digite a Altura: "); double altura = ler.nextDouble();  
                        double resultado = espacial.volumePrisma(areaBase, altura); 
                        System.out.println("O resultado do Volume é " + resultado);


                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }



                    
                }
            }
            
            else if (2 == escolhaConta) {
                System.out.println("Você escolheu a Geometria Plana.");
            }

            else if (3 >= escolhaConta) {
                System.out.println("Escolha inválida.");
                break;
            }




}


    
        }

    }
