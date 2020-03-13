

<div class="d-flex justify-content-center h-100">

		<div class="card">
			<div class="card-header">
				<h3>Register</h3>		
				
			</div>
			<div class="card-body">
				<form action="LoginController" method="post">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="Url" name="url">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="Channel" name="channel">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="genre" name="genre">
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary" role="button" style="padding:10px;" value="Login"></input>
						<input type="submit" class="btn btn-warning" role="button" style="padding:10px;" value="register"></input>
						<input type="submit" class="btn btn-warning" onclick="form.action='AddSiteController';" style="padding:10px;" value="AddSite">
					</div>
				</form>
				<a href="channels.jsp">channels</a>
			</div>
		</div>
	</div>