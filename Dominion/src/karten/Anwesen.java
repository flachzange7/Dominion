package karten;

import daten.Karte;
import daten.Karte.KartenTyp;

public class Anwesen extends Karte 
{
	private int m_punkte;
	public Anwesen()
	{
		super(4, 1, "Anwesen", KartenTyp.PUNKTE);
		m_punkte = 1;
	}
	
	public int punkte()
	{
		return m_punkte;
	}
}
