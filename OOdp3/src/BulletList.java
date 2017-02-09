import java.util.ArrayList;
import java.util.List;

public class BulletList extends CE{

	private List<Element> bulletList;

	
	public BulletList() {
	
		bulletList = new ArrayList<Element>();
	}
	
	@Override
	public void addElement(Element e) {
		
		bulletList.add(e);
		
	}

	@Override
	public String getText() {
	
		
		return null;
	}
	

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Element> getListOfElements() {
		// TODO Auto-generated method stub
		return bulletList;
	}

}
