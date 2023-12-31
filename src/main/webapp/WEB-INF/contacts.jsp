<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" ></script>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"  />

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

       
        <script src="https://kit.fontawesome.com/b311bd2f98.js" crossorigin="anonymous"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" ></script>
</head>
<body>
    <div class="container mt-5">
    <div class="d-flex justify-content-end"><a href="AddContact" class="btn btn-success fw-bold fs-3">Ajouter</a></div>
        <h1>Contact List</h1>
   <div class="my-3 bg-light">
          <table class="table table-striped">
            <thead>
                <tr class="fs-2 fw-bolder">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th classs="text-danger">Edit</th>
                    <th class="text-success">Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contact" items="${contacts}">
               		<tr>
                        <td>${contact.nom}</td>
                        <td>${contact.prenom}</td>
                        <td>${contact.email}</td>
                        <td>${contact.numero_tele}</td>
                        <td><a class="btn btn-success px-3" href="Edit?id=${contact.id}"> modifier</a></td>
                        <td><a class="btn btn-danger px-3" href="Delete?id=${contact.id}">supprimer</a></td>
                    </tr>
            </c:forEach>
                    
             
            </tbody>
        </table>
   </div>
    </div>

    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>