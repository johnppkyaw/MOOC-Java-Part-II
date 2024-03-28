import java.util.HashMap;

public class IOU {
  private HashMap<String, Double> owedList;
  
  public IOU() {
    this.owedList = new HashMap<>();
  }

  public void setSum(String toWhom, double amount) {
    double amountOwed = this.owedList.getOrDefault(toWhom,0.00);
    amountOwed += amount;
    this.owedList.put(toWhom, amountOwed);
  }

  public double howMuchDoIOweTo(String toWhom) {
    return this.owedList.getOrDefault(toWhom, 0.00);
  }

  
}
