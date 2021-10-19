package lesson8.task7;

public class TestBook {

    public static void main(String[] args) {

        Author anAuthor = new Author("Nicci French", "french@nicci.com", 'f');
        Book aBook = new Book("Losing You", anAuthor, 9.95, 1500 );

        //Anonymous instance of author
        Book anotherBook = new Book("You", new Author("NotSure", "some@email.com", 'm'), 19.85, 2500);

        //Printing the name and email of the author from a Book instance.
        System.out.println("aBook author: " + aBook.getAuthor().getName());
        System.out.println("aBook authors e-mail: " + aBook.getAuthor().getEmail());


        System.out.println("aBook author via new method: " + aBook.getAuthorName());


    }
}
