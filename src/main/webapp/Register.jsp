<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookies</title>

<style type="text/css">
html {
	height: 100%;
}

body {
	height: 100%;
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	display: grid;
	justify-items: center;
	align-items: center;
	background-color: orange;
}

#main-holder {
	width: 50%;
	height: 70%;
	display: grid;
	justify-items: center;
	align-items: center;
	background-color: white;
	border-radius: 7px;
	box-shadow: 0px 0px 5px 2px black;
}

#form {
	align-self: flex-start;
	display: grid;
	justify-items: center;
	align-items: center;
}

#submit {
	width: 100%;
	padding: 10px;
	border: none;
	border-radius: 2px;
	color: white;
	font-weight: bold;
	background-color: #3a3a3a;
	cursor: pointer;
	outline: none;
}
</style>
</head>
<body>
	<main id="main-holder">
		<h1 id="header">How Cookie Works Using Servlet</h1>
		<form id="form" action="servlet1" method="post">
			<table border="2"
				style="text-align: center; border-collapse: collapse;"
				cellpadding="10">
				<tr>
					<td><label for="name">NAME: </label></td>
					<td><input type="text" id="name" name="name"></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="submit"
						id="submit"></td>

				</tr>
			</table>
		</form>
	</main>
</body>
</html>