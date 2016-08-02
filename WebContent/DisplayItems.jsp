<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddToCart" >
<BR>
Please enter item to add or remove:
<br>
Add Item:

	<select NAME="items" size="5" multiple="multiple">
		<option>Jeans
		<option>T Shirt
		<option>Shoes
		<option>Trousers
		<option>Dress
	</select>


<br> <br>
<input TYPE=submit name="add" value="add" onclick="AddToCart">


</form>

</body>
</html>