package com.virtue.model;

public class ComplexNumber {
	// data members
	private int realPart;
	private int imaginaryPart;
	
	public ComplexNumber() {
		/* no implementation required */
	}
	
	public ComplexNumber(int realPart, int imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	// methods
	public int getRealPart() {
		return realPart;
	}
	public void setRealPart(int realPart) {
		this.realPart = realPart;
	}
	public int getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(int imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(String.valueOf(realPart));
		if (imaginaryPart > 0)
			output.append("+");
		else
			output.append("-");
		output.append(Math.abs(imaginaryPart));
		output.append("i");
		return output.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		ComplexNumber other = (ComplexNumber) o;
		return realPart == other.realPart && imaginaryPart == other.imaginaryPart;
	}
}
