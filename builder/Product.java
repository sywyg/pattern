package sywyg.builderpattern.Product;
import sywyg.builderpattern.*;
import java.util.List;
import java.util.ArrayList;
public class Product{
	private List<String> actions = new ArrayList<String>();
	public void addAction(String action){
		actions.add(action);
	}
	public void show(){
	for(String action : actions){
		System.out.println(action);
	}
	}
}