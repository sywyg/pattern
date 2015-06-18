/**
 *实现适配器模式
 *@author sywyg
 *@time 2015/4/8
 */
public class AdapterTest{
	public static void main(String[] args){
		//实例化接口
		PowerA powerA = new PowerAImpl();
		//传入实例化的接口
		//start(powerA);
		PowerB powerB = new PowerBImpl();
		PowerAAdapter pa = new PowerAAdapter(powerB);
		start(pa);
	}
	//开始工作
	public static void start(PowerA powerA){
		//........
		powerA.insert();
		//........
	}
	//开始工作,函数重载，这样的话造成很多代码重复。
	public static void start(PowerB powerB){
		//........
		powerB.connect();
		//........
	}
}
/**
 *适配器类
 *目的是希望PowerA接口适配PowerB接口
 */
class PowerAAdapter implements PowerA{
	private PowerB powerB;//需要适配的接口
	public PowerAAdapter(PowerB powerB){
		this.powerB = powerB;
	}
	public void insert(){
		powerB.connect();
	}
}
/**
 *电源A接口
 */
interface PowerA{
	public void insert();
}
class PowerAImpl implements PowerA{
	@Override
	public void insert(){
		System.out.println("电源A接口插入，开始工作");
	}
}


/**
 *电源B接口
 */
interface PowerB{
	public void connect();
}
class PowerBImpl implements PowerB{
	@Override
	public void connect(){
		System.out.println("电源B接口插入，开始工作");
	}
}
