# exampleMVC

### **1. Description**
* Customer ID를 입력하면 ID에 해당하는 Customer의 ID와 NAME을 출력하는 프로그램 입니다.
* Servlet과 JSP를 활용한 MVC 패턴을 사용했습니다.


### **2. Environment**
* **Eclispe**
  + Dynamic Web Project로 초기 프로젝트 생성(web.xml을 위해)
  + Maven Project(Create a single project(skip archetype selection))로 변경(lombok 사용을 위해)
* **Tomcat 9.0**


### **3. Packages**
* **Controller**
  + 사용자의 요청을 처리하는 Servlet 클래스
  + Home, DoLogin
* **Model**
  + 애플리케이션의 데이터를 저장하는 클래스
  + Customer
* **Service**
  + Controller의 요청을 받아 비즈니스 로직을 처리하는 클래스
  + CustomerService

### **4. Files**
* **View**
  + JSP file로 사용자에게 보여지는 화면
  + error, help, loginform, success
* **index.jsp**
  + 프로그램 실행 시 사용자에게 보여지는 첫 화면
  + 2개의 링크로 구성(loginform, help)
* **web.xml**
  + 기본적인 web.xml 파일
  + 기본 웹 페이지를 index.jsp로 연결
* **pom.xml**
  + lombok
  + jstl 
