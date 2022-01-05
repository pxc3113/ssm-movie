<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="/common/inc.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <table border="1">
       <tr>
         <td>电影编号</td>
         <td>电影名称</td>
         <td>电影评分</td>
         <td>上映时间</td>
         <td>是否上映</td>
         <td>电影价格</td>
         <td>电影类型</td>
         <td>电影地区</td>
         <td>电影年代</td>
         <td>电影介绍</td>
         <td>电影海报</td>
         <td>操作</td>
       </tr>
       <c:forEach items="${page.list }" var="m">
        <tr>
         <td>${m.movieid }</td>
         <td>${m.moviename }</td>
         <td>${m.moviescore }</td>
         <td>${m.moviedate }</td>
         <td>${m.movieup==1?"是":"否" }</td>
         <td>${m.movieprice }</td>
         <td>${m.movieType.typename }</td>
         <td>${m.movieAddress.addressname }</td>
         <td>${m.movieYear.yearname }</td>
         <td>${m.movieshow }</td>
         <td>
           <img alt="图片不见了" width="50px" height="50px" src="${m.movieFile.filename }">
         </td>
         <td>
           <input type="button" value="删除" class="btn btn-danger" onclick="delMovie('${m.movieid }','${m.moviename }')"> 
         </td>
       </tr>
       </c:forEach>
     </table>
     <jsp:include page="/common/page.jsp"></jsp:include>
</body>
<script type="text/javascript">
  //单个删除
  function delMovie(movieid,moviename){
	 /*  alert(movieid);
	  alert(moviename); */
	  //使用发布确认框提示用户是否删除
	  if(confirm("你确定删除 "+moviename+" 吗？")){
		  //发起ajax请求进行删除
		  $.ajax({
			  url:"<%=request.getContextPath()%>/movie/delMovie.do",
			  type:"post",
			  data:{"movieid":movieid},
			  success:function(){
				  location.reload();
			  },error:function(){
				  alert("删除失败");
			  }
		  })
	  }
  }

</script>
</html>