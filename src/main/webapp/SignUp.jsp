<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Accounting</title>
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap/main-core/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="css/bootstrap/metisMenu/dist/metisMenu.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="css/sb-admin-2.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="font/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Create a User</h3>
                </div>
                <div class="panel-body">
                    <form method="post" action="#">
                        <div class="form-group">
                            <label for="userEmail">*Email address:</label>
                            <input class="form-control" placeholder="E-mail" name="email" id="userEmail" type="email"
                                   autofocus required>
                        </div>
                        <div class="form-group">
                            <label for="userName">*User Name:</label>
                            <input class="form-control" placeholder="User Name" name="userName" id="userName"
                                   type="text" required>
                        </div>
                        <div class="form-group">
                            <label for="Pass">*Password:</label>
                            <input class="form-control" placeholder="Password" name="password" type="password" value=""
                                   id="Pass" required>
                        </div>
                        <div class="form-group">
                            <label for="confirmPass">*Confirm Password:</label>
                            <input class="form-control" placeholder="Password" name="password" type="password" value=""
                                   id="confirmPass" required>
                        </div>
                        <p class="bg-info" style="padding: 10px">We would strongly recommend you, fill all information
                            in the Profile page</p>
                        <!-- Change this to a button or input when using this as a form -->
                        <button class="btn btn-block btn-primary btn-lg" type="submit">Create</button>
                        <h5><a href="index.jsp" style="float: right"> Back to main page </a></h5>
                    </form>
                    <div class="panel-body">
                        <%--<a href="index.jsp" class="btn btn-block btn-primary btn-lg" role="button">Back to Main Page</a>--%>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- jQuery -->
<script src="../bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>
<!-- Custom Theme JavaScript -->
<script src="../dist/js/sb-admin-2.js"></script>
</body>
</html>