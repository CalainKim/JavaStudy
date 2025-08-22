package Section5;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){
        this(name, age, 50); // 생성자 내부에서 자신의 생성자 호출
    }

    MemberConstruct(String name, int age, int grade){ // 생성자 이름은 클래스 이름과 똑같이
        System.out.println("생성자 호출 name= " + name + ",age = "+age + ",grade = " + grade);
        this.name =name;
        this.age = age;
        this.grade = grade;
    }
}
