package com.example.forestgame.element;

public class Element {
	
	private int type;
	
	public Element(int type) {
		super();
		this.type = type;
	}
	
	
	public int getType() {
		return this.type;
	}
	
	// �������������� ���������� ��������� � 1 ����� �������� ������.
	public void changeToNextLvl() {
		tableOfElements.getNextLvl(type);
	}
	
}
