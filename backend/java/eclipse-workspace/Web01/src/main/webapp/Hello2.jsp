<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!--page directive-->

<%! 
    String name = "비트교육센터";
    public String getName() {return name;}
%> <!--자바코드 중 변수 선언문-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>안녕! <%=name%></h1> <!--변수 사용법-->
    <h1>나는 <%=getName()%></h1>
</body>
</html>