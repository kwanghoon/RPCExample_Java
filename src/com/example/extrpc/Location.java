package com.example.extrpc;

public enum Location {
	Client("c"), Server("s");
	
	private String loc;
	
	Location(String loc) {
		this.loc = loc;
	}

	public String getLoc() {
		return loc;
	}

	@Override
	public String toString() {
		return loc;
	}
}
