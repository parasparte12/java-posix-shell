import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage


         Scanner sc=new Scanner(System.in);
        // sc.nextLine();
         // Stage 2
        //  String input=sc.nextLine();
        //  System.out.println(input +": command not found");

        // Stage 3
        while(true){
            System.out.print("$ ");
            String input=sc.nextLine();
            // this if statement is stage 4 task
             if(input.equals("exit")){
                break;
            }
            else if(input.startsWith("echo")){
                System.out.println(input.substring(5)); // here echo is upto 3 index and space is 4th index so we start from 5th index so after echo we have to print .

            }else{
            System.out.println(input +": command not found");

            }
                     System.out.print("$ ");

            
           
            
           
        }
    }
}
