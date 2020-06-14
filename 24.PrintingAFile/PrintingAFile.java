import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner reader = new Scanner(Paths.get("data.txt"))){
            while(reader.hasNextLine()){
                String input = reader.nextLine();
                System.out.println(input);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
