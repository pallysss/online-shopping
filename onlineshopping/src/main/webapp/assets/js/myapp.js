$(function() {
	switch (menu) {
	case 'About Us':
		$('#aboutNav').addClass('active');
		break;
	case 'Contact Us':
		$('#contactNav').addClass('active');
		break;
	default:
		$('#homeNav').addClass('active');
		break;
	}
});