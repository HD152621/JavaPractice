/**
 * f
 */
package org.dimigo.basic;

/**
* <pre>
* org.dimigo.basic
*	|_ Operator
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 3. 13.
*<pre>
*
*@author         : 유동연
*@version        : 1.0
*/
public class Operator {
	public static void main(String args[])
	{
		int month = 1700000;
		int employee = 3;
		int shop = 1500;
		
	
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d",month)+"원");
		System.out.println("점포 내 직원 수 : "+ employee + "명");
		System.out.println("점포수 : "+ String.format("%,d",shop) + "개");
		System.out.print("\n\n");
		System.out.println("연간 인건비 : "+ String.format("%,d",(long)month*12*employee*shop) + "원");
		
		
		
		
	}

}
