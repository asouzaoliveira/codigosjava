
package uri1174;

public class URI1174 {

    
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        double A[] = new double[100];
        
        for (int i = 0; i < A.length; i++) {
            
            A[i] = scan.nextDouble();
              }
        
        for (int i = 0; i < A.length; i++) {
            
        if ( A[i] <= 10){
                
                System.out.format("A[%d] = %.1f%n",i, A[i]);
            }
        }
    }
    
}
