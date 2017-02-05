<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="index.css"></link>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"/>
<title>सारांश</title>
</head>
<body>
<div id="wrapper">
  	
  		<div id="nav">
  	  		<ul style="margin:0;">
  	  			<li id="nav_list_logo"><a href="index.jsp" style="color: #e32636;">सारांश</a></li>
  	  			<li class="nav_list"><a href="contactus.jsp" style="color: black;"> | CONTACT US</a></li>
  	  			<li class="nav_list" style="padding-right:10px;"><a href="aboutus.jsp" style="color: black;">ABOUT US</a></li>
  	  	
  	  	<!--  
  	  			<li id="nav_list_logo"><a href="index.html" style="color: #e32636;margin-top:auto;margin-bottom:auto;">सारांश</a></li>
  	  			<li class="nav_list" style="float:right;font-size:20px;font-family: verdana;padding-right: 5px;margin-top:auto;margin-bottom:auto;">| CONTACT US</li>
  	  			<li class="nav_list" style="float:right;font-size:20px;font-family: verdana;padding-right:15px;margin-top:auto;margin-bottom:auto;">ABOUT US</li>
  	  	-->
  	  		</ul>
  	  	</div>  	
	<div id="content">
  	<!-- <img type ="background-image" src="website.jpg" id="bg" alt="image"/> -->
  		<ul style="list-style-type:none;">
  		<li style="color: white;margin-left:0;display:inline-block;float:left;">
  		<pre style="font-size: 20px;padding-top: 30px;">
Address:
  		
L.D College of Engineering,				
Opp. Gujarat University,				
Navrangpura, Ahmedabad-380015			
Gujarat, India							
Mobile No: 9714688686				
  		</pre>
  		</li>
  		<li style="display:inline-block;float:left;">
   		<pre style="color:white;font-family:verdana;">Name:</pre>
   		<input type="text" id="name" size="50" placeholder="Name"/><br/>
   		<pre style="color:white;font-family:verdana;">E-mail:</pre>
   		<input type="email" id="mail" size="50" placeholder="Email"/><br/>
   		<pre style="color:white;font-family:verdana;">Message:</pre>
   		<textarea id="message" placeholder="Message" rows="7" cols="50"></textarea><br/>
   		<br/>
   		<input type="submit" name="send" value="send" style="border-radius:0px;font-size:15px;">
   		</li>
   		<br/>
   		</ul>
   		  	  	   </div>
  	
	<div id="footer">
	<ul style="list-style-type:none;marign:0;text-align:center;">
		<li style="display:inline;margin-top:auto;margin-bottom:auto;font-size:15px;font-family:verdana;padding-right:15px;">CREATED BY TEAM सारांश</li>
	<!--  
	<li style="display:inline;padding-left: 30px;"><i class="fa fa-facebook" style="font-size: 25px;padding-right: 10px;"></i></li>  
	<li style="display:inline;"><i class="fa fa-twitter" style="font-size: 25px;"></i></li>
	-->
		<li style="display:inline;">
			<i class="fa fa-facebook" style="font-size: 20px;padding-right: 5px;"></i>
			<i class="fa fa-twitter" style="font-size: 20px;"></i>
		</li>
	</ul>
 </div>
 
 </div>
 	 <script type="text/javascript" charset="utf-8">
 	 $(documnet).ready(function() {
  	  	 function cleartext()
  	  	 {
  	  		 document.getElementById('abc').value = "";
  	  	 }
  	  	 function wordtoken()
  	  	 {
  	  		 var str = document.getElementById('abc').value;
  	  		 var tokens = str.split(" ");
  	  		 for(var i=0;i<tokens.length;i++)
  	  			 {
  	  			 	document.getElementById('abc').innerHTML="<a class='words'>tokens[i]</a>";
   	  			 } 	
  	  	 }
 	});
 	 </script>
</body>
</html>