<!DOCTYPE html>
<head>

<title>Welcome to Signup page</title>

<style>
body {
  background-image: url("image/SLT2.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

#banner {
  margin-top:200px;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 20vh; 
  color:white;
  font-size:28px;
  
}

input[type="text"] {
   padding: 10px 20px;
  font-size: 16px;
  background-color: #0B2A58;
  font-size: 20px;
  color: black;
}

input[type="submit"] {
  padding: 10px 20px;
  font-size: 16px;
  background-color: #0B2A58;
  font-size: 20px;
  color: white;

}
#submitBtn:hover {
    background-color: #337ab7;
    color: #fff;
    cursor: pointer;
}

input[type="password"] {
  padding: 10px 20px;
  font-size: 16px;
  background-color: #0B2A58;
  font-size: 20px;
  color: black;

}

 </style>

</head>

<body >

<div id="banner">

<form action="saveUser">
TELEPHONE.NO <br>
<input type="text" name="id"><br><br>

PACKAGE.NAME <br>
<input type="text" name="packname"><br><br>

CUSTOMER.NAME <br>
<input type="text" name="name"><br><br>

ENTER.PASSWORD <br>
<input type="text" name="password"><br><br>

<input type="submit" id="submitBtn" value="Saveinfo"><br>
</form>

</div>


</div>


</body>
</html>