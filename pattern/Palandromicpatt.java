

public class Palandromicpatt {
    public static void palanpattern(int n) {
        for(int i=1;i<=n;i++){

            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }



            for(int j=-i;j<=i;j++){
                if (j==0  || j == -1) {
                    continue;
                }
                if (j<0) {
                System.out.print(-j + " ");
                    
                }
                else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        palanpattern(4);
    }
    
}
