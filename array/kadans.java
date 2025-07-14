package array;

public class kadans {
     public static void kadans(int numbers[]) {
        
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<numbers.length;i++){
           currsum=0+numbers[i];
        if(currsum<0){
            currsum=0;
        } 
        maxsum=Math.max(currsum, maxsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
kadans(numbers);
    }
    
}
