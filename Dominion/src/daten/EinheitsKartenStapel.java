package daten;

public class EinheitsKartenStapel 
{
	private Karte m_karte;
	private int m_anzahl;
	
	public EinheitsKartenStapel(Karte karte, int anzahl)
	{
		m_karte = karte;
		m_anzahl = anzahl;
	}
	
	public int anzahl()
	{
		return m_anzahl;
	}
	
	public Karte zieheKarte()
	{
		m_anzahl--;
		return m_karte;
	}
	
	public Karte karte()
	{
		return m_karte;
	}

}
