package spieler;
import java.util.ArrayList;
import daten.Karte;

public class Ablagestapel {

	private ArrayList<Karte> m_stapel;
	
	public Ablagestapel()
	{
		m_stapel = new ArrayList<Karte>();
	}
	
	public int anzahlKarten()
	{
		return m_stapel.size();
	}
	
	private void ablegen(Karte karte)
	{
		m_stapel.add(karte);
	}
	
	public ArrayList stapel()
	{
		return m_stapel;
	}
	
}
