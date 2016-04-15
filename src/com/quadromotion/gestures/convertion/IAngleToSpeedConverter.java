package com.quadromotion.gestures.convertion;

public interface IAngleToSpeedConverter {

	

	// methods
	public double expConverter(double inputValue);

	public double linearConverter(double inputValue);

	// getter & setter
	public double getInputValue();

	public void setInputValue(int inputValue);

	public double getOutputValue();
}
