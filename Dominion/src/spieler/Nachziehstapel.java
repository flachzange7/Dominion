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
	
	private void deckMischen()
	{
		Collections.shuffle(m_stapel);
	}
	
	public ArrayList stapel()
	{
		return m_stapel;
	}
	
}
