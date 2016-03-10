package com.stargazerproject.file;

public class StargazerFileException extends Exception{
	public StargazerFileException(String exception) {
		System.out.println("Stargazer Error : 已经捕获到StargazerFile异常事件,开始处理异常记录");
		// TODO 等待逐渐完善
		switch (exception) {
		case "isDirectory":
			System.out.println("Stargazer Error : 指定位置参数非法,指定位置为目录,不是文件");
			break;
		case "FileNameIsNull":
			System.out.println("Stargazer Error : 指定位置参数非法,文件参数为NULL");
			break;
		case "CouldNotFindFile":
			System.out.println("Stargazer Error : 源文件不存在");
			break;
		default:
			System.out.println("Stargazer Error : 未知错误");
			break;
		}
		// TODO 等待逐渐完善
		System.out.println("Stargazer Error : 已经捕获到StargazerFile异常事件，结束处理异常记录");
	}
}
