package com.example.forestgame.element;

public class TableOfElements {
    
    private static class ElementInfo {
	
	private String name;
	private String texture;
	private int scores;
	
	private ElementInfo(String name, String texture, int scores) {
	    
	    this.name = name;
	    this.texture = texture;
	    this.scores = scores; 
	}
    }
		
    //Table includes info about elements:
    //column 0 - name of current element
    //column 1 - name of texture
    //column 2 - scores
    private static final ElementInfo[] ARRAY_OF_ELEMENTS = {
	
	new ElementInfo("NUT", "NUT", 1000)
    };
    
    public static String getTextureName(String name) {
	
	for (ElementInfo el : ARRAY_OF_ELEMENTS) {
	    
	    if (name == el.name) return el.texture;
	}
	return null;
    }
    
    public static int getScores(String name) {
	
	for (ElementInfo el : ARRAY_OF_ELEMENTS) {
	    
	    if (name == el.name) return el.scores;
	}
	return -1;
    }
    
    public static String getNextLvl(String name) {
	
	for (int i = 0; i < ARRAY_OF_ELEMENTS.length; ++i) {
	     
	    if (name == ARRAY_OF_ELEMENTS[i].name) {

		if (i != ARRAY_OF_ELEMENTS.length - 1) return ARRAY_OF_ELEMENTS[i+1].name;
		else return ARRAY_OF_ELEMENTS[i].name;
	    }
	}
	return null;
    }
}