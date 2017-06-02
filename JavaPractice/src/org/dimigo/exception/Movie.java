/**
 * 
 */
package org.dimigo.exception;

/**
* <pre>
* org.dimigo.exception
*	|_ Movie
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 6. 2.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class Movie {
	private String title;
	private int limitage;
	
	public Movie(String title, int limitage){
		this.title = title;
		this.limitage = limitage;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the limitage
	 */
	public int getLimitage() {
		return limitage;
	}
	
	
	public void buyTicket(int age) throws Exception{
		
			if(limitage<=age){
				System.out.println(title + " 즐감하세요.");
			}
			else if(limitage>age){
				throw new Exception(title + "은/는 " + limitage+"세 이상 관람가입니다.");
			}

	}
	

}
