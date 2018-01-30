package karten;

import daten.Karte;

public class Kupfer extends Karte 
{
	private int m_wert;
	public Kupfer()
	{
		super(1, 0, "Kupfer", KartenTyp.GELD);
		m_wert = 1;
	}
	
	public int wert()
	{
		return m_wert;
	}
}
