const URL = "http://localhost:9022/api";
const out = document.getElementById("output");
var testo = '';


fetch(URL)
	.then(function(risposta){
		return risposta.json();
	})
	.then(function(data){

		for (let alimento of data) {
            testo += '<li>'+alimento.prodotto+'</li>';
        }
        out.innerHTML = testo;
	})
