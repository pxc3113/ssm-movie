<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/inc.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <form id="queryForm">
      <div id="showMovie"></div>
      <input type="hidden" name="cpage" id="currentPage">
     </form>
</body>
<script type="text/javascript">
  ///页面加载事件加载电影
  $(function(){
	  serach(1);
  })
  //分页查询电影
  function serach(cpage){
	  //把查询当前的页面值赋值给隐藏域
	  $("#currentPage").val(cpage);
	   $.ajax({
		   url:"<%=request.getContextPath()%>/movie/queryMovieList.do",
		   type:"post",
		   data:$("#queryForm").serialize(),
		   dataType:"html",
		   success:function(data){
			   $("#showMovie").html(data);
		   },error:function(){
			   alert("查询失败");
		   }
	   }) 
  }

</script>
</html>