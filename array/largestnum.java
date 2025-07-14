package array;

public class largestnum {
    public static int L_num(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i]; 
            }
        }
       return largest; 
    }
    public static void main(String[] args) {
        int numbers[] ={0,-2,-4,-7};
        System.out.println("iargest value is "+ L_num(numbers));
    }
}
