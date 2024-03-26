
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            
            System.out.print("> ");
            System.out.println("First: " + container1);
            System.out.print("> ");
            System.out.println("Second: " + container2);


            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] commandList = input.split(" ");
            String command = commandList[0];
            int number = Integer.parseInt(commandList[1]); 
            if (command.equals("add")) {
                container1.add(number);                
            }
            if (command.equals("remove")) {
                container2.remove(number);                
            }
            if (command.equals("move")) {
                int container1Amt = container1.contains();
                if(container1Amt > number) {
                    container1.remove(number);
                    container2.add(number); 
                } else {
                    container1.remove(number);
                    container2.add(container1Amt); 
                }             
            }
        }
        scan.close();
    }

}
