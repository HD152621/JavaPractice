/**
 * 
 */
package org.dimigo.inheritance;

/**
* <pre>
* org.dimigo.inheritance
*	|_ Japanese
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 5. 8.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class Japanese extends Person{
	public Japanese(String name){
		super(name);
	}
	
	//메소드 오버라이딩
	public String toString(){
		return "저는 " + "일본사람 "+super.getName() + "입니다";
	}
	public void sayHello(){
		System.out.println("오하이요");
	}
	public void SayBye(){
		System.out.println("사요나라");
	}
}
