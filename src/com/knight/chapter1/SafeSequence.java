package com.knight.chapter1;

/**
 * sychronized  ʵ��ͬ������
 * @author hujie
 *
 */
public class SafeSequence {

	private int value;
	
	public synchronized int getNext(){
		return value ++;
	}
}
