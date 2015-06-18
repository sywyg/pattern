/**
 *¿Í»§¶Ë£¬
 */
 
 public class Client{
	 public static void main(String[] agrs){
		 Subject person = new Person("sywyg");
		 Matchmaker matchmaker = new Matchmaker(person);
		 matchmaker.miai();
	 }
 }