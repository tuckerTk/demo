package com.test;

public class TkTest {
	public static void main(String[] args) {
		try {
			String a = "";
			String[] ss= new String[]{"qqq","gggg"};
			//System.out.println(a.equals(""));
			System.out.println(ss[3]);
		} catch (NullPointerException re) {
			System.out.println("NullPointerException");
		} catch (IndexOutOfBoundsException ie){
			System.out.println("IndexOutOfBoundsException");
			return;
		}finally{
			System.out.println("finally");
		}
	}

}
