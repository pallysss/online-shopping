<div class="container">
	<div class="row">
		<!-- displaying sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- displaying products -->
		<div class="col-md-9">
			<!--  Breadcrumb Component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${clickAllProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${clickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item" ><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>