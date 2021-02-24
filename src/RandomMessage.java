import java.util.*;
public class RandomMessage {

	public static void main(String[] args) {
		
		String laudatoryPhrases[] = {"The product is excellent.", "This is a great product.", "I use this product constantly.", 
				"This is the best product from this category."};

		String laudatoryStories[] = {"Now I feel better.", "I managed to change.", "It made some miracle.", 
				"I can’t believe it, but now I am feeling great.", "You should try it, too. I am very satisfied."};
		
		String firstname[] = {"Dayan", "Stella", "Hellen", "Kate"};
		
		String lastname[] = {"Johnson", "Peterson", "Charls"};
		
		String cities[] = {"London", "Paris", "Berlin", "New York", "Madrid"};

			String phrase = laudatoryPhrases[(int)(Math.random()*laudatoryPhrases.length)];

			String story = laudatoryStories[(int)(Math.random()*laudatoryStories.length)];
		
			String name = firstname[(int)(Math.random()*firstname.length)];
		
			String surname = lastname[(int)(Math.random()*lastname.length)];
		
			String city = cities[(int)(Math.random()*cities.length)];
			
			String msg = phrase + " " + story + " -- " + name + " " + surname + ", " + city;
			
			System.out.println(msg);
			
	}

}
