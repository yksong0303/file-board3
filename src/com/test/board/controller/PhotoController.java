package com.test.board.controller;

import java.util.Map;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.test.board.vo.PhotoBoardVO;


@Controller
public class PhotoController {
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public String goList() {
		return "board/list";
	}
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String goWrite() {
		return "board/write";
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String doWrite(@ModelAttribute PhotoBoardVO pb, @RequestParam("pbfile") MultipartFile file) {
//		System.out.println(pb);
//		System.out.println(file.getSize()/1024 +"kb");
		return "board/write";
	}
}
