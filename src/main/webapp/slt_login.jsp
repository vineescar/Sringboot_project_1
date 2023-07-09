<!DOCTYPE html>
<head>

<title>Welcome to MySLT Selfcare</title>

<style>
body {
  background-image: url("image/SLT2.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

#container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 20vh;
  
}

#container img {
  max-width: 200%;
  max-height: 200%;
}

#banner {
  margin-top:150px;
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

<div id="container">

<img src="image/SLT1.jpg" />

</div>

<div id="banner">

<form action="tryUser">
USER ID <br>
<input type="text" name="id"><br><br>
PASSWORD<br>
<input type="password" name="name"><br><br>
<input type="submit" id="submitBtn" value="Sign In"><br>
</form>

</div>

<div id="banner">
<form action="upUser">

<input type="submit" id="submitBtn" value="Sign Up"><br>
</form>

</div>


</body>
</html>