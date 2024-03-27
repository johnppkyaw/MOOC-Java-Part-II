import java.util.Scanner;

public class UserInterface {
  private TodoList list;
  private Scanner scanner;
  public UserInterface(TodoList list, Scanner s) {
    this.list = list;
    this.scanner = s;
  }
  public void start() {
    String commandString;
    String task;
    int taskId;
    while(true) {
      System.out.print("Command: ");
      commandString = this.scanner.nextLine();
      if(commandString.equals("add")) {
        System.out.print("To add: ");
        task = this.scanner.nextLine();
        this.list.add(task);
      }
      if(commandString.equals("list")) {
        this.list.print();
      }
      if(commandString.equals("remove")) {
        System.out.print("Which one is removed? ");
        taskId = Integer.parseInt(scanner.nextLine());
        this.list.remove(taskId);
      }
      if(commandString.equals("stop")) {
        break;
      }
    }
  }  
}
