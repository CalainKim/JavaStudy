package Method;

public class Method1 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("programing");
        printFooter();
    }
    //void 함수는 return x
    public  static void printHeader(){
        System.out.println("program start");
    }

    public static void printFooter(){
        System.out.println("program end");
    }
}

