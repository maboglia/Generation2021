var xhr = new XMLHttpRequest();
const URL = "http://localhost:9022/api";
const out = document.getElementById("output");
var testo = '';

xhr.onreadystatechange = function () {


    if ( xhr.readyState==4 && xhr.status==200 ) {

        let str = xhr.responseText;
		let obj = JSON.parse(str);
        
        for (let alimento of obj) {
            //console.log(alimento);
            testo += '<li>'+alimento.prodotto+'</li>';
        }
        out.innerHTML = testo;
    }


}


xhr.open("GET", URL);
xhr.send();





console.log(xhr);