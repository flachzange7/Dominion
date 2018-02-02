package daten;

public abstract class Karte {

	private String m_id;
	private int m_kosten;
	private String m_name;
	private KartenTyp m_typ;
	
	private String m_nutzen;
	
	public enum KartenTyp
	{
		GELD, PUNKTE, AKTION_ANGRIFF, AKTION_REAKTION
	};
	
	public Karte(String id, int kosten, String name, KartenTyp typ)
	{
		m_id = id;
		m_kosten = kosten;
		m_name = name;
		m_typ = typ;
	}
	
	
	
	
	public void setNutzen(String nutzen) {
		m_nutzen = nutzen;
	}
	
	public String id()
	{
		return m_id; 
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
	
	public KartenTyp typ() {
		return m_typ;
	}
	
	//private void init(int kosten) {
	//	setKosten(kosten);
	//}
	
}
