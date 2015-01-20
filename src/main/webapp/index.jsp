<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%> 
<html>
<body>
<h2>Hello World!</h2><br>
<a href="<%=basePath %>login.do">login</a>
</body>
</html>
