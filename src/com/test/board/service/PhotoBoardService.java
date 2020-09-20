package com.test.board.service;

import org.springframework.web.multipart.MultipartFile;

import com.test.board.vo.PhotoBoardVO;

public interface PhotoBoardService {
	
	int insertPhotoBoard(PhotoBoardVO pb, MultipartFile file);

}
