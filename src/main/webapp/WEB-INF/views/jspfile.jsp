<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<title>Insert title here</title>
</head>
<body>
jspfile�� �����Ѵ�. 
�ֳĸ� ResponseBody�� ������
RequestMapping�̱� ������ ����� ������ ã�� ���̴�.
ajax ������ �� ����!

html������ �Ἥ~
		$.ajax({
			type:,	//������ ���� Ÿ�� get, post
			url:,	//������ ��û�� �ּ�, �� �ּҿ� ����� �����Ѵ�.
			data:,	//������ data (JSON)�������� ���۵ȴ�. ex) {name1:value1, name2:value2}
			dataType:,	//������ dataType ex)"json"
			success:function(data){	//��û�۾��� ���������� ���� �� ���������� �߰������� �۾��� ���� �Է�
				
			}, error:function(xhr, status, error){	//��û�� �۾��� �����ϴ� ��� ������ �۾��� �Է��ϴ� ����. �ַ� �����޼��� ���.
				
			}
		});

	<style>
		/* ��ư ���� ���� ���ֱ� */
		/* �𼭸� �ձ۰� ����� */
		#test_btn1{
		margin-right:-4px;
		border-top-left-radius:5px;
		border-bottom-left-radius:5px;
		}
		#test_btn2{
		margin-left:-3px;
		border-top-right-radius:5px;
		border-bottom-right-radius:5px;
		
		}
		
		/* ��ư ������ �ٲٱ� */
		#btn_group button{
		border : 1px solid skyblue;
		background-color : rgba(0,0,0,0);
		color : skyblue;
		padding: 5px;
		}
		
		/* hover */
		#btn_group button:hover{
		color:white;
		background-color: skyblue;
		}
		
	</style>

	<div id="btn_group">
		<button id="test_btn1">�׽�Ʈ1</button>	
		<button id="test_btn2">�׽�Ʈ2</button>	
	</div>
	<div>
		<div id ="test1"></div>
		<div id ="test2"></div>
		<div id ="test3"></div>
	</div>

	<script>
	$("#test_btn1").click(function(){
		
		$.ajax({
			type:"post",
			url:"/shortKnife/views/jspfile2",	//TODO ���� ���ϰ� ��� ����?
		//	data: //�ش� ���˿��� ������ ������ ���� ����,
// 			dataType: "json", //������ �����ʹ� ������, �ִٸ� {name1:value1, name2:value2} ���� json��������.
			success:function(data){		//TODO ���⿡�� data�� �����ΰ� ��Ʈ�ѷ����� ���Ź��� ������.
// 				alert('ajasxCommunication success!');
// 				alert(data)
// 				console.log(data);
				$('#test1').text(data.name);
				$('#test2').text(data.key);
				$('#test3').text(data.age);
// 				alert(data."name"); ���� ����
// 				alert(data.name);
			},error:function(xhr, status, error){
				alert("error\nxhr : " + xhr + 
					  ", status   : " + status +
					  ", error    : " + error );
			}
		});
	});	
		
		
	</script>


</body>
</html>