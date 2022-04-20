package com.abstractart;

import java.util.ArrayList;
import java.util.Collections;


public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Ninja Bonus: store the paintings and sculptures inside of an ArrayList called museum
		ArrayList<Art> museum = new ArrayList<Art> ();
		
		
		// Create 3 instances of Painting
		museum.add(new Painting("Mona Lisa", "Leonardo da Vincici", "the best known", "oil on canvas"));
		museum.add(new Painting("The Starry Night", "Vincent van Gogh", "the view from his asylum room", "oil on canvas"));
		museum.add(new Painting("American Gothic", "Grant Wood", "farm house in Eldon, Iowa,", "oil on canvas"));
		
		
		// Create 2 instances of Scupture
		museum.add(new Sculpture("The Thinker", "Auguste Rodin", "image of a man lost in thought", "marble"));
		museum.add(new Sculpture("David", "Michelangelo", "depicts biblical figure David", "marble"));
		
		
		// Ninja Bonus: use the viewArt() method of all of the artworks in the museum in a random order
		Collections.shuffle(museum);
		
		for(Art artwork : museum) {
			artwork.viewArt();
		}

		
	}

}