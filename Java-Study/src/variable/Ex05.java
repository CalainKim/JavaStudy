package variable;

public class Ex05 {
    public static void main(String[] args) {
        byte byteValue1 = 2;
        byte byteValue2 = 4;
        byte byteResult = (byte)(byteValue1 + byteValue2);

        System.out.println("Byte: "+ byteResult);

        short shortValue1 = 2;
        short shortValue2 = 4;
        short shortResult = (short)(shortValue1 + shortValue2);

        System.out.println("Short: " + shortResult);

        int intValue1 =2;
        int intValue2 = 4;
        int intResult = intValue1 + intValue2;

        System.out.println("int: "+ intResult);

        long longValue1 = 2L;
        long longValue2 = 4L;
        long longResult = longValue1 + longValue2;

        System.out.println("long: "+ longResult);

        float floatValue1 = 2.0f;
        float floatValue2 = 4.0f; // 만약 f를 안부이면 기본으로는 double로 간주
        float floatResult = floatValue1 + floatValue2;

        System.out.println("float: "+ floatResult);

        double doubleValue1 = 2.0;
        double doubleValue2 = 4.0;
        double doubleResult = doubleValue1+doubleValue2;

        System.out.println("Double: " + doubleResult);

        boolean booleanValue = false;

        System.out.println("Boolean "+ booleanValue);

        char charValue = 'a'; // 자바에서 char는 하나의 문자만 다룰 수 있다.
        System.out.println("char: "+ charValue);

        String stringValue1 = "doeun";
        System.out.println("String: " + stringValue1);



    }
}
