package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exam4 {
	public static void main(String [] args){
		System.out.println("随机生成50个小于100的数字 ，分别是：");
		int [] arr = new int[50];
		for (int i = 0;i<50;i++){
			arr[i]=(int) (Math.random()*100);
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		int [] list1 = new int[50];
		for(int i=0;i<50;i++){
			list1[i]=arr[i]/10;
		}
		Map <Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<50;i++){		
			set.add(list1[i]) ;				
		}
		Object[] SetList = set.toArray();
		for(int j = 0;j<set.size();j++){
			List<Integer> listvalue = new ArrayList<Integer>();
				for(int i = 0;i<50;i++){
							
					if(list1[i]==(Integer) SetList[j]){
						listvalue.add(arr[i]);
					}
				}
				
				map.put((Integer) SetList[j], (ArrayList<Integer>) listvalue);
			
			}
		System.out.println("Map中的数据为："+map);
		for(int j = 0;j<set.size();j++){
		List<Integer> listvalue = new ArrayList<Integer>();
			for(int i = 0;i<50;i++){
						
				if(list1[i]==(Integer) SetList[j]){
					listvalue.add(arr[i]);
				}
			}
			
			for(int z=1;z<listvalue.size();z++){		
				for(int w =0;w<listvalue.size()-1;w++){
					if(listvalue.get(w)>listvalue.get(w+1)){
						int temp = listvalue.get(w+1);
						listvalue.set(w+1,listvalue.get(w));
						listvalue.set(w,temp);
					}
				}
			}
			map.put((Integer) SetList[j], (ArrayList<Integer>) listvalue);
		}
		System.out.print("排序后的Map为："+map);
	}
}
