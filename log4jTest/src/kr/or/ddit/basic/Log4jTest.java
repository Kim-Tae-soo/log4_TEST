package kr.or.ddit.basic;

import org.apache.log4j.Logger;

public class Log4jTest {

	static Logger logger = Logger.getLogger(Log4jTest.class); 
	
	public static void main(String[] args) {
		// 로그 메세지 출력하기
		// 형식) logger객체변수.로그레벨명("출력할 메세지..");
		
		logger.trace("이 메세지는 [trace]레벨의 메세지 입니다.");
		logger.debug("이것은 [debug]레벨의 메세지 입니다.");
		logger.info("[info]레벨의 메세지 출력이빈다.");
		logger.warn("경고는 [warn]레벨로 출력합니다.");
		logger.error("오류메세지를 출력하는 [error] 레벨입니다.");
		logger.fatal("아주 심각한 오류의 [fatal]레벨의 메세지 입니다.");
		
	}

}
