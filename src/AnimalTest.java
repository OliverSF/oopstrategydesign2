
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	
	Animal rex;
	Animal tweety;
	
	SimpleStrategy dogStrategy; 
	SimpleStrategy birdStrategy;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		rex = new Dog("rex");
		dogStrategy = new SimpleStrategy("run", new Run());
		
		rex.setStrategy(dogStrategy);
		
		tweety = new Bird("tweety");
		birdStrategy = new SimpleStrategy("fly", new Fly());
		
		tweety.setStrategy(birdStrategy);
		
		dogStrategy.addBehaviour("fly", new Fly());
		
		
		
	}

	@Test
	public void dogStrategytest() {
		
		try{
			rex.listen("run");
		}
		
		catch(UnSupportedBehaviourException e){
			System.out.println(e.getMessage());
		}
		
		try{
			tweety.listen("fly");
		}
		
		catch(UnSupportedBehaviourException e){
			System.out.println(e.getMessage());
		}
		
		try{
			tweety.listen("run");
		}
		
		catch(UnSupportedBehaviourException e){
			System.out.println(e.getMessage());
		}
		
//		try{
//			rex.listen("fly");
//		}
//		
//		catch(UnSupportedBehaviourException e){
//			System.out.println(e.getMessage());
//		}
		
		
		
		
		
	}

}
