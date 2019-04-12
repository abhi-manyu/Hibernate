<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
  h2 {
	color: lime;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div>
    <form action="./deleterecord">
      <h2>enter the data associated with record, u want to delete </h2>
       enter the roll no : <input type="number" name="delno" required />
       <input type="submit" value="delete record" />
    </form>
  </div>
</body>
</html>