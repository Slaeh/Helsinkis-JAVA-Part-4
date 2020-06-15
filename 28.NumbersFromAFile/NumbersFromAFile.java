import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        int counter =0;
        System.out.print("File? ");
        String file = scanner.nextLine();

        try(Scanner input = new Scanner(Paths.get(file))){
            while(input.hasNextLine()){
                lines.add(input.nextLine());
            }
        }catch(Exception e){
            System.out.println("Not there");
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        for(String i : lines){
            if(Integer.valueOf(i) >= lowerBound && Integer.valueOf(i) <= upperBound ){
                counter++;
            }
        }
        System.out.println("Numbers: " + counter);
    }

}
