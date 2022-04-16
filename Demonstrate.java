package com.bridgelab.iofiles;

import java.io.File;

public class Uc2_DemonstrateDirectory {

	public static void main(String[] args) {
	
		try {
	         File file = new File("D:\\New folder (6)/practice");
	         file.createNewFile();
	         boolean flag = file.mkdir();
	         System.out.print("Directory created? " + flag);
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

	}

}
