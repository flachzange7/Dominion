package spieler;

import java.util.ArrayList;

import daten.Karte;

public class Hand {

	private ArrayList<Karte> m_hand;
	
	public Hand()
	{
		m_hand = new ArrayList<Karte>();
	}
	
	public void karteZiehen(Karte karte)
	{
		m_hand.add(karte);
	}
	
	public Karte karteAbwerfen()
	{
		Karte karte = m_hand.get(0);
		m_hand.remove(0);
		return karte;
	}
	
	@Override
	public String toString()
	{
		String ausgabe = "";
		for(int i = 0; i != m_hand.size(); i++)
			ausgabe += m_hand.get(i).name() + ", ";
		return ausgabe;
	}
	
}
