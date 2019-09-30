package kategorija;

import java.util.List;

public class Zaidimas {
  private String zanras;
  private Platforma platforma;
  private List<String> papildoma_informacija;

  public Zaidimas(String zanras, Platforma platforma, List<String> papildoma_informacija) {
    this.zanras = zanras;
    this.platforma = platforma;
    this.papildoma_informacija = papildoma_informacija;
  }

  public String getZanras() {
    return zanras;
  }

  public void setZanras(String zanras) {
    this.zanras = zanras;
  }

  public Platforma getPlatforma() {
    return platforma;
  }

  public void setPlatforma(Platforma platforma) {
    this.platforma = platforma;
  }

  public List<String> getPapildoma_informacija() {
    return papildoma_informacija;
  }

  public void setPapildoma_informacija(List<String> papildoma_informacija) {
    this.papildoma_informacija = papildoma_informacija;
  }
}
