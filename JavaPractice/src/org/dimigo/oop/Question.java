/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
* <pre>
* org.dimigo.oop
*	|_ Question
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 4. 3.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class Question {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		String[] question = {"1. 가장 좋아하는 가수는?","2. 가장 좋아하는 배우는?","3 가장 좋아하는 과목은?"};
		String[] answers = {"트와이스","박보영","응용"};
		
		for(int i=0; i<3; i++){
		System.out.println(question[i]);
		answer = scanner.nextLine();
		
		if(answer.equals(answers[i])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸어용");
		}
		}
		System.out.println("<<결과 출력>>");

		StringBuilder sb = new StringBuilder();
		
			for(int i=0; i<3; i++){
				sb.append(question[i]).append(answers[i]).append("입니다\n");
			}
			System.out.println(sb.toString());

	}
}

