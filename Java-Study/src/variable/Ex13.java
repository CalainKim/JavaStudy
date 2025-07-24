package variable;

public class Ex13 {
    public static void main(String[] args) {
        int hap = 0;
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for(int i =0; i<4; i++){
            hap += arr[i];
        }
        System.out.println("합계: " + hap);
    }
}
