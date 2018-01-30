package karten;

import daten.Karte;
import daten.Karte.KartenTyp;

public class Silber extends Karte 
{
	private int m_wert;
	public Silber()
	{
		super(2, 3, "Silber", KartenTyp.GELD);
		m_wert = 2;
	}
	
	public int wert()
	{
		return m_wert;
	}
}
