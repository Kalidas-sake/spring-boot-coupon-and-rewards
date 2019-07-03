<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Rewards And Coupons</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="vendor/custom/css/customstyle.css" rel="stylesheet">
  <style type="text/css">
  .business-header {
    height: 300px;
    background: url('https://images.pexels.com/photos/232/apple-iphone-books-desk.jpg?w=940&h=650&auto=compress&cs=tinysrgb') center center no-repeat scroll;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    background-size: cover; 
    -o-background-size: cover;
}
  </style>

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">ReadMyStory</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item ">
            <a class="nav-link" href="/">Home
             <!--   <span class="">(current)</span>  -->
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/about">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="extra"></div>
  
  <header class="business-header">
    <div class="jumbotron jumbotron-fluid bg-dark text-white">
    <div class="container">
      <div class="col-lg-12 text-center">
      <hr>
        <h1 class="tagline">Get free PayTM cash</h1>
        <hr>
        <p>Answer the question asked on the basis of story <br>
        and get chance to win coupon of PayTM cash.</p>
        <p class="text-danger">Daily lucky 10 winners.</p>
      </div>
    </div>
    </div>
    </header>
    <div class="container">
    <div class="card">
	  <div class="card-header">
	    Today's Story
	  </div>
	  <div class="card-body">
	    <blockquote class="blockquote mb-0 text-justify">
	      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
	      <!--  <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
	      <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>-->
	      <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
	      <footer class="blockquote-footer">Someone famous in <cite title="Source Title">Source Title</cite></footer>
	    </blockquote>
	  </div>
	</div>
    
    <div class="container card" style="margin-top: 20px; ">
    	<h2 class="text-center" style="padding-top: 20px;">Answer this question</h2>
    	<div class="card" style="width: 80%; margin: 0 auto; padding: 10px;">
    	<p class="text-success card-body" >Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat?</p>
    	</div>
    	<div >
    		<div class="" style="width: 80%; margin: 0 auto;">
    			<form class="form-horizontal" style="padding-top: 20px;" action="answer" onsubmit="return validation()">
    				<div class="form-group">
				    <label class="control-label col-sm-6" for="email">Email</label>
				    <div class="col-sm-12">
				      <input type="email" class="form-control" id="email" name="umail" placeholder="Enter email">
				    </div>
				  </div>
				  <div class="form-group">
				    <label class="control-label col-sm-6" for="ans">Answer the question</label>
				    <div class="col-sm-12">
				      <input type="text" class="form-control" id="ans" name="uans" placeholder="Enter answer here">
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-12">
				      <input type="submit" class="btn btn-primary">
				    </div>
				  </div>
    			</form>
    		</div>
    	</div>
    </div>
    
    
  </div>

	<footer class="text-center" style="margin: 25px;">
		<h3>READMYSTORY</h3>
		<p>Copyright &copy 2019 </p>
	</footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.slim.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="vendor/custom/js/customjs.js"></script>
  
  <script>
  
  function validation(){
	  //alert("form submitted");
	  return true;
  }
  
  </script>

</body>

</html>
