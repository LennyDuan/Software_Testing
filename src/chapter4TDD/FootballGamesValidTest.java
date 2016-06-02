package chapter4TDD;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sun.swing.icon.SortArrowIcon;

@RunWith(Parameterized.class)
public class FootballGamesValidTest {

	private int noofGamesWon;
	 
	public FootballGamesValidTest(int nofGamesWon) {
		this.noofGamesWon = nofGamesWon;
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> validDataInput() {
        return Arrays.asList(new Object[][]{
        	{-5},
        		{-1},
        		{-200},	
        });
    }
 
    
    @Test(expected = IllegalArgumentException.class)
   	public void getNumberOfGamesWon(){   
        System.out.println("||||||||Throw Exception||||||");  
   	FootballTeam team = new FootballTeam(noofGamesWon);
   	}
    
    public static final int Random_Number = 32;
    
	@Test
	public void shouldBeAbleToCompare() {
		FootballTeam team = new FootballTeam(Random_Number);
		assertTrue(team instanceof Comparable);
		
	}
	
	@Test
	public void teamWinMoreWonsShouldBeGreater() {
		FootballTeam team_1 = new FootballTeam(2);
		FootballTeam team_2 = new FootballTeam(3);
		assertTrue(team_2.compareTo(team_1) > 0);
		assertTrue(team_1.compareTo(team_2) < 0);

	}

    
  
  
	@BeforeClass
    public static void before() {  
        System.out.println("Start JUnit Test");  
    }
    
 @AfterClass
 public static void after() {
	 System.out.println("End JUnit Test");	 
 }
 
 @Before 
 public void setup() {
     System.out.println("One Parameter Test Start ------");  
 }
 
 @After
 public void tearDown() {
     System.out.println("-------- End ------");  
 }
}