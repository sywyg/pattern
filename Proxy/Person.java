/**
 *被代理类：
 */
public class Person implements Subject{
	private String name;
	public Person(String name){
		this.name = name;
	}
	 public void miai(){
		 System.out.println(name + "doing");
	 }
 }