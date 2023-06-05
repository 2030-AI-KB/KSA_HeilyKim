<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- Ajax�� ���α׷��� ���� �ƴϴ� -->
<!-- Ajax�� �ε� ���� �������� �����ϰ� ��׶��忡�� �������� ������ ���� ��� 
		(js �̺�Ʈ ������ �����ִ� ���̺귯��)-->
<!--"�ٴҶ� js" Ȥ�� Jquery ���� ����  -->
	<button id="btn" onclick="Func()">��������</button>
	<p id="text"></p> <!--onload �Լ� ������ ��� -->
	<p id="test"></p> <!--onprogress �Լ� ������ ��� -->
	<script>
	//XMLHttpRequest ��ü: �������� "������ ��ȯ"�� ���(js���� ������)
	//�� ��ü�� ���ؼ� ������ �� �Ϻθ� ������Ʈ ����
	//*���� ���
		// 1. XEMLHttpRequest ��ü����->����� ������ �̿�
		// 2. �ݹ� �Լ�(������ ����/�߽� �� �� ������ �Լ�) ����
			/* xhr.��ü��.�ݹ��Լ���=function(){
				(�ݹ��Լ��� �����Ű�� ������ ������ ��) ������ ��ɹ�
			} */
		// �ݹ� �Լ� ����
			/* onload: xhr ��ü�� �����κ��� �����͸� ���������� ������ ������ �Լ�
			   onerror: xhr ��ü ���� ������ �߽�/���� �Ǵ� xhr ��ü ��ü�� ���� �߻� �� ������ �Լ�
			   onprogress: xhr ��ü���� ������ ���Ź��� �� ȣ���� �Լ� */
		function Func(){
			let xhttp=new XMLHttpRequest(); 
			xhttp.onload=function(){   //������ ���������� ���Ź޾��� ��
				document.getElementById("text").innerHTML=this.responseText;
			}
			xhttp.onprogress=function(){
				document.getElementById("test").innerHTML="��� �� ���";
			}
		//3. ������ ��û ������: open() send()
			/*open(): ������ ��û�� ���� ���
				    =>xhr��ü��.open("GET/POST","������ ��û�� ������")
					    =>GET: �����κ��� �����͸� �޾ƿ� �� ���(=������ ��û�Ҷ�)
					    =>POST: ������ �����͸� ���� �� ���
			  send(): ������ ��û ������
			  		=>xhr��ü��.send() -> POST�����϶� str�� �Ű������� �־�ߵ�(send(string)) 
			  	GET=>open()�� �ι�° �Ű����� �ʿ�
			  	POST=>send()�� ù��° �Ű����� �ʿ�
			  		*/
			xhttp.open("GET","Ȧ.txt");
			xhttp.send();
		}
	</script>
</body>
</html>