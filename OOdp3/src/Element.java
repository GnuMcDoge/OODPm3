import java.util.List;

public interface Element {
	

	
	public void addElement(Element e);
	
	public String getText();
	
	public void accept(); 
	
	public List<Element> getListOfElements();

}