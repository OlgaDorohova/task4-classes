package my.home.programming4.composition.task1;

public class Sentence {
	
	private String sentence = "";
//	private Word word;
	
	Sentence(Word word){
		sentence += word.getWord();
	}
	
	public void setSentence(Word word) {
		sentence += " " + word.getWord();
	}
	
	public String getSentence() {
		return sentence;
	}

}
