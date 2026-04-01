package streams;

import java.util.Comparator;
import java.util.List;

class Movies{
	String name;
	double rating;
	int releaseYear;
	
	Movies(String name, double rating, int releaseYear){
		this.name= name;
		this.rating=rating;
		this.releaseYear=releaseYear;
	}
}

public class TrendingMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		List<Movies> movies = List.of(
				new Movies("Gajni", 4.5,2008),
				new Movies("Kanchana", 4.3,2010),
				new Movies("American Joke", 3.4,2014),
				new Movies("45", 4.5,2025),
				new Movies("Dark", 5,2024),
				new Movies("SOS",3,2025)
				);
		
		System.out.println("Year based sorted movies list");
		movies.stream().sorted(Comparator.comparing((Movies m) -> m.rating).reversed())
		.limit(5).forEach(m-> System.out.println(m.name+" Rating: "+m.rating+" release Year: "+m.releaseYear));
		

	}

}
