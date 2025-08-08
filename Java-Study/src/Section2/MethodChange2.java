package Section2;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " +dataA.value);
        change(dataA);
        System.out.println("메서드 호출 후: dataA.value = "+ dataA.value);

    }
    static void change(Data dataX){ //dataX에 참조값 dataA라는 참조값을 넣어서 수정 가능
        dataX.value = 20;
    }
}
