/**
 *������
 */
 
 public class Matchmaker implements Subject{
	 private Subject target;//Ҫ�������ʵ����
	 public Matchmaker(Subject target){
		 this.target = target;
	 }
	 /**
	  *����֮ǰҪ�����£�����Ѱ�������ɾ�
	  */
	  private void start(){
		  System.out.println("start");
	  }
	  
	  /**
	   *����֮��Ҫ�����£����׽���
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