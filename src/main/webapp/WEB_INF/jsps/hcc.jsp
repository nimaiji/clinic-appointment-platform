<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Health Care Centers</title>
</head>
<body>
<div class="container">
<h2>Health Care Centers</h2>
	<c:forEach items="${hccs}" var="hcc">
		<div class="card">
    <div class="card-header" id="${hcc.hccID} + id">
      <h2 class="mb-0">
        <button class="btn" type="button" data-toggle="collapse" data-target="# + ${hcc.hccID}" aria-expanded="false" aria-controls="${hcc.hccID}">
          Health Care Center At: ${hcc.street },Alley${hcc.alley }
        </button>
      </h2>
      <div id="${hcc.hccID}" class="collapse show" aria-labelledby="${hcc.hccID} + id" data-parent="#accordionExample">
      <div class="card-body">
      
      <c:forEach items="${doctors}" var="doc">
		<c:if test="${doc.hID == hcc.hccID}">
      		${doc.firstName} ${doc.lastName}
      		</c:if> 
      	</c:forEach>
      </div>
      </div>
    </div>
    </div>
	</c:forEach>
	</div>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>