package com.abstractart;

public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	public String getPaintType() {
		return material;
	}

	public void setPaintType(String material) {
		this.material = material;
	}
	
	@Override
	public void viewArt() {
		String result = "";
		result += "Title:		" + getTitle() + "\n";
		result += "Author:		" + getAuthor() + "\n";
		result += "Description:	" + getDescription() + "\n";
		result += "paintType	" + material + "\n";
		System.out.println(result);
	}
}
