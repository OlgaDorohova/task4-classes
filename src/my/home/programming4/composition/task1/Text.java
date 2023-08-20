package my.home.programming4.composition.task1;

public class Text {
	private String header;
	private String mainText;
	
	public Text(Word word) {
		// TODO Auto-generated constructor stub
		header = word.getWord();
		mainText = header + "\n";
	}
	
	public Text(Sentence sentence) {
		header = sentence.getSentence();
	}
	
	public String getHeader() {
		return header;
	}
	
	public void addMainText(Word word) {
		mainText += word.getWord() + " ";
	}
	
	public void addMainText(Sentence sentence) {
		mainText += sentence.getSentence() + " ";
	}
	
	public String getMainText() {
		return mainText;
	}

}
