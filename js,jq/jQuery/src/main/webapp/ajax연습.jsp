<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>�Ʒ��� ���� ���������̴پ�</p>
	<button id="btn" onclick="btn()">�� ��ư</button>
	<p id="info"></p>
	<p>---*���ݱ��� �����ߴ� ���� �ҷ��´�*---</p>
	<p>JAVA</p>
	<button id="btn2" onclick="btn2()">���� ��ư</button>
	<p id="java"></p>
	<p>HTML/CSS</p>
	<button id="btn3" onclick="btn3()">���� ��ư�ε�</button>
	<p id="htmlcss"></p>
	<p>JS</p>
	<button id="btn4" onclick="btn4()">���� ��ư</button>
	<p id="js"></p>
	<p>AJAX</p>
	<button id="btn5" onclick="btn5()">��ư�̴�</button>
	<p id="ajax"></p>
	<script>
		function btn(){
			let bt=new XMLHttpRequest();
			bt.onload=function(){
				document.getElementById("info").innerHTML=this.responseText;
			}
			bt.onprogress=function(){
				alert("�� ������ �ҷ��´�");
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
				alert("�ڹ�����Ǫġ�븦 �ҷ��´�");
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
				alert("html �ҷ��´�");
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
				alert("js �ҷ��´�");
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
				alert("���� �ҷ��´�");
			}
			aj.open("GET","ajax.txt");
			aj.send();
		}
	</script>
</body>
</html>