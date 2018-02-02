package daten;
import karten.*;

import java.util.ArrayList;

public class Vorrat 
{
	private ArrayList<EinheitsKartenStapel> m_stapel;
	public Vorrat()
	{
		m_stapel = new ArrayList<EinheitsKartenStapel>();
		
		/* initialisiere Vorrat von Basis-Spiel
		EinheitsKartenStapel kupferStapel = new EinheitsKartenStapel(new Kupfer(), 100);
		EinheitsKartenStapel silberStapel = new EinheitsKartenStapel(new Silber(), 80);
		EinheitsKartenStapel goldStapel = new EinheitsKartenStapel(new Gold(), 50);
		
		EinheitsKartenStapel anwesenStapel = new EinheitsKartenStapel(new Anwesen(), 20);

		m_stapel.add(kupferStapel);
		m_stapel.add(silberStapel);
		m_stapel.add(goldStapel);
		m_stapel.add(anwesenStapel); */
		
	}
	
	public void addStapel(EinheitsKartenStapel stapel)
	{
		m_stapel.add(stapel);
	}
	
	public Karte nimmKarteVonVorrat(String id)
	{
		for(int i = 0; i != m_stapel.size(); i++)
		{
			if(m_stapel.get(i).karte().id().equals(id))
				return m_stapel.get(i).zieheKarte();
		}
		
		return null;
	}
	
	
	
	public void printVorrat()
	{
		for(int i = 0; i != m_stapel.size(); i++)
		{
			System.out.println(m_stapel.get(i).karte().name()+ ": " + m_stapel.get(i).anzahl());
		}
	}
	
}
