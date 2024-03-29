import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StorageFacility {
  HashMap<String, ArrayList<String>> storageUnit;

  public StorageFacility() {
    this.storageUnit = new HashMap<>();
  }

  public void add(String unit, String item) {
    this.storageUnit.putIfAbsent(unit, new ArrayList<>());
    this.storageUnit.get(unit).add(item);
  }
  public ArrayList<String> contents(String storageUnit) {
    this.storageUnit.putIfAbsent(storageUnit, new ArrayList<>());
    return this.storageUnit.get(storageUnit);
  }

  public void remove(String storageUnit, String item) {
    if(this.storageUnit.containsKey(storageUnit)) {
      this.storageUnit.get(storageUnit).remove(item);
      if(this.storageUnit.get(storageUnit).isEmpty()) {
        this.storageUnit.remove(storageUnit);
      }
    }
  }

  public ArrayList<String> storageUnits() {
    ArrayList<String> storageUnitList = new ArrayList<>();
    for(String unit : this.storageUnit.keySet()) {
      storageUnitList.add(unit);
    }
    return storageUnitList;
  }
    
}
