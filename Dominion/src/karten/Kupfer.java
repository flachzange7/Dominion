package karten;

import daten.Karte;

public class Kupfer extends Karte 
{
	private int m_wert;
	public Kupfer()
	{
		setName("Kupfer");
		setKosten(0);
		m_wert = 1;
	}
	
	public int wert()
	{
		return m_wert;
	}
}
