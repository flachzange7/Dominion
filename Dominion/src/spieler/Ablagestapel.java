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
	
	public void ablegen(Karte karte)
	{
		m_stapel.add(karte);
	}
	
	public ArrayList<Karte> stapel()
	{
		return m_stapel;
	}
	
	public void leeren()
	{
		m_stapel.clear();
	}
	
	@Override
	public String toString()
	{
		String ausgabe = "";
		for(int i = 0; i != m_stapel.size(); i++)
			ausgabe += m_stapel.get(i).name() + ", ";
		return ausgabe;
	}
	
}
