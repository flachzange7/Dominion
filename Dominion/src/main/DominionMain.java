package main;
import daten.Vorrat;
import daten.Karte;

public class DominionMain 
{

	public static void main(String[] args) 
	{
		Vorrat m_vorrat = new Vorrat();
		
		Karte kupfer = new Karte();
		Karte silber = new Karte();
		Karte gold = new Karte();
		m_vorrat.addKarte(kupfer, 100);
		m_vorrat.addKarte(silber, 50);
		m_vorrat.addKarte(gold, 30);
		
		m_vorrat.printVorrat();

	}

}
