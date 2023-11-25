<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
<style>
	
	.wrapper{
		border: 1px;
		margin: auto;
	}
		
</style>
</head>
<body>

	<div class="wrapper">
		<form action="/WebProjectTest/UploadFileServlet" method="post" enctype="multipart/form-data">
			<label>Please Upload File here</label>
			<input type="file" name="Upload Photo"><br>
			<label>Name</label><input type="text" name="name"><br>
			<input type="submit" name="Submit">
		</form>
	</div>


</body>
</html>