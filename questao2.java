import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner Scan = new Scanner(System.in);
    
    String placa;
    short ano; 

    System.out.println ("Placa do Carro");
    placa = Scan.next();
    System.out.println ("Ano do carro");
    ano = Scan.nextShort();

    
    if (ano<=2010)
      System.out.println ("Carro velho");
    else if (ano<=2021)
      System.out.println (" Carro seminovo");
    else if (ano == 2022)
      System.out.println ("Carro novo");
    else
      System.out.println (" Ano inválido");

    placa = placa . replace ("A", "*") ; 
    placa = placa . replace ("E", "*") ; 
    placa = placa . replace ("I", "*") ; 
    placa = placa . replace ("O", "*") ; 
    placa = placa . replace ("U", "*") ; 
    placa = placa . replace ("a", "*") ; 
    placa = placa . replace ("e", "*") ; 
    placa = placa . replace ("i", "*") ; 
    placa = placa . replace ("o", "*") ; 
    placa = placa . replace ("u", "*") ; 

    System.out.println ("A placa é: " + placa);
     
  }
}