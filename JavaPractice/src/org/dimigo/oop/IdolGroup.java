/**
 * 
 */
package org.dimigo.oop;

/**
* <pre>
* org.dimigo.oop
*	|_ IdolGroup
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 4. 10.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class IdolGroup {

	public static void printGroup(String[] arr,String[][] arr2){
		for(int i=0; i<arr.length; i++){
			System.out.println("<<"+arr[i]+">>");
			for(int j=0; j<arr2[i].length; j++){
				System.out.println(arr2[i][j]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[ ][ ] memberName = { 
				{"GD", "태양", "대성", "탑", "승리"}, 
				{"CL", "산다라박", "박봄", "민지"}, 
				{"유라", "혜리", "소진", "민아"} };
		IdolGroup obj = new IdolGroup();
		
		obj.printGroup(groupName,memberName);
		
		}

	}

