package com.pxl.controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class upload {
	@RequestMapping(value="/uploadfile",method=RequestMethod.POST)
	public String uploadfile(
	@RequestParam(value="file",required=true) MultipartFile file 
	) throws IOException {
		byte[] bytes=file.getBytes();
		File newfile=new File(file.getOriginalFilename());
		FileCopyUtils.copy(bytes, newfile);
		return newfile.getAbsolutePath();
		
	}
}
