<% 
	// redirekcija na login stranicu
	if(request.getCharacterEncoding() == null) {
 	  request.setCharacterEncoding("UTF-8");
	}
	
	response.sendRedirect("./login.jsp");
%>


<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
