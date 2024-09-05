import java.util.Scanner;
public class GettingInputs {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

            System.out.println("Enter the Year:");
            int year = myScanner.nextInt();

            System.out.println("Enter The Genre:");
            String genre = scan.nextLine();
            
            System.out.println("Enter the album:");
            String album = scan.nextLine();
            
            System.out.println("Enter the Song:");
            String title = scan.nextLine();
            
            System.out.println("Enter the Artist:");
            String artist = scan.nextLine();
            
            System.out.println("Enter the Year:" + year);
            System.out.println("Enter the Genre: " + genre);
            System.out.println("Enter the Album:" + album);
            System.out.println("Enter the Song Title: " + title);
            System.out.println("Enter the Arist:" + artist);

            myScanner.close();

        }
        
    }
