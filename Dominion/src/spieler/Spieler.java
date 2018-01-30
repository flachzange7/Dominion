package spieler;

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
	
	public void mischen()
	{
		m_nachziehstapel = new Nachziehstapel(m_ablagestapel);
		m_nachziehstapel.deckMischen();
	}
	
	public void spielerBekommtKarte(Karte karte)
	{
		m_ablagestapel.ablegen(karte);
	}
	
	public void printSpielerInfo()
	{
		System.out.println("Stapel: " + m_nachziehstapel);
	}
	
}
