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
jspfile로 연결한다. 
왜냐면 ResponseBody는 빠지고
RequestMapping이기 때문에 연결된 파일을 찾는 것이다.
ajax 연결을 해 보자!

html문법을 써서~
		$.ajax({
			type:,	//데이터 전달 타입 get, post
			url:,	//서버에 요청할 주소, 이 주소와 통신을 시작한다.
			data:,	//전달할 data (JSON)형식으로 전송된다. ex) {name1:value1, name2:value2}
			dataType:,	//전달할 dataType ex)"json"
			success:function(data){	//요청작업을 성공적으로 수행 후 페이지에서 추가적으로 작업할 내용 입력
				
			}, error:function(xhr, status, error){	//요청할 작업을 실해하는 경우 수행할 작업을 입력하는 공간. 주로 에러메세지 출력.
				
			}
		});

	<style>
		/* 버튼 사이 간격 없애기 */
		/* 모서리 둥글게 만들기 */
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
		
		/* 버튼 배경색상 바꾸기 */
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
		<button id="test_btn1">테스트1</button>	
		<button id="test_btn2">테스트2</button>	
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
			url:"/shortKnife/views/jspfile2",	//TODO 현재 파일과 통신 가능?
		//	data: //해당 유알엘에 전달할 데이터 딱히 없음,
// 			dataType: "json", //전달할 데이터는 없지만, 있다면 {name1:value1, name2:value2} 같은 json형식으로.
			success:function(data){		//TODO 여기에서 data는 무엇인가 컨트롤러에서 수신받은 데이터.
// 				alert('ajasxCommunication success!');
// 				alert(data)
// 				console.log(data);
				$('#test1').text(data.name);
				$('#test2').text(data.key);
				$('#test3').text(data.age);
// 				alert(data."name"); 없는 문법
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