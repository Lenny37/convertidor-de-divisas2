package gui;

import javax.swing.Icon;

public class OpcionConIcono {
	  private String text;
	    private Icon icon;

	    public OpcionConIcono(String text, Icon icon) {
	        this.text = text;
	        this.icon = icon;
	    }

	    public String getText() {
	        return text;
	    }

	    public Icon getIcon() {
	        return icon;
	    }

	    @Override
	    public String toString() {
	        return text; 
	    }
	}