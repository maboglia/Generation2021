<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Categorie</h1>
<ul>
<c:forEach items="${categorie}" var="cat">
	
	<li>${cat}</li>	

</c:forEach>
</ul>

</body>
</html>