package variable;
import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        int index = Arrays.binarySearch(arr, 7);

        if(index >= 0){
            System.out.println("index는 "+ index +"입니다");
        }
        else{
            System.out.println("index가 없습니다.");
        }
    }
}
