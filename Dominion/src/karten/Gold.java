package karten;

import daten.Karte;

public class Gold extends Karte 
{
	private int m_wert;
	public Gold()
	{
		setName("Gold");
		setKosten(6);
		m_wert = 3;
	}
	
	public int wert()
	{
		return m_wert;
	}
}
