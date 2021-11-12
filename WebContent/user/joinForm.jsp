<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/blog/user?cmd=join" method="post">

		<div class="form-group">
			<input type="text" name="username" class="form-control" placeholder="Enter Username" required>
		</div>

		<div class="form-group">
			<input type="password" name="password" class="form-control" placeholder="Enter Password"required>
		</div>

		<div class="form-group">
			<input type="email" name="email"class="form-control" placeholder="Enter Email"required>
		</div>

		<div class="form-group">
			<input type="text" name="address"class="form-control" placeholder="Enter Address"required>
		</div>
		
		<br>

		<button type="submit" class="btn btn-primary">ȸ�����ԿϷ�</button>
	</form>
</div>
</body>
</html>