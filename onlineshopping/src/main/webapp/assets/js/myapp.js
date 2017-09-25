$(function() {
	switch (menu) {
	case 'About Us':
		$('#aboutNav').addClass('active');
		break;
	case 'Contact Us':
		$('#contactNav').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
	default:
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
});