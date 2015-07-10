package util;

import java.util.ArrayList;
import java.util.List;

import de.bwaldvogel.liblinear.Feature;
import de.bwaldvogel.liblinear.FeatureNode;
import feature.extractor.singlechar.AbstractCharFeatureExtractor;
import feature.extractor.singlechar.WordIdFeatureExtractor;

public class AcbimaFeatureExtractor {
	
	private static AbstractCharFeatureExtractor[] nowFeatureExtractor;
	
	public AcbimaFeatureExtractor(){
		AbstractCharFeatureExtractor[] nowFeatureExtractor = {
				new WordIdFeatureExtractor()
		};
	}
	
	public Feature[] getFeatures(Acbima nowWord){
		
		List<Feature> featureList = new ArrayList<Feature>();
		
		int featureId = 1;
		for(AbstractCharFeatureExtractor nowCharFeatureExtractor: nowFeatureExtractor){
			
			List<Double> nowFeatureValues = nowCharFeatureExtractor.getFeatureValues(nowWord.getChar1());
			for(Double nowFeatureValue: nowFeatureValues){
				FeatureNode nowFeatureNode = new FeatureNode(featureId, nowFeatureValue.doubleValue());
				featureId++;
				featureList.add(nowFeatureNode);
			}
			
			List<Double> nowFeatureValues2 = nowCharFeatureExtractor.getFeatureValues(nowWord.getChar2());
			for(Double nowFeatureValue: nowFeatureValues2){
				FeatureNode nowFeatureNode = new FeatureNode(featureId, nowFeatureValue.doubleValue());
				featureId++;
				featureList.add(nowFeatureNode);
			}
			
		}
		
		Feature[] result = featureList.toArray(new Feature[featureList.size()]);
		return result;
		
	}

}
