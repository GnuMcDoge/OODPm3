
import java.util.ArrayList;
import java.util.List;

public class StructuredTextDocument extends TextDocument {
	
	private List<String> list = new ArrayList<String>();
	private List<Element> elementList = new ArrayList<Element>();

	
	
	
	public void addElement(Element e){
		elementList.add(e);
	}

	public List<Element> getlisy(){
		
		return elementList;
	}
	
	
}



