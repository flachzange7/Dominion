package karten;

import daten.Karte;

public class Silber extends Karte 
{
	private int m_wert;
	public Silber()
	{
		setName("Silber");
		setKosten(3);
		m_wert = 2;
	}
	
	public int wert()
	{
		return m_wert;
	}
}
