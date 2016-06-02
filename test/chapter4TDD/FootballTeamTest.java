package chapter4TDD;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sun.swing.icon.SortArrowIcon;

@RunWith(Parameterized.class)
public class FootballTeamTest {

	 private int noofGamesWon;
	 private int expectResult;
	 
	public FootballTeamTest(int expect, int nofGamesWon) {
		this.expectResult = expect;
		this.noofGamesWon = nofGamesWon;
	}
	
	
	
	
	@Parameterized.Parameters
    public static Collection<Object[]> validDataInput() {
        return Arrays.asList(new Object[][]{
        	{0, 0},
        		{1, 1},
        		{2, 2},
        		{3, 3},
        		{4, 4},
        });
    }
    
    
    @Test
   	public void getNumberOfGamesWon(){   	
   	FootballTeam team = new FootballTeam(noofGamesWon);
    System.out.println("Actual Result = " + team.getGameWon() + ", The expected Result is = "+ expectResult);  
    assertEquals(expectResult, team.getGameWon());
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
