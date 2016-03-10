package com.stargazerproject.file;

import java.io.File;

/**
 * @author Felixerio
 * Stargazer 包装File类型
 * @version 1.0.0.0
 * **/
public class StargazerFile{
	
	private File file;
	private boolean createSuccessState = Boolean.FALSE;/**用于判断最终是否正常生成**/
	
	/**读取文件**/
	public File readStargazerFile(String fileName) {
		if(null==fileName||fileName.trim().length()==0){
			try {
				throw new StargazerFileException("FileNameIsNull");
			} catch (StargazerFileException e) {}
		}
		else{
			file = new File(fileName);
			if(file.isDirectory()){
				try {
					throw new StargazerFileException("isDirectory");
				} catch (StargazerFileException e) {}
			}
			else{
				if(Boolean.FALSE.equals(file.exists())){
					try {
						throw new StargazerFileException("CouldNotFindFile");
					} catch (StargazerFileException e) {}
				}
				else{
					this.createSuccessState = Boolean.TRUE;
					return file;
				}
			}
		}
		return file;
	}
	
	/**创建文件**/
	public File creatStargazerFile(String fileName) {
		if(null==fileName||fileName.trim().length()==0){
			try {
				throw new StargazerFileException("FileNameIsNull");
			} catch (StargazerFileException e) {}
		}
		else{
			file = new File(fileName);
			if(file.isDirectory()){
				try {
					throw new StargazerFileException("isDirectory");
				} catch (StargazerFileException e) {}
			}
			else{
				this.createSuccessState = Boolean.TRUE;
				return file;
			}
		}
		return file;
	}
	
	public boolean isCreateSuccessState() {
		return createSuccessState;}

	public File getFile() {
		return file;}
}
