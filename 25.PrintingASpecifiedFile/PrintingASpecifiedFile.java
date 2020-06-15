import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(input))) {
            while(reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        }catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }

        for(String i : lines){
            System.out.println(i);
        }

    }
}
