/**
 * 
 */

$.getJSON( "/api", function( data ) {
  var items = [];
  $.each( data, function( key, val ) {
	console.log(val);
    items.push( "<li id='" + key + "'>" + val.prodotto + "</li>" );
  });
 
  $( "<ul/>", {
    "class": "my-new-list",
    html: items.join( "" )
  }).appendTo( "body" );
});

