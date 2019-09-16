package composite;

public class ComputerTest {

	public static void main(String[] args) {

		Leaf ram =  new Leaf(3000 ,"RAM");
		Composite cabinet =  new Composite("cabinet");
		
		cabinet.addComponent(ram);
	}

}
