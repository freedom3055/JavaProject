package com.javapractice.DesignPatterns.Builder;

public class Computer {
	private String cpu;
	private String ram;
	private String size;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", size=" + size + "]";
	}
	
	
}
