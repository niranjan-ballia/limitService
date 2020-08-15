package com.in28minutes.com.limitsservice.beans;

public class LimitConfiguration {
int minimum;
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public LimitConfiguration() {
	super();
}
public LimitConfiguration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}
int maximum;

}
