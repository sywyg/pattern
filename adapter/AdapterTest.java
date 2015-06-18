/**
 *ʵ��������ģʽ
 *@author sywyg
 *@time 2015/4/8
 */
public class AdapterTest{
	public static void main(String[] args){
		//ʵ�����ӿ�
		PowerA powerA = new PowerAImpl();
		//����ʵ�����Ľӿ�
		//start(powerA);
		PowerB powerB = new PowerBImpl();
		PowerAAdapter pa = new PowerAAdapter(powerB);
		start(pa);
	}
	//��ʼ����
	public static void start(PowerA powerA){
		//........
		powerA.insert();
		//........
	}
	//��ʼ����,�������أ������Ļ���ɺܶ�����ظ���
	public static void start(PowerB powerB){
		//........
		powerB.connect();
		//........
	}
}
/**
 *��������
 *Ŀ����ϣ��PowerA�ӿ�����PowerB�ӿ�
 */
class PowerAAdapter implements PowerA{
	private PowerB powerB;//��Ҫ����Ľӿ�
	public PowerAAdapter(PowerB powerB){
		this.powerB = powerB;
	}
	public void insert(){
		powerB.connect();
	}
}
/**
 *��ԴA�ӿ�
 */
interface PowerA{
	public void insert();
}
class PowerAImpl implements PowerA{
	@Override
	public void insert(){
		System.out.println("��ԴA�ӿڲ��룬��ʼ����");
	}
}


/**
 *��ԴB�ӿ�
 */
interface PowerB{
	public void connect();
}
class PowerBImpl implements PowerB{
	@Override
	public void connect(){
		System.out.println("��ԴB�ӿڲ��룬��ʼ����");
	}
}
