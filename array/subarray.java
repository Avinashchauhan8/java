package array;

public class subarray {
    public static void sub_arr(int num[]) {
        int n= num.length;
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(   num[k]+" ");
                }
                System.out.println();
            } 
            
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,3,5,7};
        sub_arr(num);
    }
}
