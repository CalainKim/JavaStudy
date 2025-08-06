package Java_basic;

public class StudentClass {
    public static void main(String[] args) {
        StudentInfor student1 = new StudentInfor();
        student1.name = "도은";
        student1.age = 22;
        student1.grade = 100;


        StudentInfor student2 = new StudentInfor();
        student2.name = "은도";
        student2.age = 24;
        student2.grade = 90;

        System.out.println("이름: "+student1.name+ " 나이: "+student1.age+" 성적: "+student1.grade);
    }
}
