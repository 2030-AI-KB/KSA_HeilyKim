<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- Ajax는 프로그래밍 언어는 아니다 -->
<!-- Ajax는 로딩 없이 웹페이지 갱신하고 백그라운드에서 웹서버로 데이터 전송 사용 
		(js 이벤트 동작을 도와주는 라이브러리)-->
<!--"바닐라 js" 혹은 Jquery 통해 구현  -->
	<button id="btn" onclick="Func()">눌러봐라</button>
	<p id="text"></p> <!--onload 함수 실행결과 출력 -->
	<p id="test"></p> <!--onprogress 함수 실행결과 출력 -->
	<script>
	//XMLHttpRequest 객체: 웹서버와 "데이터 교환"에 사용(js에선 생성자)
	//이 객체를 통해서 페이지 중 일부만 업데이트 가능
	//*응용 방법
		// 1. XEMLHttpRequest 객체생성->내장된 생성자 이용
		// 2. 콜백 함수(데이터 수신/발신 할 시 수행할 함수) 정의
			/* xhr.객체명.콜백함수명=function(){
				(콜백함수를 실행시키는 조건이 만족할 때) 수행할 명령문
			} */
		// 콜백 함수 종류
			/* onload: xhr 객체가 서버로부터 데이터를 성공적으로 받을때 수행할 함수
			   onerror: xhr 객체 통한 데이터 발신/수신 또는 xhr 객체 자체에 문제 발생 시 수행할 함수
			   onprogress: xhr 객체에서 데이터 수신받을 때 호출할 함수 */
		function Func(){
			let xhttp=new XMLHttpRequest(); 
			xhttp.onload=function(){   //데이터 성공적으로 수신받았을 때
				document.getElementById("text").innerHTML=this.responseText;
			}
			xhttp.onprogress=function(){
				document.getElementById("test").innerHTML="통신 중 띠띠";
			}
		//3. 서버에 요청 보내기: open() send()
			/*open(): 서버에 요청할 내용 기술
				    =>xhr객체명.open("GET/POST","서버에 요청할 데이터")
					    =>GET: 서버로부터 데이터를 받아올 때 사용(=데이터 요청할때)
					    =>POST: 서버로 데이터를 보낼 때 사용
			  send(): 서버에 요청 보내기
			  		=>xhr객체명.send() -> POST형실일때 str형 매개변수가 있어야됨(send(string)) 
			  	GET=>open()의 두번째 매개변수 필요
			  	POST=>send()위 첫번째 매개변수 필요
			  		*/
			xhttp.open("GET","홀.txt");
			xhttp.send();
		}
	</script>
</body>
</html>