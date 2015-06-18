package com.sywyg;
/**
 *具体装饰者：A公司的蓝领
 */
public class BlueOfAWorker extends AWorker{
	public BlueOfAWorker(Worker worker){
		super(worker);
	}
	public void doSomething(){
		super.doSomething();
		extras();
	}
	/**
	 *A公司的蓝领其它职责
	 */
	public void extras(){
		System.out.println("我确实是A公司的蓝领");
	}
}