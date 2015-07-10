package feature.extractor.singlechar;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class WordIdFeatureExtractor extends AbstractCharFeatureExtractor {

	//private int charId;
	private static Hashtable<String, Integer> charDict = new Hashtable<String, Integer>();
	
	
	public WordIdFeatureExtractor(){
		//this.charId = charId;
	}
	
	@Override
	public List<Double> getFeatureValues(String nowChar) {
		// TODO Auto-generated method stub
		
		List<Double> reuslt = new ArrayList<Double>();
		
		if(charDict.get(nowChar)==null){//new char
			int nowId = charDict.size();
			charDict.put(nowChar, new Integer(nowId));
			reuslt.add(new Double((double)nowId));
		}else{
			double chatId = (double)charDict.get(nowChar).intValue();
			reuslt.add(new Double(chatId));
		}
		
		return reuslt;
	}

}
