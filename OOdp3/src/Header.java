
public class Header implements Element {


	String header;
	
	
	
	public Header(String text){
		
		header=text;		
	}
	
	
	@Override
	public String getText() {
	
		return header;
	}

	@Override
	public void addElement(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

}
