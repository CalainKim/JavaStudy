package Section0;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview M1 = new MovieReview();
        MovieReview M2 = new MovieReview();

        M1.title = "인셉션";
        M2.title = "인생은 아름다워";
        M1.Review = "인생은 무한 루프";
        M2.Review = "인생 시간 영화";

        MovieReview[] M = {M1, M2}; // M1,M2를 담기 위한 임시 객체 M
        for(MovieReview i : M){
            System.out.println("제목: " +i.title+ ", 리뷰: "+i.Review);
        }





    }
}
