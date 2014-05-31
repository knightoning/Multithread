package com.knight.chapter2;

/**
 * ������Ƶ�Ŀ����getInstance������ͬ��ʵ��
 * ������ڶ��߳��У��߳�A��ֵ� instance=null ������ʵ����һ���µ�ExpensiveObject
 * ����ʱ���ԣ��޷�Ԥ�⣬�߳�B��⵽instance=null �����ֻ�����ʵ����һ���µ�ExpensiveObject
 * �����߻�õ���ͬ��ʵ�����ͳ������������
 * ����˳�������ʵ����һ��Ӧ�ü���ע������������ε����з��ز�ͬ��ʵ����������ע����Ϣ�Ķ�ʧ�����߶�
 * � �õ���һ�µ���ע����󼯺ϵ���ͼ
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
