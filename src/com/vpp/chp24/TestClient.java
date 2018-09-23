package com.vpp.chp24;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp24.xml");

		BookDAO dao = container.getBean(BookDAO.class);

		try {
			System.out.println(dao.findBookByAuthor("autho1"));
		} catch (ResultNotFoundException e) {
			e.printStackTrace();
		}
		container.close();
	}

}
