package spieler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import daten.Karte;

public class Nachziehstapel {

	private ArrayList<Karte> m_stapel;
	
	public Nachziehstapel() 
	{
		m_stapel = new ArrayList<Karte>();
	}
	
	public Nachziehstapel(Ablagestapel altStapel)
	{
		m_stapel = new ArrayList<Karte>(altStapel.stapel());
	}
	
	public void deckMischen()
	{
		Collections.shuffle(m_stapel);
	}
	
	public ArrayList<Karte> stapel()
	{
		return m_stapel;
	}
	
	public Karte bekommeKarte()
	{
		Karte karte = m_stapel.get(0);
		m_stapel.remove(0);
		return karte;
	}
	
	public void alleKartenAbwerfen(Ablagestapel m_ablagestapel)
	{
		while(m_stapel.isEmpty() != true)
		{
			m_ablagestapel.ablegen(m_stapel.get(0));
			m_stapel.remove(0);
		}
	}
	
	@Override
	public String toString()
	{
		String ausgabe = "";
		if(m_stapel.isEmpty() == true)
			ausgabe = "Stapel ist leer!";
		else
		{
			for(int i = 0; i != m_stapel.size(); i++)
				ausgabe += m_stapel.get(i).name() + ", ";
		}
		return ausgabe;
	}
	
}
