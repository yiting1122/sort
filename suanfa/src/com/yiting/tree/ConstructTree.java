package com.yiting.tree;

import java.io.File;

import com.file.FileUtils;

public class ConstructTree {
	static int aa[];
	static int bb[];
	public static void main(String[] args){
		
		String path="e:"+File.separator+"suanfatest"+File.separator+"treenode.txt";
		int a[][]=FileUtils.readFile(path);
		int length=a[0].length;
		
		aa=a[0];
		bb=a[1];
		
		findNode(0, length);
		
		
	}
	
	
	public static void findNode(int start,int end){
		for(int i=start;i<end;i++){
			if(aa[start]==bb[i]){
				System.out.print(aa[start]);
		        findNode(++start, i);
		        findNode(++i, end);
			}
		}
	}
	
	
	
}
