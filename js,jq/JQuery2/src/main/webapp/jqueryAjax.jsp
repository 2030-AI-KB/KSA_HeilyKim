<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<title>Insert title here</title>
<script>
//jquery�� �̿��� ajax ����
//ajax: �ε����� �������� �����ϴ� ���� ������ ��
	/* $(function(){
		$("#btn").click(function(){
			$("#p").load("halo.txt")
		})
	}) */
	
//get() post() �޼ҵ� ���
//get("�޾ƿ� ������","�ݹ��Լ�")
	/* $(function(){
		$("#btn").click(function(){
			$.get("halo.txt",function(data,status){
				//alert("��ż���")
				$("p").html("������: "+data+"<br>����: "+status)
			})
		})
	}) */
//$.post("�����������Ұ���",������,�ݹ��Լ�)
	$(function(){
		$("#btn").click(function(){
			$.post("input.txt",
					{name:"���",age: 25},
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