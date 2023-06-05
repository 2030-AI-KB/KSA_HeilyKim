<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- jquery script 적용 -->
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	//jquery는 보통 head안에 작성함
	//jquery: js 언어 사용을 간편하게 하는 데에 도움을 주는 js library (jquery는 프로그래밍 언어가 아니다)
	//기본 문법: $(선택자).동작함수()	
	//$(document).ready(생략가능) == document.onload ==$ 
		//->"문서"를 불러온다, 홈페이지를 이렇게 "구성한다"
	
	
	$(function(){
		//document.getElementById("h").innerHTML="성공적"; //id가 h인 태그에 해당 문자열 삽입
		$("#h").html("성공적")
	})
	$(function(){    //홈페이지를 불러올때 아래 함수를 수행한다
		$("button").click(function(){   //button 태그를 클릭하면, 아래 함수 수행(html내 모든 button태그에 적용)
			$("p").hide();  //html내 모든 p태그에 숨기기
		});
	});
	//==> button 태그 클릭시 모든 p태그 숨기기
	
	//css처리->태그 style에 대한 적용(이벤트도 가능)
	//id #, class는 .
	$(function(){
		$("#h").css("color","orange");
		$("p").click(function(){
			$("p").css("font-size","larger")
			$("p").css("color","pink")
		})
		})
	
	
</script>
</head>
<body>
	<h2 id="h">halo</h2>
	<p>난 para얌</p>
	<button>난 버튼이얌</button>
</body>
</html>