

public class Butterfly {
    public static void main(String[] args) {
        printbutterfly(5);
    }

    static void printbutterfly(int n){
        int row=n+1;
        

        // print  up right triangle
        for(int i=1;i<row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }

        // print  down right triangle
        
        for(int i=row-1;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" * ");

            }
            System.out.println();
        }

    }

}
