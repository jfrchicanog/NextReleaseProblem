package neo.requirements.sat.cplex;

import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;

public interface ILPAdaptor {
	public Modelo ilpModelForConstraints()  throws IloException;
	public IloLinearNumExpr getObjective(int objective) throws IloException;
	public double getNadirUpperBound(int objective);
}
