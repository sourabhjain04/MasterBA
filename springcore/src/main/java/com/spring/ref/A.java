package com.spring.ref;

public class A {

private int x;
private B ob;
public int getX() {
	return x;
	
}
public B getOb() {
	return ob;
}
public void setOb(B ob) {
	this.ob = ob;
}
public void setX(int x) {
	this.x = x;
}
public A(int x, B ob) {
	super();
	this.x = x;
	this.ob = ob;
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
