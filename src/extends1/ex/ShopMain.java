package extends1.ex;

public class ShopMain {


    public static void main(String[] args) {

        // 다음 코드를 참고해서 Item , Book , Album , Movie 클래스를 만들어보자
        // 부모 클래스
        // - Item : 이름(name), 가격(price)
        // 자식 클래스
        // - Book : 저자(author), isbn(isbn)
        // - Album : 아티스트(artist)
        // - Movie : 감독(director), 배우(actor)

        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000,"감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);

    }

}
