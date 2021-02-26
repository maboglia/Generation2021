<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Scheda Prodotto</h1>

<h2>${prodotto.prodotto}</h2>
<ul>
	<li>Cat: ${prodotto.categoria}</li>
	<li>proteine: ${prodotto.proteine}</li>
	<li>lipidi: ${prodotto.lipidi}</li>
	<li>carboidrati: ${prodotto.carboidrati}</li>
	<li>energia: ${prodotto.energia}</li>
</ul>


</body>
</html>