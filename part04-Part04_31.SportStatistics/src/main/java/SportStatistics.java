
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> sport = new ArrayList<>();
        int counter =0, wins =0, losses=0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try(Scanner search = new Scanner(Paths.get(file))){
           while(search.hasNextLine()){
                sport.add(search.nextLine());
           }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for(String i : sport){
            String[] splitter = i.split(",");
            
            if(splitter[0].equals(team)){
                counter++;
                if(Integer.valueOf(splitter[2]) > Integer.valueOf(splitter[3])){
                    wins++;
                    }else{
                        losses++;
                    }  
                }
            
            if(splitter[1].equals(team)){
                counter++;
                if(Integer.valueOf(splitter[3]) > Integer.valueOf(splitter[2])){
                    wins++;
                    }else{
                        losses++;
                    }  
                }
            
            }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
 }

        
    


    