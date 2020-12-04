package com.kh.shortKnife.newFolder;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Controller @Service @Component @Repository-> bean 을 어노테이션으로 등록

// 클래스
@Component
public class User01 {

	// 필드
	// 접근제한자. 자료형 . 변수명
	private String id;
	private String name;
	
	// 기본 생성자
	public User01() {
	}
	// 매갱변수 있는 생성자
	public User01(String id, String name) {
		this.id = id;
		this.name  = name;
	}
	
	// 메소드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User01 [id=" + id + ", name=" + name + "]";
	}
	
}
