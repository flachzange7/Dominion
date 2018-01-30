package spieler;

import java.util.Collections;

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
	
	private void mischen()
	{
		Collections.copy(m_ablagestapel.stapel(), m_nachziehstapel.stapel());
	}
	
}
