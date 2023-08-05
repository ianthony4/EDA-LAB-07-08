
 //Esta clase es la estructura de la frase tipo, 
 //cada frase contiene una cantidad de palabras, cada frase 
 //tiene una cantidad minima de palabras

public class Phrase  {
	//Atributos
	private StringBuilder data;
	private int numbersWord;
	final static int max_number_word=10;

	//Constructores
	public Phrase() {

	}

	//Getters y Setters
	public StringBuilder getData() {
		return data;
	}

	public void setData(StringBuilder data) {
		this.data = data;
	}

	public int getNumbersWord() {
		return numbersWord;
	}

	public void setNumbersWord(int numbersWord) {
		this.numbersWord = numbersWord;
	}
}