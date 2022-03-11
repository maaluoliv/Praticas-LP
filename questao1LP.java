import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);

    float numHoras, velocidadeM, distancia, kmLitro;

    System.out.println ("Horas de viagem");
    numHoras = Scan.nextFloat();

    System.out.println ("Velocidade média do veículo");
    velocidadeM = Scan.nextFloat();

    System.out.println (" Km por litro do veículo");
    kmLitro = Scan.nextFloat();

    distancia = velocidadeM*numHoras;

    System.out.println("consumo final=" + distancia/kmLitro); 
    }
}