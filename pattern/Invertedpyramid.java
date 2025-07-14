
public class Invertedpyramid {
    public static void printinverpyramid(int n) {
       
    
       for(int i = 1;i<=n;i++){
    //    print spaces
    for(int j=1;j<=n-i;j++){System.out.print(" ");
}
// print stars
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }
        System.out.println();
       }
      
        
    }
    // half number pyramid
    public static void half_num_pyramid(int n) {
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            
            }
            System.out.println();
        }
        
    }
    public static void num_pyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    // number pyramid
    public static void pyramid(int n) {
        // int counter =1;
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print(i+" " );
                // counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // printinverpyramid(6);
        // half_num_pyramid(5);
        // num_pyramid(6);
        pyramid(5);
    }
}
