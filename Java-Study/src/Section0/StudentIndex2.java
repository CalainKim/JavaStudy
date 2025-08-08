package Section0;

public class StudentIndex2 {
    public static void main(String[] args) {
        StudentInfor student1 = new StudentInfor();
        student1.name = "도은";
        student1.age = 22;
        student1.grade = 100;


        StudentInfor student2 = new StudentInfor();
        student2.name = "은도";
        student2.age = 24;
        student2.grade = 90;

        StudentInfor[] students = {student1, student2};
        // StudentInfor[] students = new StudentInfor[2]; 이렇게도 선언 가능

        for(int i=0; i<students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
        for(StudentInfor s : students){ // 향상된 for문도 사용 가능하다.
            System.out.println("이름: " + s.name + " 나이: "+ s.age + " 성적: "+s.grade);
        }
    }
}
