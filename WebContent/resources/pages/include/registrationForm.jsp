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
						<input type="text" class="form-control" placeholder="username" name="username">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password" name="password">
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="email" class="form-control" placeholder="email" name="email">
					</div>
					
					<div class="form-group">
						<input type="submit" class="btn btn-primary" role="button" style="padding:10px;" value="Login"></input>
						<input type="submit" class="btn btn-warning" role="button" style="padding:10px;" value="register"></input>
						<input type="submit" class="btn btn-warning" onclick="form.action='RegisterController';" style="padding:10px;" value="Submit">
					</div>
				</form>
			</div>
		</div>
	</div>