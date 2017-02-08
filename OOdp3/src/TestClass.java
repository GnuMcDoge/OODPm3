import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner textScan = new Scanner(System.in);
		PlainText plaintext = new PlainText();
		
		
		plaintext.addText( textScan.nextLine());
		plaintext.addText(textScan.nextLine());
		plaintext.readText();

	}

}
