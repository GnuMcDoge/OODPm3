import java.util.List;
import java.util.Scanner;

public abstract class TextDocument {

	private StringBuffer textBuff;

	
	
	public abstract void addText(String text);
	
	public abstract List<String> getText();
	
	public abstract void readText();
	
	
	
	
}
