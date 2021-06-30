
package usodoif;


public class UsodoIf {

  
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int idade;
        System.out.println("digite sua idade ");
        idade = scan.nextInt();
         
        if ( idade>=18){
            System.out.println("voce é maior de idade");
        }else{
            System.out.println("voce é menor de idade");
        }
    }
    
}
