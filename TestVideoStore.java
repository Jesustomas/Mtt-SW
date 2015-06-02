package testPruebas;
//YOKOOO
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import videoStore.Customer;
import videoStore.Movie;
import videoStore.Rental;

public class TestHola {
	
	
	
	Customer c;
	Rental   Rental1,Rental2;
	Movie    Movie1, Movie2;

	@Before
	public void setUp() throws Exception {
		c = new Customer("Yovana");

		c.addRental(new Rental(new Movie("Star Wars episode I",Movie.REGULAR),3));
		c.addRental(new Rental(new Movie("Frozen",Movie.CHILDRENS),2));
		
		System.out.println(c.statement());
	}

	@Test
	public void testEstado() {
		String resultStmt="Rental Record for Yovana\n"+
				"\t"+"Star Wars Episode I"+"\t"+"3.5\n"+
				"\t"+"Frozen"+"\t"+"1.5\n"+
				"Amount owed is 5.0\n"+
				"Your earned 2 frequent renter points";
		Assert.assertTrue(Result.equals(c.statement()));
	}

}
