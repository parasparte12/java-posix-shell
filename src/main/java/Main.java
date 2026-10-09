import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
         System.out.print("$ ");


         Scanner sc=new Scanner(System.in);
        // sc.nextLine();
         // Stage 2
        //  String input=sc.nextLine();
        //  System.out.println(input +": command not found");

        // Stage 3
        while(true){
            String input=sc.nextLine();
            System.out.println(input +": command not found");
            System.out.print("$");
        }
    }
}
