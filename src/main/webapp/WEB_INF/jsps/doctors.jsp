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
<title>Doctors</title>
</head>
<body>
<div class="container">
<h2>Doctors</h2>
<hr>
<h3>Payment</h3>
		<form action="pay" method="post" >
        	<div class="form-group">
				<label>Code</label>
				<input class="form-control" name="code" type="text" />
			</div>
			<input class="btn btn-outline-primary" value="Pay It" type="submit" />
			</form>
</br>
</br>
<hr>
<div class="accordion" id="accordionExample">
<c:forEach items="${doctors}" var="item">
<div class="card">
    <div class="card-header" id="${item.username} + id">
      <h2 class="mb-0">
        <button class="btn" type="button" data-toggle="collapse" data-target="# + ${item.username}" aria-expanded="false" aria-controls="${item.username}">
          ${item.firstName} ${item.lastName}
        </button>
      </h2>
    </div>

    <div id="${item.username}" class="collapse show" aria-labelledby="${item.username} + id" data-parent="#accordionExample">
      <div class="card-body">
      <img src="${item.photo}" style="border-radius:100px"/>
      	<h2>${item.firstName} ${item.lastName }</h2> 
        <h6>Visit price: ${item.visitPrice}Toman</h6>
        
        <c:forEach items="${specialties}" var="s">
        <c:if test="${s.specialtyID == item.sID}">
        	<h6>Specialty: ${s.name}</h6>
        </c:if>
        </c:forEach>
        </br>
        
        <h5>Appointments:</h5>
        <c:forEach items="${states}" var="st">
		<c:if test="${st.dID == item.username}">
			<hr>
        	<h6>Date: ${st.year}/${st.month }/${st.day }</h6>
        	<h6>Office Address: ${st.street }, alley${st.alley }</h6>
        	<h6>Plaque: ${st.plaque }</h6>
        	<h6>Aphone number: ${st.aphone_number }</h6>
        	<h6>Time: ${st.start_hour }:00 to ${st.end_hour }:00</h6>
        	<c:if test="${st.aID == null }"> 
        			<form action="reserve" method="post" >
				<div class="form-group">
					<label>Doctor username:</label>
					<input class="form-control"readonly  name="doctorID" type="text" value="${item.username}"/>
				</div>
	        	<div class="form-group">
					<label>Insert your phone number:</label>
					<input class="form-control" name="userID" type="text" />
				</div>
				<div class="form-group">
					<label>Payment code:</label>
					<input class="form-control" name="payID" type="text"/>
				</div>
				<input class="btn btn-outline-primary" value="Reserve At Office" type="submit" />
				</form>
        	</c:if>
        	<c:if test="${!st.aID == null }">
        	<h6 class="">Reserved</h6>
        	</c:if>
        	
        </c:if>
		</c:forEach>
        
        <c:forEach items="${hstates}" var="st">
		<c:if test="${st.dID == item.username}">
			<hr>
        	<h6>Date: ${st.year}/${st.month }/${st.day }</h6>
        	<h6>Health Care Center Address: ${st.street }, alley${st.alley }</h6>
        	<h6>Plaque: ${st.plaque }</h6>
        	<h6>Aphone number: ${st.aphone_number }</h6>
        	<h6>Time: ${st.start_hour }:00 to ${st.end_hour }:00</h6>
        	<c:if test="${st.aID == null }"> 
			<form action="reserveh" method="post" >
				<div class="form-group">
					<label>Doctor username:</label>
					<input class="form-control" readonly name="doctorID" type="text" value="${item.username}"/>
				</div>
	        	<div class="form-group">
					<label>Insert your phone number:</label>
					<input class="form-control" name="userID" type="text" />
				</div>
				<div class="form-group">
					<label>Payment code:</label>
					<input class="form-control" name="payID" type="text"/>
				</div>
				<input class="btn btn-outline-primary" value="Reserve At Health Care Center" type="submit" />
				</form>
        	</c:if>
        	<c:if test="${!st.aID == null }">
        	<h6 class="">Reserved</h6>
        	</c:if>
        	
        </c:if>
		</c:forEach>
		
        
      </div>
    </div>
  </div>
</c:forEach>
</div>
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