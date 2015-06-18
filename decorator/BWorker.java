package com.sywyg;
/**
 *抽象装饰类：B公司的工人
 */
public class BWorker implements Worker{
	//指向抽象组件的引用
	private Worker worker;
	public BWorker(Worker worker){
		this.worker = worker;
	}
	public void doSomething(){
		System.out.println("我是B公司的工人");
		worker.doSomething();
	}
}
