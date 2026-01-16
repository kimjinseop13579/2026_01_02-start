package Common2;

public abstract class Tree {
	protected String name;
	
	public Tree(String name) {
		this.name= name;
	}
	
	public final void treeName() {
		System.out.println(name);
	}
	public abstract void tall();
	public abstract void barkColor();
	public abstract void life();

}
