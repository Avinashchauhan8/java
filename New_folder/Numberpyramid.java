

/*public class Numberpyramid {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >= n - i && j <= n + i) {
                    System.out.print(" " + num);
                     num++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}*/



public class Numberpyramid {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            int num = 1;

            // Print leading spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }

            // Print the pyramid values: exactly 2*i+1 numbers
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
/*public  class Numberpyramid{
public static void main(String args[]){
    int n=5;
printpyramid(n);
}
public static void printpyramid(int n){
int T_line = n;
int spaces=n-1;
int stars=1;
int curr_line=1;
while(curr_line<=T_line){
    for(int i=1;i<=spaces;i++){
        System.out.print(" ");
    }
    for(int i=1;i<=stars;i++){System.out.print(i+" "); }
System.out.println();
stars++;
spaces--;
curr_line++;

}
}


}*/
