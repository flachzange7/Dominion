package main;
import loader.SpielLoader;

import daten.Karte;
import daten.Vorrat;
import karten.*;
import spieler.Spieler;

public class DominionMain 
{

	public static void main(String[] args) 
	{
		Vorrat m_vorrat = new Vorrat();	
		SpielLoader loader = new SpielLoader(m_vorrat);
		loader.ladeSpielInfo("daten/BasisSpiel.xml");
		
		
		/*Spieler m_spieler = new Spieler();
		
		m_spieler.init();
		
		m_spieler.printSpielerInfo();
		
		m_spieler.karteAbwerfen();
		
		m_spieler.printSpielerInfo();*/
		
		m_vorrat.printVorrat();

	}

}
