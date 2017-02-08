import java.util.Scanner;

import javax.swing.border.EmptyBorder;

public class TestClass {

	public static void main(String[] args) {
		Scanner textScan = new Scanner(System.in);
		PlainText plaintext = new PlainText();
		StructuredTextDocument structuredTextDocument = new StructuredTextDocument();
		Element element;
		
	ElementFactory elementfactory = new ElementFactory();

		element = elementfactory.addHeader("En rubrik");
		
		System.out.println(element.getText());

	}

}
