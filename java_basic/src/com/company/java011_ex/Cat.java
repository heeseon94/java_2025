package com.company.java011_ex;

public class Cat {
	public    int public_;
	protected int protected_;
			  int package_;
	private   int private_;  // cat 내부에서만 접근가능
	

	
	// alt + shift + s > getters + steters
	public int  getPrivate_() {return private_;}
	public void setPrivate_(int private_) {this.private_ = private_;}

}
