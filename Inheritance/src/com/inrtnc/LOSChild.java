package com.inrtnc;

public class LOSChild extends LOSParent{

	int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "LOSChild [level=" + level + "]";
	}
	
	
}
