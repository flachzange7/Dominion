package karten;

import daten.Karte;

public class PunkteKarte extends Karte
{
	private int m_punkte;
	
	public PunkteKarte(String id, String name, int kosten, int punkte) 
	{
		super(id, kosten, name, KartenTyp.PUNKTE);
		m_punkte = punkte;
	}
	
	int punkt()
	{
		return m_punkte;
	}

}
