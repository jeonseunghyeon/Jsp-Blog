<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/action_page.php">

		<div class="form-group">
			<input type="text" class="form-control" placeholder="Enter Username">
		</div>

		<div class="form-group">
			<input type="password" class="form-control" placeholder="Enter Password">
		</div>

		<div class="form-group">
			<input type="email" class="form-control" placeholder="Enter Email">
		</div>

		<div class="form-group">
			<input type="text" class="form-control" placeholder="Enter Address">
		</div>
		
		<br>

		<button type="submit" class="btn btn-primary">ȸ�����ԿϷ�</button>
	</form>
</div>
</body>
</html>