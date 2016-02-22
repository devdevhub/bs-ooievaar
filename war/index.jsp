<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

	<%@include file="header.jsp"%>
	<link rel="stylesheet" type="text/css" href="reken.css">
	
	<%@include file="nav.jsp"%>
	
		<div id="body-wrapper">
			<ul id="hoofdstukken-nav">
				<li>Onderwerpen</li>
				<li>test1</li>
				<li>test2</li>
				<li>test3</li>
				<li>test4</li>
				<li>test5</li>
			</ul>
			<div id="content-wrapper">
				<div id="box">
					<%@include file="reken.jsp"%>
				</div>
			</div>
		</div>
		
	<%@include file="footer.jsp"%>