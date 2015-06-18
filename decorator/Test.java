package com.sywyg;
/**
 *测试用例
 */
public class Test{
	public static void main(String[] args){
		Worker worker = new Blue();
		Worker blueAW = new BlueOfAWorker(worker);
		blueAW.doSomething();
	}
}