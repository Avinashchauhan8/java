package array;
import java.util.*;
// linera search
public class Linearsearch{
    public static int L_search(int numbers[],int key ) {
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
       return -1; 
    }
    public static void main(String[] args) {
        int numbers[]={2,3,6,7,9,10};
        int key = 6;
        int index = L_search(numbers,key);
        if(index == -1){
System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}