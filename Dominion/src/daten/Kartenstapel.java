package daten;

public class Kartenstapel 
{
	private Karte m_karte;
	private int m_anzahl;
	
	public Kartenstapel(Karte karte, int anzahl)
	{
		m_karte = karte;
		m_anzahl = anzahl;
	}
	
	public int anzahl()
	{
		return m_anzahl;
	}
	
	public Karte getKarte()
	{
		m_anzahl--;
		return m_karte;
	}

}
