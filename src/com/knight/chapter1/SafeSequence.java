package com.knight.chapter1;

/**
 * sychronized  实现同步机制
 * @author hujie
 *
 */
public class SafeSequence {

	private int value;
	
	public synchronized int getNext(){
		return value ++;
	}
}
