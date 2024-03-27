import java.util.HashMap;

public class Abbreviations {
  private HashMap<String, String> abbrList;
  public Abbreviations(){
    this.abbrList = new HashMap<>();
  }
  public void addAbbreviation(String abbreviation, String explanation) {
    if(!this.hasAbbreviation(abbreviation)) {
      this.abbrList.put(abbreviation, explanation);
    }
  }
  public boolean hasAbbreviation(String abbreviation) {
    if (this.abbrList.containsKey(abbreviation)) {
      return true;
    } else {
      return false;
    }
  }
  public String findExplanationFor(String abbreviation) {
    return this.abbrList.get(abbreviation);
  }
    
}
