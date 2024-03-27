import java.util.ArrayList;
import java.util.List;

public class TodoList {
  private List<String> taskList;

  public TodoList() {
    this.taskList = new ArrayList<>();
  }

  public void add(String task) {
    this.taskList.add(task);    
  } 
  
  public void print() {
    for(int i = 0; i < this.taskList.size(); i++) {
      String currentTask = this.taskList.get(i);
      System.out.println((i+1) + ": " + currentTask);
    }
  }

  public void remove(int number) {
    this.taskList.remove(number - 1);
  }
}
