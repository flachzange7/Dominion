package spieler;

import java.util.ArrayList;
import java.util.Collections;

import daten.Karte;

public class Spieler {
	
	private Hand m_hand;
	private Ablagestapel m_ablagestapel;
	private Nachziehstapel m_nachziehstapel;
	
	public Spieler()
	{
		m_hand = new Hand();
		m_ablagestapel = new Ablagestapel();
		m_nachziehstapel = new Nachziehstapel();
	}
	
// Nachziehstapel
	
	public void mischen()
	{
		m_nachziehstapel = new Nachziehstapel(m_ablagestapel);
		m_ablagestapel.leeren();
		m_nachziehstapel.deckMischen();
	}
	
	public void printSpielerInfo()
	{
		System.out.println("Nachziehstapel: " + m_nachziehstapel);
		System.out.println("Hand: " + m_hand);
		System.out.println("Ablagestapel: " + m_ablagestapel);
	}
	
// Ablagestapel
	
	public void spielerBekommtKarte(Karte karte)
	{
		m_ablagestapel.ablegen(karte);
	}
	
// Hand
	
	public void standardKartenZiehen()
	{
		m_hand.karteZiehen(m_nachziehstapel.bekommeKarte());
	}
	
	public void karteAbwerfen()
	{
		m_ablagestapel.ablegen(m_hand.karteAbwerfen());
	}
	
	/*public void aktionKartenZiehen(Karte karte, int anzahl)
	{
		
	}*/
	
}
