package main;
import daten.Karte;
import daten.Vorrat;
import karten.*;
import spieler.Spieler;

public class DominionMain 
{

	public static void main(String[] args) 
	{
		Vorrat m_vorrat = new Vorrat();		
		Spieler m_spieler = new Spieler();
		
		m_spieler.init(m_vorrat);
		
		m_spieler.printSpielerInfo();
		
		m_spieler.karteAbwerfen();
		
		m_spieler.printSpielerInfo();
		
		m_vorrat.printVorrat();

	}

}
