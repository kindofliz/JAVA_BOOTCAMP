package lesson8.task7;

public class AuthorTest {

    public static void main(String[] args) {

        Author anAuthor = new Author("Nicci French", "french@nicci.com", 'f');

        System.out.println(anAuthor);
        anAuthor.setEmail("another@email.com");
        System.out.println(anAuthor);



    }
}
