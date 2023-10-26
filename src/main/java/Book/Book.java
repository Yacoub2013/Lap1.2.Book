package Book;
import java.util.Arrays;
public class Book {
    private String nameBook; // название книги
    private Publisher namePublisher; // ссылка на экземляр издательство
    private int year; // год издания
    private String[] author; // автор книги


    public String getNamebook() {
        return nameBook;
    }

    public Book(String nameBook, Publisher namePublisher, int year) {
        setNameBook(nameBook);
        setNamePublisher(namePublisher);
        setYear(year);


    }

    public Book(String[] author, String nameBook, Publisher namePublisher, int year) {
        setNameBook(nameBook);
        setNamePublisher(namePublisher);
        setYear(year);
        setAuthor(author);
    }


    public void setNameBook(String nameBook) {
        if (nameBook.isEmpty()) {
            throw new IllegalArgumentException("Напишите название книги");
        } else {
            this.nameBook = nameBook;

        }
    }

    public Publisher getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(Publisher namePublisher) {
        if (namePublisher == null) {
            throw new IllegalArgumentException("Укажите название издательство!");
        } else {
            this.namePublisher = namePublisher;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Введите коректное значение года");
        } else {
            this.year = year;
        }
    }

    public String[] getAuthor() {
        return author;
    }

    public int getAuthors() {
        return author.length;
    }

    public void setAuthor(String... author) {
        if (author != null && author.length > 0 && !Arrays.asList(author).stream().anyMatch(String::isBlank)) {
            if (this.author== null) {
                this.author = author;

            } else {
                String[] newauthor = Arrays.copyOf(this.author, this.author.length + author.length);
                System.arraycopy(author, 0, newauthor, this.author.length, author.length);
                this.author = newauthor;
            }
        } else {
            throw new IllegalArgumentException("Книга не существует");
        }

    }

    public String getAuthor(int index) {
        try {
            return author[index];
        } catch (Exception e) {
            System.out.println("Введите индекс автора");
            return null;
        }

    }

    public void print() {
        if (author != null) {
            System.out.print("");
            for (String authors :author) {
                System.out.print(authors);
            }
        } else {
            System.out.print("");

        }

        System.out.print(nameBook+ ", ");
        namePublisher.print();

        System.out.println(year+".");




    }


}
