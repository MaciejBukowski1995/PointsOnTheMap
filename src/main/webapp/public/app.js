var map;
function initMap() {

    uluru = {lat: -25.363, lng: 131.044};

    map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: -25.363, lng: 131.044},
    zoom: 2,
    rotateControl: true,
    mapTypeId: 'satellite',
    minZoom: 2
});

$.getJSON( "http://localhost:8080/api/points", function( data) {
    for (let i = 0, len = data._embedded.points.length; i < len; i++) {
        marker = new google.maps.Marker({
            position: {lat: data._embedded.points[i].altitude, lng: data._embedded.points[i].longitude},
            map: map,
            title: data._embedded.points[i].name
            });
        }
    });
}


