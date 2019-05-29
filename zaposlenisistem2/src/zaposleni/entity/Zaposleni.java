 package zaposleni.entity;  
     import java.io.Serializable;  
   
  public class Zaposleni implements Serializable{  
     
    private int zaposleni_id;  
   private String ime;  
    private int godine;  
    private String adresa;  
   private int dohodak;  
   
   public int getZaposleni_id() {  
      return zaposleni_id;  
   }  
    public String getIme() {  
      return ime;  
    }  
    public int getGodine() {  
      return godine;  
    }  
    public String getAdresa() {  
      return adresa;  
    }  
    public int getDohodak() {  
      return dohodak;  
   }  
    public void setZaposleni_id(int zaposleni_id) {  
      this.zaposleni_id = zaposleni_id;  
    }  
    public void setIme(String ime) {  
     this.ime = ime;  
    }  
    public void setGodine(int godine) {  
      this.godine = godine;  
   }  
    public void setAdresa(String adresa) {  
      this.adresa = adresa;  
    }  
    public void setDohodak(int dohodak) {  
      this.dohodak = dohodak;  
    }  
    
    public Zaposleni(String ime, int godine, String adresa, int dohodak) {  
      this.ime = ime;  
      this.godine = godine;  
      this.adresa = adresa;  
      this.dohodak = dohodak;  
    }  
    public Zaposleni() {}  
      
      
      
  }  