package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	public static int[][] readFile(String path) {
		int ret[][]=null;
		FileReader fileReader =null;
		BufferedReader reader = null;
		try {
			File file = new File(path);
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);

			int rows = 0;

			while (reader.readLine() != null) {
				rows++;
			}
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);

			int colums = reader.readLine().split(",").length;
			fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			String s=null;
			ret=new int[rows][colums];
			int r=0;
			while ((s=reader.readLine())!=null) {
				
				String[] temp=s.split(",");
				for(int i=0;i<colums;i++){
					ret[r][i]=Integer.valueOf(temp[i]);
				}
				r++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				reader.close();
				fileReader.close();
			} catch (IOException e) {
			}
		}
		
		return ret;

	}

}
