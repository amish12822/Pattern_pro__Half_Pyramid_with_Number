/**
 * half_pyramid_with_number
 */
public class half_pyramid_with_number {

    public static void main(String[] args) {
        
        int a = 5; // row or column
    
        for (int i=1; i<=a; i++){

            for ( int j=1; j<=i; j++){

                System.out.print(j);
            }

            System.out.println();
        }
    }
}