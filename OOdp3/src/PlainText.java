import java.util.ArrayList;
import java.util.List;


public class PlainText extends TextDocument {
	
	private List<String> textList = new ArrayList<String>();
	
	@Override
	public void addText(String text) {

			textList.add(text + " ");
			
	}

	@Override
	public List<String> getText() {
	
		if(textList.isEmpty()){
			
			textList.add(" ");
			
			return textList;
		}
			
		return textList;
		
	}

	@Override
	public void readText() {

		for (int i = 0; i < textList.size(); i++) {
			
			System.out.print(textList.get(i));
			
		}
	}



}
