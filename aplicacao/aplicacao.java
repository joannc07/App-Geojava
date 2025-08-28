package aplicacao;

import java.util.Scanner;

import geo.espacial;
import geo.plana;

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
            
            else if (escolhaConta == 2) {
            System.out.println("Você escolheu a Geometria Plana.");
            System.out.printf("\nQual figura você deseja calcular: Quadrado (1) / Retângulo (2) / Triângulo (3) / Triângulo Equilátero (4) / Paralelogramo (5) / Losango (6) / Trapézio (7) / Circunferência (8) / Sair (0) ");
            escolhaFigura = ler.nextInt();

            if (escolhaFigura == 0) {
                System.out.println("Programa encerrado. Até mais!");
                break;
            }

                else if ( 1 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Quadrado você deseja: Perímetro (1) / Área (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    

                    if (escolhaFormula == 1) { 
                        
                        System.out.print("Digite o Lado: "); double lado = ler.nextDouble(); 
                        double resultado = plana.perimetroQuadrado (lado); 
                        System.out.println("O resultado do Perímetro é " + resultado); 
                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o Lado: "); double lado = ler.nextDouble(); 
                        double resultado = plana.areaQuadrado (lado); 
                        System.out.println("O resultado da Área é " + resultado);
                        
                    }

        
                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (2 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Retângulo você deseja: Área (1) / Perímetro (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();
            
                    if (1 == escolhaFormula) {


                        System.out.print("Digite o lado A: "); double ladoA = ler.nextDouble(); 
                        System.out.print("Digite o lado B: "); double ladoB = ler.nextDouble(); 
                        double resultado = plana.areaRetangulo (ladoA, ladoB); 
                        System.out.println("O resultado da Área é " + resultado);

                    }




                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o lado A: "); double ladoA = ler.nextDouble(); 
                        System.out.print("Digite o lado B: "); double ladoB = ler.nextDouble(); 
                        double resultado = plana.perimetroRetangulo (ladoA, ladoB); 
                        System.out.println("O resultado do Perímetro é " + resultado);


                    }

                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (3 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Triângulo você deseja: Perímetro (1) / Área (2) /  Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o lado A: "); double ladoA = ler.nextDouble(); 
                        System.out.print("Digite o lado B: "); double ladoB = ler.nextDouble(); 
                        System.out.print("Digite o lado C: "); double ladoC = ler.nextDouble(); 
                        double resultado = plana.perimetroTriangulo (ladoA, ladoB, ladoC); 
                        System.out.println("O resultado do Perímetro é " + resultado);

                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o lado A: "); double ladoA = ler.nextDouble(); 
                        System.out.print("Digite a altura: "); double h = ler.nextDouble();
                        double resultado = plana.areaTriangulo (ladoA, h); 
                        System.out.println("O resultado da Área é " + resultado);

                    }


                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (4 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Triângulo Equilátero você deseja: Perímetro (1) / Área (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o lado: "); double lado = ler.nextDouble(); 
                        double resultado = plana.perimetroTrianguloEquilatero(lado); 
                        System.out.println("O resultado do Perímetro é " + resultado);
                    }

                    if (2 == escolhaFormula) {

                        System.out.print("Digite o lado: "); double lado = ler.nextDouble(); 
                        double resultado = plana.areaTrianguloEquilatero(lado); 
                        System.out.println("O resultado da Área é " + resultado);
                    }


                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (5 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Paralelogramo você deseja: Área (1) / Perímetro (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o lado A: "); double a = ler.nextDouble(); 
                        System.out.print("Digite a altura: "); double altura = ler.nextDouble();
                        double resultado = plana.areaParalelogramo(a, altura); 
                        System.out.println("O resultado da Área é " + resultado);
                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite o lado A: "); double a = ler.nextDouble(); 
                        System.out.print("Digite o lado B: "); double b = ler.nextDouble();
                        double resultado = plana.perimetroParalelogramo(a, b); 
                        System.out.println("O resultado do Perímetro é " + resultado);
                    }


                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }
                }
            
                else if (6 == escolhaFigura) {
                    System.out.printf("Qual cálculo de Losango você deseja: Perímetro (1) / Área (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (1 == escolhaFormula) {

                        System.out.print("Digite o lado: "); double lados = ler.nextDouble(); 
                        double resultado = plana.perimetroLosangulo(lados); 
                        System.out.println("O resultado do Perímetro é " + resultado);
                    }

                    else if (2 == escolhaFormula) {

                        System.out.print("Digite a Diagonal maior: "); double diagonalMaior = ler.nextDouble();
                        System.out.print("Digite a Diagonal menor: "); double diagonalMenor = ler.nextDouble();
                        double resultado = plana.areaLosangulo(diagonalMaior, diagonalMenor); 
                        System.out.println("O resultado da Área é " + resultado);
                    }



                    else if (0 == escolhaFormula) {
                        System.out.println("Programa encerrado. Até mais!");
                        break; 
                    }

                }

                
                else if (escolhaFigura == 7) {
                    System.out.printf("Qual cálculo de Trapézio você deseja: Área (1) / Perímetro (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (escolhaFormula == 1) {
                        System.out.print("Digite a Base Maior: ");
                        double baseMaior = ler.nextDouble();
                        System.out.print("Digite a Base Menor: ");
                        double baseMenor = ler.nextDouble();
                        System.out.print("Digite a Altura: ");
                        double altura = ler.nextDouble();
                        double resultado = plana.areaDoTrapezio(baseMaior, baseMenor, altura);
                        System.out.println("O resultado da Área é " + resultado);
                    } else if (escolhaFormula == 2) {
                        System.out.print("Digite o lado C: ");
                        double ladoC = ler.nextDouble();
                        System.out.print("Digite o lado D: ");
                        double ladoD = ler.nextDouble();
                        System.out.print("Digite a Base Maior: ");
                        double baseMaior = ler.nextDouble();
                        System.out.print("Digite a Base Menor: ");
                        double baseMenor = ler.nextDouble();
                        double resultado = plana.perimetroTrapezio(baseMaior, baseMenor, ladoC, ladoD);
                        System.out.println("O resultado do Perímetro é " + resultado);
                    } else if (escolhaFormula == 0) {
                        System.out.println("Programa encerrado. Até mais!");
                        break;
                    }
                }

                else if (escolhaFigura == 8) {
                    System.out.printf("Qual cálculo de Circunferência você deseja: Área (1) / Comprimento (2) / Sair (0) ");
                    escolhaFormula = ler.nextInt();

                    if (escolhaFormula == 1) {
                        System.out.print("Digite o Raio: ");
                        double raio = ler.nextDouble();
                        double resultado = plana.areaDoCirculo(raio);
                        System.out.println("O resultado da Área é " + resultado);
                    } else if (escolhaFormula == 2) {
                        System.out.print("Digite o Raio: ");
                        double raio = ler.nextDouble();
                        double resultado = plana.circunferenciaCirculo(raio);
                        System.out.println("O resultado do Comprimento é " + resultado);
                    } else if (escolhaFormula == 0) {
                        System.out.println("Programa encerrado. Até mais!");
                        break;
                    }
                }
            }

            else {
                System.out.println("Escolha inválida.");
            }
        }
    }

}