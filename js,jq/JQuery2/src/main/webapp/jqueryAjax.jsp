<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<title>Insert title here</title>
<script>
//jquery를 이용항 ajax 구현
//ajax: 로딩없이 페이지를 갱신하는 데에 도움을 줌
	/* $(function(){
		$("#btn").click(function(){
			$("#p").load("halo.txt")
		})
	}) */
	
//get() post() 메소드 사용
//get("받아올 데이터","콜백함수")
	/* $(function(){
		$("#btn").click(function(){
			$.get("halo.txt",function(data,status){
				//alert("통신성공")
				$("p").html("데이터: "+data+"<br>상태: "+status)
			})
		})
	}) */
//$.post("데이터저장할공간",데이터,콜백함수)
	$(function(){
		$("#btn").click(function(){
			$.post("input.txt",
					{name:"김상",age: 25},
					function(data,status){
						$("#txt").html(data+"<br>"+status)		
						}
				)
		})
	})
</script>
</head>
<body>
	<button id="btn">imma button</button>
	<p id="p"></p>
	<p id="txt"></p>
</body>
</html>