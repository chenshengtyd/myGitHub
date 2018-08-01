package com.whcs.text;

public class TMain {

	public static void main(String[] args) {
		String message = "tx是垃圾";
		String replaceAll = message.replaceAll("Tx", "腾讯");
		replaceAll = replaceAll.replaceAll("tx", "腾讯");
		System.out.println(replaceAll);
	}
}
