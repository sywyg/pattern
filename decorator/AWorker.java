package com.sywyg;
/**
 *抽象装饰类：A公司的工人
 */
public class AWorker implements Worker{
	//指向抽象组件的引用
	private Worker worker;
	public AWorker(Worker worker){
		this.worker = worker;
	}
	public void doSomething(){
		System.out.println("我是A公司的工人");
		worker.doSomething();
	}
}