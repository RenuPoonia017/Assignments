package com.day1assignmentques.ques1011;

public class Computer {
	private Monitor monitor;
	private Keyboard keyboard;
	private Mouse mouse;
	private Cpu cpu;
	
	public Computer(String companyName, String keyboardType, String mouseType, String processor,String hDD,String sDD,int ramSize) {
		this.monitor = new Monitor(companyName);
		this.keyboard = new Keyboard(keyboardType);
		this.mouse = new Mouse(mouseType);
		this.cpu =new Cpu(processor,hDD,sDD,ramSize);
	}

	public String getComputer() {
		return monitor.getCompanyName()+","+keyboard.getKeyboardType()+","+mouse.getMouseType()+","+cpu.getCpuDetails();
	}
}