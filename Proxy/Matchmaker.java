/**
 *代理类
 */
 
 public class Matchmaker implements Subject{
	 private Subject target;//要代理的真实对象
	 public Matchmaker(Subject target){
		 this.target = target;
	 }
	 /**
	  *相亲之前要做的事，比如寻找如意郎君
	  */
	  private void start(){
		  System.out.println("start");
	  }
	  
	  /**
	   *相亲之后要做的事，相亲结束
	   */
	   private void end(){
		   System.out.println("The end");
	   }
	 public void miai(){
		 start();
		 target.miai();
		 end();
	 }
 }