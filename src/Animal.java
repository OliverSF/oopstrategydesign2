
public abstract class Animal {
	
	protected Strategy strategy;
	protected String name;
	
	public void setStrategy(Strategy strat){
		this.strategy = strat;
		strat.addAnimal(this);
	}
	
	public void listen(String command) throws UnSupportedBehaviourException {
		
		this.strategy.execute(command);
	}
	
	public String getName(){
		return name;
	}

}
