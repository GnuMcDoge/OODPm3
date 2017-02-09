import java.util.List;

public class Paragraph implements Element {
	
	String paragraphText;
	
	public Paragraph(String text) {
		
		paragraphText = text;
	}
	

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return paragraphText;
	}
	@Override
	public void addElement(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Element> getListOfElements() {
		// TODO Auto-generated method stub
		return null;
	}

}
