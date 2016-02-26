<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title"></tiles:insertAttribute>e</title>
<tiles:insertAttribute name="head" ignore="true"></tiles:insertAttribute>
</head>
<body>
	<s:a action="index">Home</s:a>
	<s:a action="aboutus">About Us</s:a>
	<s:a action="news">News</s:a>
	<br>
	<tiles:insertAttribute name="content"></tiles:insertAttribute>
	Copyright 2016
</body>
</html>