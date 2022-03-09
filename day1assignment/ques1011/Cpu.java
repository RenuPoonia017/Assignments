package com.day1assignmentques.ques1011;

public class Cpu {
	private String processor;
	private String hDD;
	private String sDD;
	private int ramSize;
	public Cpu(String processor, String hDD, String sDD, int ramSize) {
		this.processor = processor;
		this.hDD = hDD;
		this.sDD = sDD;
		this.ramSize = ramSize;
	}
	public String getCpuDetails() {
		return this.processor+" "+this.hDD+" "+this.sDD+" "+this.ramSize;
	}

}
