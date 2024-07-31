package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {

        // 영화 리뷰 정보를 선언하고 출력하자.
        // 배열과 for문을 사용하자.

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }

    }

}
