/**
 * 
 */
package org.dimigo.inheritance;

/**
* <pre>
* org.dimigo.inheritance
*	|_ PersonTest
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 5. 8.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("tom");
		System.out.println(p);

		
		Korean k = new Korean("홍길동");
		System.out.println(k);
		
		Japanese j = new Japanese("다나카");
		System.out.println(j);
		
		Chinese c = new Chinese("왕밍");
		System.out.println(c);
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		p.SayBye();
		k.SayBye();
		j.SayBye();
		c.SayBye();
		
		
		

	}

}
