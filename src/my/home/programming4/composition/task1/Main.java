package my.home.programming4.composition.task1;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. 
Методы: дополнить текст, вывести на
консоль текст, заголовок текста. 
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word("Hello");
		Word word2 = new Word("everyone!");
		Sentence sentence = new Sentence(new Word("Nice"));
		sentence.setSentence(new Word("to"));
		sentence.setSentence(new Word("meet"));
		sentence.setSentence(new Word("you!"));
		
		
		Text text = new Text(new Word("Hello"));
		text.addMainText(word);
		text.addMainText(word2);
		text.addMainText(sentence);
		
		System.out.println("header:\n" + text.getHeader());

		System.out.println("main text:\n" + text.getMainText());

	}

}
