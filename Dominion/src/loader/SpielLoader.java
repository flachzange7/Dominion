package loader;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import daten.EinheitsKartenStapel;
import daten.Vorrat;
import karten.PunkteKarte;

public class SpielLoader 
{
	private Vorrat m_vorrat;
	public SpielLoader(Vorrat vorrat)
	{
		m_vorrat = vorrat;
	}
	
	public void ladeSpielInfo(String dateiname)
	{
		try
		{
			File fXmlFile = new File(dateiname);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("Karte");

			for (int temp = 0; temp < nList.getLength(); temp++) 
			{
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					
					switch(eElement.getAttribute("typ").toString())
					{
					case ("punkte"):
						ladePunkteKarte(eElement);
						break;
					
					default:
						
					}
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void ladePunkteKarte(Element element)
	{
		String id = element.getAttribute("id").toString();
		String name = element.getAttribute("name").toString();
		int kosten = Integer.valueOf(element.getAttribute("kosten")).intValue();
		int wert = Integer.valueOf(element.getAttribute("wert")).intValue();
		int anzahl = Integer.valueOf(element.getAttribute("anzahl")).intValue();
		
		PunkteKarte karte = new PunkteKarte(id, name, kosten, wert);
		
		EinheitsKartenStapel stapel = new EinheitsKartenStapel(karte, anzahl);
		m_vorrat.addStapel(stapel);
	}
}
