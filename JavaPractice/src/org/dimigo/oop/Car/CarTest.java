/**
 * 
 */
package org.dimigo.oop.Car;

/**
* <pre>
* org.dimigo.oop.Car
*	|_ CarTest
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 3. 23.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class CarTest {
	
	public static void main(String[] args){
		Car hyeond = new Car();
		Car kia = new Car();
		Car samsung = new Car();
		
		hyeond.setCompany("현대자동차");
		kia.setCompany("기아자동차");
		samsung.setCompany("삼성자동차");
		
		hyeond.setModel("제네시스");
		kia.setModel("K7");
		samsung.setModel("SM7");
		
		hyeond.setColor("검정색");
		kia.setColor("흰색");
		samsung.setColor("회색");
		
		hyeond.setMaxSpeed(225);
		kia.setMaxSpeed(246);
		samsung.setMaxSpeed(200);
		
		hyeond.setPrice(50000000);
		kia.setPrice(40000000);
		samsung.setPrice(38000000);
		

		
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명: "+hyeond.getCompany());
		System.out.println("모델명: "+hyeond.getModel());
		System.out.println("색상: "+hyeond.getColor());
		System.out.println("최대속도: "+hyeond.getMaxSpeed()+"km");
		System.out.println("가격: "+String.format("%,d",hyeond.getPrice())+"원");
		System.out.print("\n");
		System.out.println("제조사명: "+kia.getCompany());
		System.out.println("모델명: "+kia.getModel());
		System.out.println("색상: "+kia.getColor());
		System.out.println("최대속도: "+kia.getMaxSpeed()+"km");
		System.out.println("가격: "+String.format("%,d",kia.getPrice())+"원");
		System.out.print("\n");
		System.out.println("제조사명: "+samsung.getCompany());
		System.out.println("모델명: "+samsung.getModel());
		System.out.println("색상: "+samsung.getColor());
		System.out.println("최대속도: "+samsung.getMaxSpeed()+"km");
		System.out.println("가격: "+String.format("%,d",samsung.getPrice())+"원");
		
	
	}
}


	
