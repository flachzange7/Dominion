package daten;


import java.util.ArrayList;

public class Vorrat 
{
	private ArrayList<Kartenstapel> m_stapel;
	public Vorrat()
	{
		m_stapel = new ArrayList<Kartenstapel>();
	}
	
	public void addKarte(Karte karte, int anzahl)
	{
		Kartenstapel neuerStapel = new Kartenstapel(karte, anzahl);
		m_stapel.add(neuerStapel);
	}
	
	public void printVorrat()
	{
		for(int i = 0; i != m_stapel.size(); i++)
		{
			System.out.println("Kartenname: " + m_stapel.get(i).anzahl());
		}
	}
	
}
