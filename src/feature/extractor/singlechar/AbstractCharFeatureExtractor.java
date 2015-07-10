package feature.extractor.singlechar;

import java.util.List;

import de.bwaldvogel.liblinear.Feature;

public abstract class AbstractCharFeatureExtractor {
	
	abstract public List<Double> getFeatureValues(String nowChar);
	
}
