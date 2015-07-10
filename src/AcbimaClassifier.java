import java.io.File;
import java.io.IOException;

import util.AcbimaFeatureExtractor;
import de.bwaldvogel.liblinear.Feature;
import de.bwaldvogel.liblinear.FeatureNode;
import de.bwaldvogel.liblinear.Linear;
import de.bwaldvogel.liblinear.Model;
import de.bwaldvogel.liblinear.Parameter;
import de.bwaldvogel.liblinear.Problem;
import de.bwaldvogel.liblinear.SolverType;


public class AcbimaClassifier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		AcbimaFeatureExtractor nowFeatureExtractor = new AcbimaFeatureExtractor();
		
		Problem problem = new Problem();
		problem.l = 1;//... // number of training examples
		problem.n = 2;//... // number of features
		Feature[] instance1 = { new FeatureNode(1, 4), new FeatureNode(2, 2) };

		Feature[][] nowFeatureNode = new Feature[1][1];
		
		double[] classNamesId = {2};
		
		nowFeatureNode[0] = instance1;
		
		problem.x = nowFeatureNode;//... // feature nodes
		problem.y = classNamesId;//... // target values

		
		
		
		
		
		
		SolverType solver = SolverType.L2R_LR; // -s 0
		double C = 1.0;    // cost of constraints violation
		double eps = 0.01; // stopping criteria

		Parameter parameter = new Parameter(solver, C, eps);
		Model model = Linear.train(problem, parameter);
		File modelFile = new File("model");
		model.save(modelFile);
		// load model or use it directly
		model = Model.load(modelFile);

		Feature[] instance = { new FeatureNode(1, 4), new FeatureNode(2, 2) };
		double prediction = Linear.predict(model, instance);
		
		System.out.println(prediction);

	}

}
