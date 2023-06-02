<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>아래는 나의 인적사항이다아</p>
	<button id="btn" onclick="btn()">난 버튼</button>
	<p id="info"></p>
	<p>---*지금까지 수업했던 내용 불러온다*---</p>
	<p>JAVA</p>
	<button id="btn2" onclick="btn2()">나도 버튼</button>
	<p id="java"></p>
	<p>HTML/CSS</p>
	<button id="btn3" onclick="btn3()">나도 버튼인데</button>
	<p id="htmlcss"></p>
	<p>JS</p>
	<button id="btn4" onclick="btn4()">나도 버튼</button>
	<p id="js"></p>
	<p>AJAX</p>
	<button id="btn5" onclick="btn5()">버튼이다</button>
	<p id="ajax"></p>
	<script>
		function btn(){
			let bt=new XMLHttpRequest();
			bt.onload=function(){
				document.getElementById("info").innerHTML=this.responseText;
			}
			bt.onprogress=function(){
				alert("내 정보를 불러온다");
			}
			bt.open("GET","info.txt");
			bt.send();
		}
		function btn2(){
			let jv=new XMLHttpRequest();
			jv.onload=function(){
				document.getElementById("java").innerHTML=this.responseText;
			}
			jv.onprogress=function(){
				alert("자바프라푸치노를 불러온다");
			}
			jv.open("GET","java.txt");
			jv.send();
		}
		function btn3(){
			let ht=new XMLHttpRequest();
			ht.onload=function(){
				document.getElementById("htmlcss").innerHTML=this.responseText;
			}
			ht.onprogress=function(){
				alert("html 불러온다");
			}
			ht.open("GET","htmlcss.txt");
			ht.send();
		}
		function btn4(){
			let js=new XMLHttpRequest();
			js.onload=function(){
				document.getElementById("js").innerHTML=this.responseText;
			}
			js.onprogress=function(){
				alert("js 불러온다");
			}
			js.open("GET","js.txt");
			js.send();
		}
		function btn5(){
			let aj=new XMLHttpRequest();
			aj.onload=function(){
				document.getElementById("ajax").innerHTML=this.responseText;
			}
			aj.onprogress=function(){
				alert("아작 불러온다");
			}
			aj.open("GET","ajax.txt");
			aj.send();
		}
	</script>
</body>
</html>