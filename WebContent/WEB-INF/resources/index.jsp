<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<meta http-equiv="content-type" content="text/html;charset=utf-8" />


<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="ReviewBox - Home Page">
    <meta name="keywords" content="">
    <meta name="author" content="Umar, prashant , nilima">
    <title>ReviewBox</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/css/common/bootstrap.min.css" rel="stylesheet">
    <!-- Plugins -->
    <link href="resources/css/social-icons.css" rel="stylesheet">
    <!--    <link href="assets/fonts/fontawesome/css/font-awesome.min.css" rel="stylesheet">-->
    <link href="resources/css/icomoon.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="resources/css/style.css" rel="stylesheet">

    <link href="resources/fonts/css/font-awesome.min.css" rel="stylesheet">
    <!-- Web Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
    
    <!--Favicon-->
    <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
    <link rel="icon" href="resources/favicon1.png" type="image/x-icon">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->
		
		
		
    <script src="resources/js/common/modernizr.custom.js"></script>
</head>

<body data-spy="scroll" data-offset="0" data-target="#navigation">
	
    <!-- Fixed navbar -->
    <nav id="navigation" class="navbar navbar-default navbar-fixed-top" role="navigation">
    	
        <div class="container">
        
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-navbar-collapse">
                    <span><i class="fa fa-bars"></i></span>
                </button>
                <a class="navbar-brand" href="index.jsp" style="padding: 1px 25px;"><img src="resources/resources/images/favicon1.png" height="55px"> </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="navbar-collapse collapse" id="bs-navbar-collapse">
		
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#home" class="smoothScroll">Home</a></li>
                    <li><a href="#contact" class="smoothScroll">Contact</a></li>
                </ul>

                <!-- Sign In / Sign Up -->
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <div class="navbar-form pull-left">
                            <a href="#signup" type="button" class="btn btn-sm btn-theme" data-toggle="modal" data-target=".bs-modal-sm"><span class="icon-pencil"></span> Sign Up</a>
                        </div>
                    </li>

                    <li class="dropdown ">
                        <div class="navbar-form pull-left">
                            <a href="#signin" type="button" class="btn btn-sm btn-theme" data-toggle="modal" data-target=".bs-modal-sm"><span class="icon-lock"></span> Log In</a>
                        </div>
                    </li>
                </ul>
            </div>
            <!--/nav-collapse -->
        </div>
        <!-- /container -->
    </nav>
    <!-- /fixed-navbar -->


    <!-- Sign In / Sign Up Modal -->
    <div class="modal fade bs-modal-sm" id="myModal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <br>
                <div class="bs-example bs-example-tabs">
                    <ul id="myTab" class="nav nav-tabs nav-justified">
                        <li class="active"><a href="#signin" data-toggle="tab">Log In</a></li>
                        <li class=""><a href="#signup" data-toggle="tab">Sign Up</a></li>
                    </ul>
                </div>
                <div class="modal-body">
                    <div id="myTabContent" class="tab-content">
                        <!-- Log In Form -->
                        <div class="tab-pane fade active in" id="signin">
                            <form class="form-horizontal" action="validateUser" method="post">
                                <fieldset>
                                    <!-- Text input-->
                                    <div class="control-group">
                                        <div class="controls">
                                            <input id="Email" name="email" class="form-control input-large" type="email" placeholder="Email Address" required>
                                        </div>
                                    </div>
                                    <br/>
                                    <!-- Password input-->
                                    <div class="control-group">
                                        <div class="controls">
                                            <input required id="passwordinput" name="password" class="form-control input-medium" type="password" placeholder="Password">
                                        </div>
                                    </div>
                                    <br/>
                                    <!-- Multiple Checkboxes (inline) -->
                                    <!-- <div class="control-group">
                                        <label class="control-label" for="rememberme"></label>
                                        <div class="controls">
                                            <label class="checkbox-inline" for="rememberme-0">
                                                <input type="checkbox" name="rememberme" id="rememberme-0" value="Remember me"> Remember me
                                            </label>
                                        </div>
                                    </div> -->

                                    <!-- Button -->
                                    <div class="control-group">
                                        <label class="control-label" for="signin"></label>
                                        <div class="controls">
                                            <button id="signin" type="submit" class="btn btn-theme btn-block">Sign In</button>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                        <!-- /signin -->

                        <!-- Sign Up Form -->
                        <div class="tab-pane fade" id="signup">
                            <form class="form-horizontal" action="register" method="POST">
                                <fieldset>

                                    <!-- First Name-->
                                    <div class="controls">
                                        <input id="name" name="name" class="form-control input-large" type="text" placeholder="Full Name"  required>
                                    </div>
                                    <br/>
                                    
                                <%--     <!-- Text input-->
                                    <div class="controls">
                                        <input id="companyname" name="companyname" class="form-control input-large" type="text" placeholder="Company Name" value="${companyName}" required>
                                    </div>
                                    <br/> --%>

                                    <!-- Email Input-->
                                    <div class="controls">
                                        <input id="Email" name="email" class="form-control input-large" type="text" placeholder="Email Address" required>
                                    </div>
                                    <br/>

                                    <!-- Password input-->
                                    <div class="controls">
                                        <input id="password" name="password" class="form-control input-large" type="password" placeholder="Password" required>
                                    </div>
                                    <br/>
                                    
                                    <!-- Button -->
                                    <div class="control-group">
                                        <label class="control-label" for="confirmsignup"></label>
                                        <div class="controls">
                                            <button id="confirmsignup" name="confirmsignup" class="btn btn-theme btn-block">Sign Up</button>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                        <!-- /signup -->
                    </div>
                    <!-- /tab-content -->
                </div>
                <!-- /modal-body -->

                <!--
                    <div class="modal-footer">
						<div class="text-center">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						</div>
					</div>
                    -->
            </div>
            <!-- /modal-content -->
        </div>
        <!-- /modal-dialog -->
    </div>
    <!-- /modal -->


    <!-- Header Wrap -->
    <section id="home">
        <div class="headerwrap">
            <div class="container">
                <div class="row text-center">
                    <div class="col-lg-12">
                        <h1><!--<b style="color:dodgerblue;">ReviewBox</b>--> <img src="resources/resources/images/review.png" height="170px"></h1>
                        <h3>read & write your reviews.</h3>
                        <br>
                    </div>

                    <div class="col-lg-2 hidden-xs hidden-sm hidden-md">
                        <h5>Write your reviews here</h5>
                        <p>reviews according to you.</p>
                        <img src="resources/resources/images/arrow-left.png" alt="">
                    </div>
                    <div class="col-lg-8">
                        <img class="img-responsive" src="resources/resources/images/app-bg.png" alt="">
                        <!--<h4>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</h4>
							<a href="#features" type="submit" class="btn btn-lg btn-theme smoothScroll">LEARN MORE</a>-->
                    </div>
                    <div class="col-lg-2 hidden-xs hidden-sm hidden-md">
                        <br>
                        <img class="pad-top" src="resources/resources/images/arrow-right.png" alt="">
                        <h5>read & write your reviews</h5>
                        <p>your reviews are here.</p>
                    </div>
                </div>
            </div>
            <!-- /container -->
        </div>
        <!-- /headerwrap -->


   


    <!-- Footer Wrap -->
    <section id="contact">
        <div class="footerwrap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <h3>Contact Us</h3>
                        <br>
                        <p><span class="icon-location"></span> ReviewBox.com Pune
                            <br/>
                            <span class="icon-phone"></span> (+91) 9454919094
                            <br/>
                            <span class="icon-envelope"></span> <a href="mailto:support@reviewbox.com">support@reviewbox.com</a>
                        </p>
                    </div>

                    <div class="col-lg-4">
                        <h3>Social Media</h3>
                        <br>
                        <div id="social">
                            <a href="#" class="tooltip-toggle twitter" data-toggle="tooltip" data-placement="bottom" title="Twitter">Twitter</a>
                            <a href="#" class="tooltip-toggle facebook" data-toggle="tooltip" data-placement="bottom" title="Facebook">Facebook</a>
                            <a href="#" class="tooltip-toggle github" data-toggle="tooltip" data-placement="bottom" title="Github">Github</a>
                            <a href="#" class="tooltip-toggle linkedin" data-toggle="tooltip" data-placement="bottom" title="LinkedIn">LinkedIn</a>
                            
                        </div>

                    </div>

                   



                </div>
            </div>
            <!-- /row -->
        </div>
        <!-- /container -->
        </div>
        <!-- /footerwrap -->
    </section>


    <!-- Copyright Wrap -->
    <div class="copywrap">
        <div class="container">
            <div class="row">
                <div class="col-lg-9">
                    <p>Copyright &copy;2016 ReviewBox.all rights reserved</p>
                </div>
                
    <!-- /copywrap (copyright) -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="resources/js/common/jquery-2.1.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/js/common/bootstrap.min.js"></script>
    <script src="resources/js/common/jquery.easing.1.3.js"></script>
    <script src="resources/js/common/detectmobilebrowser.js"></script>
    <script src="resources/js/common/smoothscroll.js"></script>
    <script src="resources/js/common/waypoints.js"></script>
    <script src="resources/js/common/main.js"></script>
    <script>
        $('.carousel').carousel({
            interval: 3500,
            pause: "none"
        })
    </script>
    <script>
        $(function () {
            $("[data-toggle='tooltip']").tooltip();
        });
    </script>
</body>

</html>