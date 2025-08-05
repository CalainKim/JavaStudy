package variable;

public class Ex23 {
    public static void main(String[] args) {
        int []numbers = {1,2,3,4,5};
        //배열 탐색 - 일반 for문
        for(int i = 0; i<numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        // 향상된 for, for-each문이라고 한다.
        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}
