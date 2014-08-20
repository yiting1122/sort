package com.suanfa.findnumber;

import java.io.File;

import com.file.FileUtils;


/**
 * 在特殊的二维数组中搜索数�?   从左到右增大 从上到下增大
 * @author kingsoft
 *
 */
public class FindNumber {
	
	private void find(int target){
		String path="e:"+File.separator+"test"+File.separator+"number.txt";
		int a[][]=FileUtils.readFile(path);
		int temp=a[0].length;
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<temp;j++){
				System.out.println("i: "+i+" j: "+j);
				if(a[i][j]==target){
					System.out.println("find i: "+i+" j: "+j);
				}
				if(a[i][j]>target){
					temp=j-1;
					break;
				}
			}
		}
		

		
	}
	
	
	
	
	public static void main(String[] args){
		new FindNumber().find(6);
	}
	
}
