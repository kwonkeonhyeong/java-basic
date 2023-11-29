package src.class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간영화";

        MovieReview[] movies = {inception, aboutTime};

        for (MovieReview m : movies) {
            System.out.println("영화 제목 : " + m.title + ", 리뷰 : " + m.review);
        }

        System.out.println("영화 제목 : " + movies[0].title + ", 리뷰 : " + movies[0].review);
        System.out.println("영화 제목 : " + movies[1].title + ", 리뷰 : " + movies[1].review);
    }
}
