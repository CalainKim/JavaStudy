package variable;

public class java_algorithm {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 2, 10, 6, 15, 7};

        int max = numbers[0]; // 첫 번째 요소를 최대값으로 설정

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // 더 큰 값이 나오면 max를 갱신
            }
        }

        System.out.println("배열에서 가장 큰 수는: " + max);
    }
}
