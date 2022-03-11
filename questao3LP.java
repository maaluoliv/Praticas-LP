import java.util.Scanner;
class Main {
  public static void main(String[] args) {

  Scanner Scan = new Scanner(System.in);
    
  String frase;
    
   
    System.out.println("Escreva a frase");
     frase = Scan.nextLine();
    frase = frase.toUpperCase();

    String vogais="";
    char c;
   
    for(int i=0; i<frase.lenght();i++)
  {
        c=frase.charAt(i);
        if (c=="A"||c=="E"||c=="I"||c=="O"||c=="U")
    {     
      vogais=vogais+Character.toString(c);
      System.out.println(vogais);
      }
    }
    
    
  }
}