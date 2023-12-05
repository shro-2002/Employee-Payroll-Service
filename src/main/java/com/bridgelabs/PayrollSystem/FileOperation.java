package com.bridgelabs.PayrollSystem;

import java.io.File;
import java.io.IOException;

/*
 * @Description: File Operations
 * 
 * @Methods: checkFileExists(), createDirectory(), createEmptyFile(), listFilesAndDirectories(), deleteFile(), checkFileNotExists()
 */
class FileOperation {

	/*
	 * @Description: Method to check if the file exists
	 * 
	 * @Param: filePath
	 * 
	 * @Return: void
	 * 
	 */
	void checkFileExists(String filePath) {
		File file = new File(filePath);
		if (file.exists()) {
			System.out.println("File exists: " + filePath);
		} else {
			System.out.println("File does not exist: " + filePath);
		}
	}

	/*
	 * @Description: Method to create a directory
	 * 
	 * @Param: directoryPath
	 * 
	 * @Return: void
	 * 
	 */
	void createDirectory(String directoryPath) {
		File directory = new File(directoryPath);
		if (!directory.exists()) {
			directory.mkdir();
			System.out.println("Directory created: " + directoryPath);
		} else {
			System.out.println("Directory already exists: " + directoryPath);
		}
	}

	/*
	 * @Description: Method to create an empty file
	 * 
	 * @Param: emptyFilePath
	 * 
	 * @Return: void
	 * 
	 */
	void createEmptyFile(String emptyFilePath) {
		File file = new File(emptyFilePath);
		try {
			if (file.createNewFile()) {
				System.out.println("Empty file created: " + emptyFilePath);
			} else {
				System.out.println("File already exists: " + emptyFilePath);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @Description: Method to list the files and directories
	 * 
	 * @Param: directoryPath, extension
	 * 
	 * @Return: void
	 * 
	 */
	void listFilesAndDirectories(String directoryPath) {
		File directory = new File(directoryPath);
		if (directory.exists() && directory.isDirectory()) {
			System.out.println("Files and directories in " + directoryPath + ":");
			for (File file : directory.listFiles()) {
				if (file.isDirectory()) {
					System.out.println("Directory: " + file.getName());
				} else if (file.isFile()) {
					System.out.println("File: " + file.getName() + ", Extension: " + getFileExtension(file));
				}
			}
		} else {
			System.out.println("Directory does not exist: " + directoryPath);
		}
	}

	private String getFileExtension(File file) {
		String name = file.getName();
		int DotIndex = name.indexOf('.');
		if (DotIndex > 0 && DotIndex < name.length() - 1) {
			return name.substring(DotIndex + 1);
		}
		return "";
	}

	/*
	 * @Description: Method to delete a file
	 * 
	 * @Param: filePath
	 * 
	 * @Return: void
	 * 
	 */
	void deleteFile(String filePath) {
		File file = new File(filePath);
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("File deleted: " + filePath);
			} else {
				System.out.println("Failed to delete file: " + filePath);
			}
		} else {
			System.out.println("File does not exist: " + filePath);
		}
	}

}
