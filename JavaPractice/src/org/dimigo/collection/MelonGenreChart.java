/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* <pre>
* org.dimigo.collection
*	|_ MelonGenreChart
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 6. 13.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", new ArrayList<Music>());
		map.put("댄스", new ArrayList<Music>());
		map.get("발라드").add(new Music("팔레트","아이유"));
		map.get("댄스").add(new Music("맞지?","언니쓰"));
		map.get("댄스").add(new Music("I LOVE IT","PSY"));
		
		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);
	
		System.out.println("--<<댄스 2위 곡 변경>>--");
		map.get("댄스").set(1, new Music("SIGNAL","트와이스"));
		printMap(map);
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		map.get("댄스").remove(0);
		printMap(map);
		System.out.println();
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
		
		
		
	}
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			List<Music> list = map.get(key);
			int i = 1;
			System.out.println("[" +key+ "]");
			for(Music a : list){
				System.out.println(i+"."+a.toString());
				i++;
			}
		}
	}

}
