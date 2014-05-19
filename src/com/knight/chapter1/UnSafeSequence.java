package com.knight.chapter1;

/**
 * 
 * @author hujie
 * 1、非线程安全的序列生成器,目的是生成唯一的整数值的序列
 * 2、在单线程下，是可以达到程序本身的意图
 * 3、在多线程下，自增操作value++实际上它分为3个独立的操作：读取这个值，使之加一，再写入新值。
 *    多线程交替进行，很可能同时读取这个值，两个线程都得到相同的值，并都使之加1，结果就是不同的线程
 *    返回了相同的序列数
 *
 */

public class UnSafeSequence {

	private  int value;
	
	/**
	 * 返回唯一值
	 */
	public int getNext(){
		return value ++;
	}
}
