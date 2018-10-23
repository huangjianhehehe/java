package cn.itcast_02;

import java.util.LinkedList;


/*
 * 自定义的栈集合
 * @author Tim
 * @version V1.0
 * **/
public class MyStack {
	private LinkedList link;
	
	public MyStack(){
		link= new LinkedList();
	}
	public void add(Object obj){
		link.addFirst(obj);
	}
	public Object get(){
		return link.remove();
	}
	public boolean isEmpty(){
		return link.isEmpty();
	}	
}
