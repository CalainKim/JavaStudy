package variable;

public class Ex14 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10,20,30,40};

        for(int x : arr){
            sum += x;
        }
        System.out.println(sum);
    }
}
