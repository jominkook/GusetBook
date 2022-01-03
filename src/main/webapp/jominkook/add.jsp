<%@page import="jominkook.GuestBookDaoImpl"%>
<%@page import="jominkook.GuestBookDao"%>
<%@page import="jominkook.GuestBookVo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String password = request.getParameter("pass");
	String content = request.getParameter("content");
	GuestBookVo gvo = new GuestBookVo();
	gvo.setName(name);
	gvo.setPassword(password);
	gvo.setContent(content);
	GuestBookDao dao = new GuestBookDaoImpl();
	if(dao.insert(gvo)) {
		response.sendRedirect("list.jsp");
	}
%>
</body>
</html>