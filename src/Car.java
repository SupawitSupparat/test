//elab-source: Car.java
public class Car {
private double gas;
private double burningGasRate;
Car()
{
gas=0;
burningGasRate=0;
}
Car(double newgas, double newburningGasRate)
{
	gas=newgas;
	burningGasRate=newburningGasRate;
}
public double getGas()
{
return gas;	
}
public double getBurningGasRate()
{
return burningGasRate;	
}	
public void setGas(double newgas)
{
 gas=newgas;	
}
public void setBurningGasRate(double newburningGasRate)
{
	burningGasRate=newburningGasRate;
}
	
public double drive(double distance)
{
double usedgas;	
usedgas=distance/burningGasRate;
gas-=usedgas;
return gas;
}
public void fillGas(double newGas)
{
gas+=newGas;	
}
public String toString()
{
	String outputFormat = "Gas: " + gas + ", Burning rate: " + burningGasRate;
	return outputFormat;
}	






}
