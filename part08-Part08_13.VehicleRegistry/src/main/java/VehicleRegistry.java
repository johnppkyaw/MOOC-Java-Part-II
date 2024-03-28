import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
  private HashMap<LicensePlate, String> registry;

  public VehicleRegistry() {
    this.registry = new HashMap<>();
  }

  public boolean add(LicensePlate licensePlate, String owner) {
    if(registry.containsKey(licensePlate)) {
      return false;
    } else {
      registry.put(licensePlate, owner);
      return true;
    }
  }

  public String get(LicensePlate licensePlate) {
    return registry.get(licensePlate);
  }

  public boolean remove(LicensePlate licensePlate) {
    if(registry.containsKey(licensePlate)) {
      registry.remove(licensePlate);
      return true;
    } else {
      return false;
    }     
  }

  public void printLicensePlates() {
    for(LicensePlate licensePlate : this.registry.keySet()) {
      System.out.println(licensePlate);
    }
  }

  public void printOwners() {
    ArrayList<String> printedList = new ArrayList<>();
    for(String owner : this.registry.values()) {
      if(printedList.contains(owner)) {
        continue;
      } else {
        printedList.add(owner);
        System.out.println(owner);
      }
    }
  }

  
}
