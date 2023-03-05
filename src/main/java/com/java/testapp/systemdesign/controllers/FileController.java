package com.java.testapp.systemdesign.controllers;

import com.java.testapp.systemdesign.entities.File;
import com.java.testapp.systemdesign.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileController
{
	@Autowired
	private FileService fileService;

	@PostMapping("/files")
	public void createFile(@RequestBody File file)
	{
		fileService.saveFile(file);
	}

}
