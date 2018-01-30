package daten;

public abstract class Karte {

	private int m_kosten;
	private String m_name;
	private String m_nutzen;
	private String m_typ;
	
	public Karte(){
		
	}
	
	public void setKosten(int kosten) {
		m_kosten = kosten;
	}
	
	public void setName(String name) {
		m_name = name;
	}
	
	public void setNutzen(String nutzen) {
		m_nutzen = nutzen;
	}
	
	public void setType(String typ) {
		m_typ = typ;
	}
	
	public int kosten() {
		return m_kosten;
	}
	
	public String name() {
		return m_name;
	}
	
	public String nutzen() {
		return m_nutzen;
	}
	
	public String typ() {
		return m_typ;
	}
	
	private void init(int kosten) {
		setKosten(kosten);
	}
	
}
