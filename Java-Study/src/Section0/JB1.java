package Section0;

public class JB1 {
    public static void main(String[] args) {
        int[] StudentAge = {15, 16};
        int[] StudentGrade = {90, 80};
        String[] StudentName = {"학생1", "학생2"};

        for(int i=0; i<StudentName.length; i++){
            System.out.println("이름: " +StudentName[i]+" 나이: "+StudentAge[i]+" 성적: "+StudentGrade[i]);
        }
    }
}
