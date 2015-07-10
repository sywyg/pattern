package com.sywyg;

import java.util.*;

/**
 * 组合模式练习
 * ，，，，，，介绍一下组合模式。。。。
 * 用到了多态，，，，。
 * @author sywyg
 * @since 2015/7/3
 **/
public class CompositePatternDemo{
	public static void main(String[] args){
		Component c1,c2,c3,c4;

		Container container1,container2;

		c1 = new Leaf("c1");
		c2 = new Leaf("c2");
		c3 = new Leaf("c3");
		c4 = new Leaf("c4");

		container1 = new Container("c1");
		container1.add(c1);
		container1.add(c2);

		container2 = new Container("c2");
		container2.add(container1);
		container2.add(c3);
		container2.add(c4);

		container2.onOperate();
	}
}


/**
 * 抽象构件：，，，，，
 **/
interface Component{
	public void onOperate();
}

/**
 *叶子：，，，，
 **/
class Leaf implements Component{
	private String name;
	public Leaf(String name){
		//super();
		this.name = name;
	}
	public void onOperate(){
		System.out.println("leaf " + name + " is operated.");
	}
}

/**
 * 容器：，，，，
 **/
class Container implements Component{
	private String name;
	private List<Component> list = new ArrayList<Component>();
	public Container(String name){
		//super();
		this.name = name;
	}
	public void onOperate(){
		System.out.println("Container " + name + " is operated.");
		for(Component c : list){
			c.onOperate();
		}
	}
	public void add(Component c){
		list.add(c);
	}
}