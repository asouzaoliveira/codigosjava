
package uri1173;


public class URI1173 {

    
    public static void main(String[] args) {
     
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int N[] = new int [10];
        
        int V;
        V = scan.nextInt();
        
     
        for (int i = 0; V < N.length; i++) {
            
            N[i] = V+=i+i;
            
            System.out.format("N[%d] = %d%n", i, N[i]);

        
        
    }
    
}
