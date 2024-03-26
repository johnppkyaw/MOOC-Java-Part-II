
import java.util.Scanner;

public class LiquidContainers2 {

    public class Container {
        private int amount;
        public Container(){

        }
        public int contains() {
            return this.amount;
        }
        public void add(int amount) {
            if(amount > 0 || this.amount < 100) {
                if(this.amount + amount < 100) {
                    this.amount += amount;
                } else {
                    this.amount = 100;
                }                
            }
        }
        public 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
