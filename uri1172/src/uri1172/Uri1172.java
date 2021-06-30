
package uri1172;

public class Uri1172 {

    
    public static void main(String[] args) {
       
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int X[] = new int[10];
        
        for (int i = 0; i < X.length; i++) {
            
            X[i] = scan.nextInt();     
        }
        for (int i = 0; i < X.length; i++) {
            
            if(X[i] <= 0){
                X[i] = 1;
            }
              
            }
         for (int i = 0; i < X.length; i++) {
                
                System.out.format("X[%d] = %d%n",i, X[i]);
            
        }
       
    }
    
}
