package com.collection;
import java.util.*;
/**
 * 
 * 备选课程类
 *用于存放课程的List
 */
public class ListTest {
	public List coursesToSelect;/*备选课程属性*/
	public ListTest(){
		this.coursesToSelect=new ArrayList();
	}
	/**
	 * 用于往coursesToSelect中添加课程
	 */
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1=new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp=(Course)coursesToSelect.get(0);
		System.out.println("添加了课程："+temp.getId()+":"+temp.getName());
		
		Course cr2=new Course("2","c语言");
		coursesToSelect.add(0,cr2);
		Course temp2=(Course)coursesToSelect.get(0);
		System.out.println("添加了课程："+temp2.getId()+":"+temp2.getName());
		
		coursesToSelect.add(cr1);
		Course temp0=(Course)coursesToSelect.get(2);
		System.out.println("添加了课程："+temp0.getId()+":"+temp0.getName());
		
		Course[] course={new Course("3","离散数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course)coursesToSelect.get(3);
		Course temp4=(Course)coursesToSelect.get(4);
		System.out.println("添加了两门课程："+temp3.getId()+"："+temp3.getName()+";"+temp4.getId()+":"+temp4.getName());
		
		Course[] course2={new Course("5","高等数学"),new Course("6","大学英语")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5=(Course)coursesToSelect.get(2);
		Course temp6=(Course)coursesToSelect.get(3);
		System.out.println("添加了两门课程："+temp5.getId()+"："+temp5.getName()+";"+temp6.getId()+":"+temp6.getName());
	}
	
	/**
	 * 取得List中元素的方法
	 * @param args
	 */
	public void testGet(){
		int size=coursesToSelect.size();
		System.out.println("有如下课程待选:");
		for(int i=0;i<size;i++){
			Course cr=(Course) coursesToSelect.get(i);
			System.out.println("课程"+cr.getId()+":"+cr.getName());
		}
	}
	
	/**
	 * 通过迭代器遍历List
	 * 
	 */
	public void testIterator(){
		Iterator it=coursesToSelect.iterator();
		System.out.println("有如下课程待选(迭代器访问)：");
		while(it.hasNext()){
			Course cr=(Course)it.next();
			System.out.println("课程："+cr.getId()+":"+cr.getName());
		}
	}
	
	/**
	 * 用for each
	 * @param args
	 */
	public void testForEach(){
		System.out.println("有如下课程待选(for each)：");
		for(Object obj:coursesToSelect){
			Course cr=(Course)obj;
			System.out.println("课程："+cr.getId()+":"+cr.getName());
		}
	}
	
	/**
	 * 修改List中元素
	 * @param args
	 */
	public void testModify(){
		
	}
	
	
	
	public static void main(String[] args){
		ListTest Lt=new ListTest();
		Lt.testAdd();
		Lt.testGet();
		Lt.testIterator();
		Lt.testForEach();
	}

}
