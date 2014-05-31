package com.knight.chapter2;

/**
 * 程序设计的目的是getInstance返回相同的实例
 * 如果处于多线程中，线程A坚持到 instance=null 这样会实例化一个新的ExpensiveObject
 * 由于时序性，无法预测，线程B检测到instance=null 这样又会重新实例化一个新的ExpensiveObject
 * 调用者会得到不同的实例，和程序最初设计相悖
 * 如果此程序用于实例化一个应用级的注册器，让它多次调用中返回不同的实例，会引起注册信息的丢失，或者多
 * 活动 得到不一致的已注册对象集合的视图
 * @author hujie
 *
 */
public class LazyInitRace {

	private ExpensiveObject instance = null;
	
	private ExpensiveObject getInstance(){
		if(instance == null){
			 instance  = new ExpensiveObject();
		}
		return instance;
	}
}
