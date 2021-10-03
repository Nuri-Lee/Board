package board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.service.BoardService;
import board.vo.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService boardService;
	
	@RequestMapping(value="/board/writeView", method=RequestMethod.GET)
	public void writeView() throws Exception {
		LOGGER.info("writeView");
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception {
		LOGGER.info("write");
		boardService.write(boardVO);
		System.out.println("##################################################boardVO"+boardVO);
		return "redirect:/";
	}
}
