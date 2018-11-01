
<%
		//request:请求对象
		String path=request.getContextPath();		
		//拼接服务器当前项目的根目录绝对路径
		String basePath=request.getScheme()+"://"
		+request.getServerName()+":"
		+request.getServerPort()+path+"/";			
%>
<!-- 定义所有html标签url的基准路径 -->
<base href="<%=basePath%>"/>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>








