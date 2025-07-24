package variable;

public class Ex20 {
    String name;
    public void setNam(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Ex20 per = new Ex20(); // 객체 생성
        per.setNam("철수");
        System.out.println(per.name);
    }
}
