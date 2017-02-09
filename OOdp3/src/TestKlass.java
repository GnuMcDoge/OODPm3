import java.util.List;
import java.util.Scanner;

import javax.swing.border.EmptyBorder;

public class TestKlass {

	public static void main(String[] args) {
		Scanner textScan = new Scanner(System.in);
		PlainText plaintext = new PlainText();
		StructuredTextDocument structuredTextDocument = new StructuredTextDocument();
		Element element;
		List<Element> element2;
	ElementFactory elementfactory = new ElementFactory();
		
	
	
		structuredTextDocument.addElement(elementfactory.addHeader("EN rubrik"));
		
		structuredTextDocument.addElement(elementfactory.addParagraph("här har vi den första paragraphen"));
		structuredTextDocument.addElement(elementfactory.addParagraph("här har vi den andra paragraphen"));
		
		structuredTextDocument.addElement(elementfactory.addHeader("En till rubrik"));
		
		element = elementfactory.addBulletList();
		element.addElement(elementfactory.addHeader("En rubrik för min bulletList"));
		element.addElement(elementfactory.addParagraph("jag har en katt"));
		element.addElement(elementfactory.addParagraph("det finns en gnu"));
		
		structuredTextDocument.addElement(elementfactory.addHeader("En rubrik  efter bullet list"));
		
		structuredTextDocument.addElement(element);
		
		element2 = structuredTextDocument.getlisy();
		
		for (int i = 0; i < element2.size(); i++) {
			
			if (element2.get(i).getClass()==BulletList.class) {
				element2 = element2.get(i).getListOfElements();
				for (int o = 0; o < element2.size(); o++) {
					System.out.println("* "+element2.get(o).getText());
				}
				element2 = structuredTextDocument.getlisy();
			}
			else{
			System.out.println(element2.get(i).getText());
			}
		}
		
		
	}

}
