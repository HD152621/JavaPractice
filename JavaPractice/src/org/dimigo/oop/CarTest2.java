/**
 * 
 */
package org.dimigo.oop;

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
public class CarTest2 {
	
	public static void main(String[] args){
		Car2 hyeond = new Car2("현대자동차","제네시스","검정색",225,50000000);
		Car2 kia = new Car2("기아자동차","k7","흰색",246,40000000);
		Car2 samsung = new Car2("삼성자동차","SM7","회색",200,38000000);
	
		
		
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


	
