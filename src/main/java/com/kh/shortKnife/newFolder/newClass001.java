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

	//ǥ�ر�Ģ
	//Ŭ������ ù���ڰ� ���ĺ��빮��
	//�޼ҵ�� ù���ڰ� ���ĺ��ҹ��� 
	
	
	@ResponseBody
	@RequestMapping("test1130")
	public String test1() {
		return "kigenda";
	//@ResponseBody�� ������ String ������ ��ü�� ��ȯ�Ѵ�. return ������ ������ ��ȯ�ȴ�.
	
	}
	
	
	@RequestMapping("noresponseBodyjsp")
	public String test2() {
		return "jspfile";
	//jsp�� ã�´�. �ֳĸ� ResponseBody�� ������ RequestMapping���� ����� �ּҸ� ã�� �����̴�.
	//jsp ������ ���ų� �̸��� ����Ȯ�ϸ� ������ �߻��Ѵ�.
	
	}

//	map���� 1 ("key","value");
//	list���� 2 �迭�� ���� �ٷ�� ���ؼ� �ִ� �ڹ��� �ڷᱸ��
//	json���� 3 "":"" �ڹٽ�ũ��Ʈ���� �����͸� ��ȯ�ϴ� ����
	
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
	
	
	@ResponseBody //����� ������ ��ü�� �ٵ� ��Ƽ� �����Ѵ�.
	@RequestMapping("map001")
	public Map<String, String> test3() {
		
//		Map<String, String> nameMap;
//		
//		nameMap = new HashMap<String, String>();
//		nameMap = new TreeMap<String, String>();
		
	    Map<String, String> nameMap = new HashMap<String, String>();
	   
	    nameMap.put("7:30", "���");
	    System.out.println(nameMap);
        return nameMap;
	//jsp�� ã�´�. �ֳĸ� ResponseBody�� ������ RequestMapping���� ����� �ּҸ� ã�� �����̴�.
	//jsp ������ ���ų� �̸��� ����Ȯ�ϸ� ������ �߻��Ѵ�.
	
	}
	
	// ����������
	@Autowired
	private User01 user01;
	//���������� �ڷ���(User01�̶�� Ŭ����: ����� ���� �ڷ���) ������

	@ResponseBody //����� ������ ��ü�� �ٵ� ��Ƽ� �����Ѵ�.
	@RequestMapping("user01")
	public User01 test4() {
		
		// ��ü�� new �����ڷ� �����ϰ�
		User01 user = new User01();
		user.setId("001");
		user.setName("����");
		
		// ������������ ����ؼ�
		user01.setId("002");
		user01.setName("�ȳ�");
        return user01;
        
	//jsp�� ã�´�. �ֳĸ� ResponseBody�� ������ RequestMapping���� ����� �ּҸ� ã�� �����̴�.
	//jsp ������ ���ų� �̸��� ����Ȯ�ϸ� ������ �߻��Ѵ�.
	
	}
}
