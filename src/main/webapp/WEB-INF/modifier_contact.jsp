<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter Contact</title>
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
<form action="GestionContact" method="post">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Nom</label>
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nom">
      </div>
      <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">Prénom</label>
        <input type="text" class="form-control" id="exampleFormControlInput2" placeholder="Prénom">
      </div>
      <div class="mb-3">
        <label for="exampleFormControlInput3" class="form-label">Numéro Tel</label>
        <input type="text" class="form-control" id="exampleFormControlInput3" placeholder="Numéro Téléphone">
      </div>
    <div class="mb-3">
        <label for="exampleFormControlInput4" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleFormControlInput4" placeholder="name@example.com">
      </div>
      <button type="submit" class="btn btn-syccess">Ajouter</button>
</form>
</body>
</html>