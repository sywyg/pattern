package sywyg.builderpattern.Builder;
import sywyg.builderpattern.*;
/**
*编剧指定了两个剧情（方法）：actUp()和actDown()，以及组合剧情形成电影
*/
abstract public class Builder{
	public abstract void actUp();
	public abstract void actDown();
	public abstract Product retrieveResult();
}