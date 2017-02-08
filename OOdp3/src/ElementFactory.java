
public class ElementFactory {

	
	public Element addHeader(String text){
		
		return new Header(text);
	
	}
	
	public Element addParagraph(String text){
		
		return new Paragraph(text);
	}
	
	public Element addBulletList(){
		
		return new BulletList();
	}
}
