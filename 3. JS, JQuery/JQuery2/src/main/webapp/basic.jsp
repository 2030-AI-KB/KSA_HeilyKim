<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- jquery script ���� -->
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	//jquery�� ���� head�ȿ� �ۼ���
	//jquery: js ��� ����� �����ϰ� �ϴ� ���� ������ �ִ� js library (jquery�� ���α׷��� �� �ƴϴ�)
	//�⺻ ����: $(������).�����Լ�()	
	//$(document).ready(��������) == document.onload ==$ 
		//->"����"�� �ҷ��´�, Ȩ�������� �̷��� "�����Ѵ�"
	
	
	$(function(){
		//document.getElementById("h").innerHTML="������"; //id�� h�� �±׿� �ش� ���ڿ� ����
		$("#h").html("������")
	})
	$(function(){    //Ȩ�������� �ҷ��ö� �Ʒ� �Լ��� �����Ѵ�
		$("button").click(function(){   //button �±׸� Ŭ���ϸ�, �Ʒ� �Լ� ����(html�� ��� button�±׿� ����)
			$("p").hide();  //html�� ��� p�±׿� �����
		});
	});
	//==> button �±� Ŭ���� ��� p�±� �����
	
	//cssó��->�±� style�� ���� ����(�̺�Ʈ�� ����)
	//id #, class�� .
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
	<p>�� para��</p>
	<button>�� ��ư�̾�</button>
</body>
</html>