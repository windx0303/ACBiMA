import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

import util.Acbima;


public class CreateAcbimaCorpus {

	public static void main(String[] args) throws IOException {
		
		///ACBiMA/data/acbima-big11k.+brown.utf8.arff
		File inputFile = new File("data/acbima-big11k.+brown.utf8.arff");
		
		BufferedReader br = new BufferedReader(new
				InputStreamReader(new FileInputStream(inputFile),
				"UTF-8"));
		
		Hashtable<String, String> dictHash = new Hashtable<String, String>();
		
		String line;
		boolean started = false;
		while ((line = br.readLine()) != null) {
			
			if(line.equals("@data")){
				started = true;
			}else if(started){
				String[] strArray = line.split("[\\,]");
				String nowWord = strArray[0];
				String nowType = strArray[3];
				//Acbima nowAcbima = new Acbima(nowWord, nowType);
				dictHash.put(nowWord, nowType);
				//System.out.println(nowWord+","+nowType);
				System.out.println(dictHash.size());
			}
		}    
		
		List<Acbima> results = new ArrayList<Acbima>();
		Set<String> words = dictHash.keySet();
		int nowId = 1;
		for(String nowWord: words){
			Acbima nowAcbima = new Acbima(nowWord, dictHash.get(nowWord));
			nowAcbima.setId(nowId);
			nowId++;
			results.add(nowAcbima);
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(results);
		//System.out.println(json);
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
			    new FileOutputStream("output/acbima-corpus-1.0.json"), "UTF-8"));
			try {
			    out.write(json);
			} finally {
			    out.close();
			}
		

	}

}



