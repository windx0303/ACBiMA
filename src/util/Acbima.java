package util;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import de.bwaldvogel.liblinear.Feature;
import de.bwaldvogel.liblinear.FeatureNode;
import feature.extractor.singlechar.AbstractCharFeatureExtractor;
import feature.extractor.singlechar.WordIdFeatureExtractor;

public class Acbima {
	
	//static private int;
	private static Hashtable<String, Integer> charIdHash = new Hashtable<String, Integer>();
	//private static Hashtable<String, Acbima> acbimaIdHash = new Hashtable<String, Acbima>();
	
	private String word;
	private String type;
	
	private String char1;
	private String char2;
	
	private int id;
	
	public Acbima(String word, String type){
		
		if(word!=null&&type!=null&&word.length()==2){
			this.word = word;
			this.type = type;
			this.char1 = word.substring(0,1);
			this.char2 = word.substring(1);
		}else{
			System.out.println("Input error:+\t("+word+", "+type+")");
		}
		
		
		//this.id = count;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getWord() {
		return word;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getChar1() {
		return char1;
	}

	public String getChar2() {
		return char2;
	}

	public void setChar2(String char2) {
		this.char2 = char2;
	}
	
	

}


