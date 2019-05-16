$(document).ready(function(){ // takes two function for mouseenter and mouseleave
	    $("img-item").hover(function(){
	        $(this).addClass("highlight"); //adds a class
	    }, function(){
	        $(this).removeClass("highlight"); //removes 
        });
	 });