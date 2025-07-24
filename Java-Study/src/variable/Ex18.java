package variable;

import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(Arrays.toString(arr1)); // 배열(정수) -> 배열(문자열)로

        int[] arr2 = {5,2,8};
        Arrays.sort(arr2); // 배열 오름차순 정렬

        int[] arr3 = {1,2,3};
        int[] copy = Arrays.copyOf(arr3, 5);
        // copy -> [1,2,3,0,0] // 배열을 복사하고 길이까지 지정

        int[] arr4 = {10,20,30,40};
        int[] sub = Arrays.copyOfRange(arr4, 1,3); // 1부터 3전까지 그냥 함수에서 1,3 이런식으로 나오면 1<3 로 생각하기
        //sub -> [20,30]

        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(Arrays.equals(a,b)); // true 값 출력

        int[] arr5 = new int[5];
        Arrays.fill(arr5,7); //7로 배열을 채워넣음
        // arr5 -> [7,7,7,7,7]

        int[] arr6 = {1,3,5,7}; // 이진 탐색은 정렬된 배열에만 사용 가능!
        int idx = Arrays.binarySearch(arr6, 5); // 2번째 index임을 찾아줌(이진 탐색 원리)








    }
}
