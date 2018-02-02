package karten;

import daten.Karte;
import daten.Karte.KartenTyp;

public class AktionsKarte extends Karte
{
	private int m_punkte;
	
	public AktionsKarte(String id, String name, int kosten) 
	{
		super(id, kosten, name, KartenTyp.AKTION_ANGRIFF);
	}
	
	void aktion()
	{
		System.out.println("AKTION!");
	}
}
