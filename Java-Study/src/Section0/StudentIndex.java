package Section0;

public class StudentIndex {
    public static void main(String[] args) {
        StudentInfor student1 = new StudentInfor();
        student1.name = "도은";
        student1.age = 22;
        student1.grade = 100;


        StudentInfor student2 = new StudentInfor();
        student2.name = "은도";
        student2.age = 24;
        student2.grade = 90;

        StudentInfor[] students = new StudentInfor[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: "+students[0].name+ " 나이: "+students[0].age+" 성적: "+students[0].grade);
        System.out.println("이름: "+students[1].name+ " 나이: "+students[1].age+" 성적: "+students[1].grade);
    }
}
