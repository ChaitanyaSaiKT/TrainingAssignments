package com.ThoughtFocus.languages;

public class Languages {
	private String[] languages = new String[15];
	private int index = 0;

	public void printall() {
		for (int index = 0; index < languages.length; index++) {
			if (languages[index] != null) {
				System.out.println(languages[index]);
			}
		}

	}
	public boolean save(String language) {
		if(index<15) {
			languages[index]=language;
			index++;
			return true;
		}
		else {
			System.out.println("Can enter only 15 languages");
			return false;
		}
	}
	public String delete(String language) {
		for(int index=0; index<languages.length; index++) {
			if(languages[index].equals(language)) {
				languages[index] = null;
				return "language deleted";
			}
		}
		
		return "language not deleted";
	}
}


