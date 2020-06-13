public class Book {
    private int pages;
    private int year;
    private String title;

    public Book(int pages, int year, String title){
        this.pages = pages;
        this.year = year;
        this.title = title;
    }

    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

    public String getTitle(){
        return this.title;
    }

}
