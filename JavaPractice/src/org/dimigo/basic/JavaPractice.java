/**asdd
 * 
 */
package org.dimigo.basic;

/**
* <pre>
* org.dimigo.basic
*	|_ JavaPractice
* 
* 1. 개요 : 아이유프로필 출력하기
* 2. 작성일 : 2017. 3. 9.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class JavaPractice {
	 public static void main(String[] args) {

	      String name = "아이유";
	      boolean isMale = false;
	      int age = 25;
	      double height = 161.8;
	      float weight = 44.3f;
	      char bloodType = 'A';
	      
	      System.out.println("<< 아이유 프로필>>");
	      System.out.println("이름 : " + name);
	      if(isMale == false) System.out.println("성별 : 여자");
	      else System.out.println("성별 : 남자");
	      System.out.println("나이 : " + age);
	      System.out.println("키 : " + height);
	      System.out.println("몸무게 : " + weight);
	      System.out.println("혈액형 : " + bloodType + "형"); //boolen
	   }

}
