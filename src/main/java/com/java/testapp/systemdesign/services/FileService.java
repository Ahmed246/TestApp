package com.java.testapp.systemdesign.services;

import com.java.testapp.systemdesign.entities.File;
import com.java.testapp.systemdesign.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService
{
	@Autowired
	private FileRepository fileRepository;

	public FileService(FileRepository fileRepository)
	{
		this.fileRepository = fileRepository;
	}

	public void saveFile(File file)
	{
		fileRepository.save(file);
	}
}
