package neo.requirements.sat.util;

import java.util.Arrays;

public class EfficientSolution {
	private double [] objectiveValues;
	
	public EfficientSolution(double [] values) {
		objectiveValues = values.clone();
	}
	
	public double getObjectiveValue(int i) {
		return objectiveValues[i];
	}
	
	public String toString() {
		return Arrays.toString(objectiveValues);
	}

}
