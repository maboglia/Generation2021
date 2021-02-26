<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/admin/updateProduct/${prodotto.id}" method="post">

<%-- 	<input type="text" name="id" value="${prodotto.id}" readonly> --%>
	<input type="text" name="prodotto" value="${prodotto.prodotto}">
	<input type="text" name="categoria" value="${prodotto.categoria}">
	<input type="text" name="proteine" value="${prodotto.proteine}">
	<input type="text" name="lipidi" value="${prodotto.lipidi}">
	<input type="text" name="carboidrati" value="${prodotto.carboidrati}">
	<input type="text" name="energia" value="${prodotto.energia}">
	<input type="submit" value="aggiungi prodotto">
		


</form>

</body>
</html>