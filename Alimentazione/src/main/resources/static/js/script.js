/**
 * 
 */

const SX = document.getElementById('sinistra');
const DX = document.getElementById('destra');

var lista = '<ul>';
var tabella = '<table>';

const URL = 'http://localhost:9022/api';
const URL_CATEGORIE = URL + '/categories';

var categorie = fetch(URL_CATEGORIE)

    .then(function (params) {
        return params.json();
    })
    .then(function (params) {
        params.forEach(element => {
            lista += '<li> <a href=# onclick="getCat(\'' + element + '\')">' + element + '</a></li>';
            console.log(element);
        })
        SX.innerHTML = lista + '</ul>';
    });

function getCat(cat) {
    tabella = '<table>'; 
    fetch(URL_CATEGORIE + '/' + cat)
        .then(function (params) {
            return params.json();
        })
        .then(function (params) {
            params.forEach(element => {
             tabella += '<tr> <td><a href=# onclick="getProd(' + element.id + ')">' + element.prodotto + '</a></td><td>' + element.energia + '</td> </tr>';
                console.log(element);
            })
            DX.innerHTML = tabella + '</table>';
        });
}

function getProd(prod) {
    console.log(prod);
    tabella = '<table>'; 
    fetch(URL + '/products/' + prod)
        .then(function (params) {
            return params.json();
        })
        .then(function (params) {

            console.log(params);
                // params.forEach(element => {
            for (const element in params) {
               
                tabella += '<tr><td>' +element+": "+ params[element] + '</td></tr>';
            }
            //     console.log(element);
            // })
            DX.innerHTML = tabella + '</table>';
        });
}