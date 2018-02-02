package karten;

import daten.Karte;
import daten.Karte.KartenTyp;

public class GeldKarte extends Karte
{
	private int m_wert;
	
	public GeldKarte(String id, String name, int kosten, int wert) 
	{
		super(id, kosten, name, KartenTyp.GELD);
		m_wert = wert;
	}
	
	int wert()
	{
		return m_wert;
	}

}
