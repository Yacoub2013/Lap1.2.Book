package Book;

public class MainClass {
    public static void printALL(Book[] bookList) {
        if (bookList != null) {
            for (Book book : bookList) {
                if (book != null) {
                    book.print();
                }
            }
        }
    }


    public static void main (String[]args){
        Publisher prospeck = new Publisher("Проспект", "Москва");
        Publisher piter = new Publisher("Пиер", "Санкт-Петербург");
        Publisher bhw = new Publisher("БХВ", "Санкт-Петебург");
        Publisher dialectika = new Publisher("Диалектика", "Киев");



        Book[] booklist = new Book[5];
        booklist[0] = new Book(new String[]{"Седжевик Роберт, ","Уэйн Кевин,"},"Computer Science: основы прогроммирования на Java, ООП, алгоритмы структуру данных", piter,2018);
        booklist[1] = new Book(new String[]{"Вингрерс Карл,"},"Разработка требований к программному обеспечению, 3-ое издание, дополненное",  bhw, 2019);
        booklist[2] = new Book(new String[]{"Гербердт Шилдт,"},"Java. Полное руководство, 10-ое издание",  dialectika,2018 );
        booklist[3] = new Book(new String[]{"Полубенцева М.И.,"},"C/C++. Процедурное программирование",bhw, 2017 );
        booklist[4] = new Book("Конституция РФ",prospeck, 2020);
        printALL(booklist);
        System.out.println();

        bhw.setCity("Санкт-Петербург");
        printALL(booklist);

    }
}


