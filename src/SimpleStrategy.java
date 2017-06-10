import java.util.*;

public class SimpleStrategy implements Strategy{
	
	private Map<String, Behaviour> behaviours;
	private Animal animal;
	
	public SimpleStrategy(String command, Behaviour behaviour){
		
		behaviours = new HashMap<String, Behaviour>();
		
		behaviours.put(command, behaviour);
	}
	@Override
	public void execute(String command) throws UnSupportedBehaviourException{
		
		String comm = command.toLowerCase();
		if(behaviours.containsKey(comm)){
			
			System.out.print(animal.getName() + " who is a " + animal.getClass().getSimpleName() + " is ");
			
			behaviours.get(comm).doIt();
		}
		else{
			throw new UnSupportedBehaviourException("Invalid Behaviour");
		}
		
		
	}
	
	public void addBehaviour(String command, Behaviour behaviour){
		
		behaviours.put(command, behaviour);
		
	}

	@Override
	public void addAnimal(Animal ani) {
		this.animal = ani;
		
	}
	
	
	

}
