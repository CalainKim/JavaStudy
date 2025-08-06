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
        // 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 됨.
        // 단순히 해당 배열을 처음부터 끝까지 탐색.  (배열의 인덱스를 사용하지 않고도 배열의 요소를 순회하는 것이 가능)
        // iter 단축키를 사용하면 한번에 foreach를 만들어줌
        // 증가하거나 감소하는 i의 index를 사용해야 할 때에는 사용 x
        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}
