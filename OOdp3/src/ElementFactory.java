public class ElementFactory  implements ElementFactoryInterface{

	
	public Header addHeader(String header){
		
		return new Header(header);
	
	}
	
	public Paragraph addParagraph(String paragraph){
		
		return new Paragraph(paragraph);
	}
	
	public BulletList addBulletList(){
		
		return new BulletList();
	}

	

}

