package com.kh.shortKnife.newFolder;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Controller @Service @Component @Repository-> bean �� ������̼����� ���

// Ŭ����
@Component
public class User01 {

	// �ʵ�
	// ����������. �ڷ��� . ������
	private String id;
	private String name;
	
	// �⺻ ������
	public User01() {
	}
	// �Ű����� �ִ� ������
	public User01(String id, String name) {
		this.id = id;
		this.name  = name;
	}
	
	// �޼ҵ�
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
