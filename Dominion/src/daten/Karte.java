package daten;

public abstract class Karte {

	private int m_kosten;
	private String m_name;
	private String m_nutzen;
	private String m_typ;
	
	Karte(){
		
	}
	
	private void kosten_set(int kosten) {
		m_kosten = kosten;
	}
	
	private void name_set(String name) {
		m_name = name;
	}
	
	private void nutzen_set(String nutzen) {
		m_nutzen = nutzen;
	}
	
	private void typ_set(String typ) {
		m_typ = typ;
	}
	
	private int kosten_get() {
		return m_kosten;
	}
	
	private String name_get() {
		return m_name;
	}
	
	private String nutzen_get() {
		return m_nutzen;
	}
	
	private String typ_get() {
		return m_typ;
	}
	
	private void init(int kosten) {
		kosten_set(kosten);
	}
	
}
