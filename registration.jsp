<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
    table,
    th,
    td {
        color: black;
        table-layout: fixed;
        width: fit-content;
        background-color: beige;
        border-radius: 2px;
        border-color: black;
        width: 50%;
        margin: 5px;
    }
    .container{
    background-color:beige;
    width: 500px;
    border:2px solid;
    padding-left: 2%;
    margin:10px;
    position: relative;
    border-radius: 5px;
}
img{
    width: 25%;
    float:left;
    margin:20px;
    border:2px;
}
h1{
    color: brown ;
    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
    font-size: larger;
padding-left: 10%;
}
input[type=text]:focus, input[type=password]:focus,input[type=radio]:focus,input[type=date]:focus,input[type=checkbox]:focus  {
    background-color: #ddd;
  }

  .registerbtn {
    background-color: #04AA6D;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 90%;
    opacity: 0.9;
  }
  .vermn{
    background-color: #ddd;
  }
  
  .registerbtn:hover {
    opacity:1;
  }
  table{
    background-origin: padding-box;
    padding-left: 10px;
    margin: 5px;
    border: 3px;
  }
</style>
<body>
    <h1> REGISTRATION FORM</h1>
    <div class="container">

        <table>
            <form action="http://localhost:8080/WebApplication/registrationservlet" method="post" autocomplete="on">

                <p><b>Please fill in this form to create an account.</b></p>





                <label for="un"><b> Enter First name </b> </label>
                <input type="text" name="user_name" id="un" required>




                <br>
                <br>
                <b>Enter Last name</b>
                <input type="text" name="pass"><br><br>



                <b> Enter Address</b> <br>
                <textarea name="Description" cols="36" rows="3"></textarea>

                <br><br>

                <label for="mn"><b>Enter Mobile Number </b></label>
                <input type="text" placeholder="9XXXXXXXXX" name="phnnum" id="phnnum" required><br><br>
                
                <label for="date"> <b>Enter your date of birth </b></label>
                <input type="date" placeholder="date" id="date" required>
                <br><br>
                                <label for="psw"><b> Enter Password </b></label>
                <input type="password" name="psw" id="psw"><br><br>

                <label for="psw-repeat"><b>Confirm Password </b></label>
                <input type="password" name="psw-repeat" id="psw-repeat">
                <hr>



                <p>By creating an account you agree to our <a href="#">Terms & Privacy</a></p>
                <button type="submit" class="registerbtn">Register</button><br><br>
                <p><b>Already have an account?</b> <a href="#">Sign in</a>.</p>
    </div>

                








</body>
</html>