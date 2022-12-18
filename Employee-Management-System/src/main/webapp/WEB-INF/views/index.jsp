<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page isELIgnored="false" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS</title>
<style type="text/css">


       @import url('https://fonts.googleapis.com/css2?family=Crimson+Text&display=swap');
        body{
            margin: 0px;
              padding: 0px;
              box-sizing: border-box;
              font-family: 'Lora', serif;
              background-color: rgba(212, 192, 245, 0.24);

        }
        #navbar{
            width: 100%;
            display: flex;
            align-items: center;
            justify-content: space-around;
            text-shadow: 2px 0 0px #800040;
            color: #c4e22c;
            /* border: 1px solid black; */
            background-color: white;
            box-shadow: 0px 4px 17px 3px rgba(118,98,245,0.81);
            text-shadow: 2px 0 0px #800040, 3px 2px 0px rgba(77,0,38,0.5), 3px 0 3px #FF002B, 5px 0 3px #800015, 6px 2px 3px rgba(77,0,13,0.5), 6px 0 9px #f8ad88, 8px 0 9px #802A00, 9px 2px 9px rgba(77,25,0,0.5), 9px 0 18px #FFD500, 11px 0 18px #806A00, 12px 2px 18px rgba(77,66,0,0.5), 12px 0 30px #D4FF00, 14px 0 30px #6A8000, 15px 2px 30px rgba(64,77,0,0.5), 15px 0 45px #80FF00, 17px 0 45px #408000, 17px 2px 45px rgba(38,77,0,0.5);


      }
        #navbar>div:first-child{
            width: 150px;-shadow: rgba(139, 194, 217, 0.35) 0px 5px 15px;;
            border-radius: 10px;
            box-shadow: rgba(188, 226, 65, 0.35) 0px 5px 15px;
        }

        #navbar>div:first-child>img{
            width: 100%;
            border-radius: 10px;
            height: 100%;
        }
        ul{
            margin-left: 450px;
            margin-top: 100px;
            font-family: 'Crimson Text', serif;
            font-weight: 900;
            border: 3px solid black;
            width: 300px;
            border-radius: 20px;
            box-shadow: 0px 4px 17px 3px rgba(118,98,245,0.81);
            align-items: center;
            justify-content: center;
        }
        
        
      
      
</style>

</head>
<body>

    <div id="navbar"> 
        <div><img src="https://github.com/sudarshanmane/Hotstar/blob/main/Screenshot%20(2023).png?raw=true" alt=""></div>
        <div><h1>Employee Management System</h1></div>
    </div>

    <ul>
        <li><a href=""><h2>Register New Employee</h2></a></li>
        <li><a href=""><h2>View All Employee List</h2></a></li>
        <li><a href=""><h2>View Deleted Employees List</h2></a></li>
        <li><a href=""><h2>Update Employee Salary</h2></a></li>
      </ul> 
      
      
      
      
      

</body>
</html>