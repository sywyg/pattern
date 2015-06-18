package sywyg.builderpattern.Director;
import sywyg.builderpattern.*;
/**
*导演类，按照编剧（Builder）写的剧本指挥拍戏
*导演负责流程把控
**/
public class Director{
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void direct(){
		builder.actionUp();
		builder.actionDown();
	}
}