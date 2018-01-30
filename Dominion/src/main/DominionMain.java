package main;
import daten.Vorrat;
import karten.*;

public class DominionMain 
{

	public static void main(String[] args) 
	{
		Vorrat m_vorrat = new Vorrat();
		
		Kupfer kupfer = new Kupfer();
		Silber silber = new Silber();
		Gold gold = new Gold();
		m_vorrat.addKarte(kupfer, 100);
		m_vorrat.addKarte(silber, 50);
		m_vorrat.addKarte(gold, 30);
		
		m_vorrat.printVorrat();

	}

}
