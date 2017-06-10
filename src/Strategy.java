
public interface Strategy {
	
	public void execute(String command) throws UnSupportedBehaviourException;
	public void addAnimal(Animal ani);
	public void addBehaviour(String command, Behaviour behaviour);
	

}
