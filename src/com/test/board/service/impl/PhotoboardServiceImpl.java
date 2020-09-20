package com.test.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.test.board.service.PhotoBoardService;
import com.test.board.vo.PhotoBoardVO;

@Service
public class PhotoboardServiceImpl implements PhotoBoardService{

	@Override
	public int insertPhotoBoard(PhotoBoardVO pb, MultipartFile file) {
		
		return 0;
	}

}
