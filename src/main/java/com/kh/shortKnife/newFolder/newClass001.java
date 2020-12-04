package com.kh.shortKnife.newFolder;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class newClass001 {

	//표준규칙
	//클래스는 첫글자가 알파벳대문자
	//메소드는 첫글자가 알파벳소문자 
	
	
	@ResponseBody
	@RequestMapping("test1130")
	public String test1() {
		return "kigenda";
	//@ResponseBody가 있으면 String 데이터 자체를 반환한다. return 이하의 내용이 반환된다.
	
	}
	
	
	@RequestMapping("noresponseBodyjsp")
	public String test2() {
		return "jspfile";
	//jsp를 찾는다. 왜냐면 ResponseBody가 빠지고 RequestMapping으로 연결된 주소를 찾기 때문이다.
	//jsp 파일이 없거나 이름이 부정확하면 오류가 발생한다.
	
	}

//	map형식 1 ("key","value");
//	list형식 2 배열을 쉽게 다루기 위해서 있는 자바의 자료구조
//	json형식 3 "":"" 자바스크립트에서 데이터를 교환하는 형식
	
	/*
	 * <!-- MappingJacksonJsonView --> <dependency>
	 * <groupId>org.codehaus.jackson</groupId>
	 * <artifactId>jackson-mapper-asl</artifactId> <version>1.9.13</version>
	 * </dependency>
	 * 
	 * <dependency> <groupId>org.codehaus.jackson</groupId>
	 * <artifactId>jackson-core-asl</artifactId> <version>1.9.13</version>
	 * </dependency>
	 */
	
	
	@ResponseBody //응답된 데이터 자체를 바디에 담아서 전송한다.
	@RequestMapping("map001")
	public Map<String, String> test3() {
		
//		Map<String, String> nameMap;
//		
//		nameMap = new HashMap<String, String>();
//		nameMap = new TreeMap<String, String>();
		
	    Map<String, String> nameMap = new HashMap<String, String>();
	   
	    nameMap.put("7:30", "퇴근");
	    System.out.println(nameMap);
        return nameMap;
	//jsp를 찾는다. 왜냐면 ResponseBody가 빠지고 RequestMapping으로 연결된 주소를 찾기 때문이다.
	//jsp 파일이 없거나 이름이 부정확하면 오류가 발생한다.
	
	}
	
	// 의존성주입
	@Autowired
	private User01 user01;
	//접근제한자 자료형(User01이라는 클래스: 사용자 정의 자료형) 변수명

	@ResponseBody //응답된 데이터 자체를 바디에 담아서 전송한다.
	@RequestMapping("user01")
	public User01 test4() {
		
		// 객체를 new 연산자로 생성하게
		User01 user = new User01();
		user.setId("001");
		user.setName("공부");
		
		// 의존성주입을 사용해서
		user01.setId("002");
		user01.setName("안녕");
        return user01;
        
	//jsp를 찾는다. 왜냐면 ResponseBody가 빠지고 RequestMapping으로 연결된 주소를 찾기 때문이다.
	//jsp 파일이 없거나 이름이 부정확하면 오류가 발생한다.
	
	}
}
