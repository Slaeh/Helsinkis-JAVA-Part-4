import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String title = reader.nextLine();
            if(title.equals("")){
                System.out.println();
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(reader.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(reader.nextLine());

            books.add(new Book(pages,year,title));
        }
        System.out.print("What information will be printed? ");
        String input = reader.nextLine();
        if(input.equals("name")){
            for(Book i : books){
                System.out.println(i.getTitle());
            }
        }
        else if(input.equals("everything")){
            for(Book i: books){
                System.out.println(i);
            }
        }
    }
}
