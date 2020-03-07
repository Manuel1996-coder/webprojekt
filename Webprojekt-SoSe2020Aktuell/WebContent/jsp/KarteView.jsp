<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Standort | lazyNerds</title>
</head>
<head> 
    <meta charset="utf-8"/> 
    <title>HTML5 Geolocation Beispiel mit Hilfe von Google Maps</title>
    
    <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
</head>

<body>
    <div id="pos" style="width:800px; height:600px;">
        Deine Position wird ermittelt...
    </div>
    
    <script>
        function initialize(coords) {
            var latlng = new google.maps.LatLng(coords.latitude, coords.longitude);
            var myOptions = {
                zoom: 8,
                center: latlng,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            };
            var map = new google.maps.Map(document.getElementById("pos"), myOptions);
            
            var marker = new google.maps.Marker({
                position: latlng, 
                map: map, 
                title: "Hier bist du :)"
            }); 
        }
  
        navigator.geolocation.getCurrentPosition(function(position){ 
            initialize(position.coords);
        }, function(){
            document.getElementById('pos').innerHTML = 'Deine Position konnte leider nicht ermittelt werden';
        });
    </script>
    
    
    
    <iframe
  width="600"
  height="450"
  frameborder="0" style="border:0"
  src="https://www.google.com/maps/embed/v1/place?key=AIzaSyBy4Kq7bnPbi8mPlM33mKvDkxTO7m8fbqE
    &q=Space+Needle,Seattle+WA" allowfullscreen>
</iframe>
</body>
</html>