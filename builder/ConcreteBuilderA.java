package sywyg.builderpattern.ConcreteBuilderA;
import sywyg.builderpattern.*;
/**
*苍老师根据编剧就完成两个动作，
*/
public class ConcreteBuilderA extends Builder{
	private Product product = new Product();
	public  void actUp(){
		product.addAction("苍老师和A主演，苍老师在上面");
	}
	public  void actDown(){
		product.addAction("苍老师和A主演，苍老师在下面");
	}
	public Product retrieveResult(){
		actUp();
		actDown();
		return product;
	}
}