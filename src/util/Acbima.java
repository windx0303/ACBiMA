package util;

public class Acbima {
	
	//static private int;
	
	private int id;
	//private int difficulty;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private String word;
	private String type;
	
	public Acbima(String word, String type){
		this.word = word;
		this.type = type;
		//this.id = count;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
