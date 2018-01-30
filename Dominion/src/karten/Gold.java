package karten;

import daten.Karte;
import daten.Karte.KartenTyp;

public class Gold extends Karte 
{
	private int m_wert;
	public Gold()
	{
		super(3, 6, "Gold", KartenTyp.GELD);
		m_wert = 3;
	}
	
	public int wert()
	{
		return m_wert;
	}
}
