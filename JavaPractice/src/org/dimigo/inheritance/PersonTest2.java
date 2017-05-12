/**
 * 
 */
package org.dimigo.inheritance;

/**
* <pre>
* org.dimigo.inheritance
*	|_ PersonTest2
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 5. 12.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class PersonTest2 {
	public static void main(String[] args){
		Person[] people = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(int i=0; i<4; i++){
			greeting(people[i]);
		}
	}
	private static void greeting(Person person){
		System.out.println(person.toString());
		person.sayHello();
		person.SayBye();
		System.out.println();
	}
}
