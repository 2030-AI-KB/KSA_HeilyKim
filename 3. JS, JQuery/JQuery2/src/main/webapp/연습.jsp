<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<title>Insert title here</title>
<script>
	$(function(){
		$("#fp").html("�ƺ�ī�� �ܹ�")
		$("#sp").html("���ö�")
		$("#tp").html("������")
		$("#rm").html("�����Ĵ�")
		$("#rm2").html("���")
	})
	$(function(){
		$("#f").click(function(){
			$("#fp").css("color","red")
			$("#fp").css("font-size","30px")
		})
		$("#s").click(function(){
			$("#sp").css("color","blue")
			$("#sp").css("font-size",",20px")
		})
		$("#t").click(function(){
			$("#tp").css("color","green")
			$("#tp").css("font-size","10px")
		})
		$("#r").click(function(){
			$("#rm").hide()
			$("#rm2").hide()
		})
	})
</script>
<style>
	p {
		display:inline;
	}
</style>
</head>
<body>
	<div>
		<p id='fp'></p>
		<p id='sp'></p>
		<p id='tp'></p>
		<p id='rm'></p>
		<p id='rm2'></p>
	</div>
	<br>
	<button id="f">1���� �޴� ����</button>
	<button id="s">2���� �޴� ����</button>
	<button id="t">3���� �޴� ����</button>
	<button id="r">�ĺ� �����</button>
</body>
</html>