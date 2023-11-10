document.addEventListener('DOMContentLoaded', function() {
const menuEntrada = document.getElementById('menuEntrada');
const entrada = document.getElementById('entradas')
const rodaEntrada = document.getElementById('rodaEntrada')

menuEntrada.addEventListener('click', function() {
    entrada.scrollIntoView({ behavior: 'smooth' });
});

rodaEntrada.addEventListener('click', function() {
    entrada.scrollIntoView({ behavior: 'smooth' });
});


const menuPrincipal = document.getElementById('menuPrincipal');
const pratoPrinciapal = document.getElementById('pratoPrinciapal')
const rodaPrincipal = document.getElementById('rodaPrincipal');

menuPrincipal.addEventListener('click', function() {
    pratoPrinciapal.scrollIntoView({ behavior: 'smooth' });
});

rodaPrincipal.addEventListener('click', function() {
    pratoPrinciapal.scrollIntoView({ behavior: 'smooth' });
});


const menuSobremesa = document.getElementById('menuSobremesa');
const tituloSobremesa = document.getElementById('tituloSobremesa')
const rodaSobremesa = document.getElementById('rodaSobremesa');

menuSobremesa.addEventListener('click', function() {
    tituloSobremesa.scrollIntoView({ behavior: 'smooth' });
});

rodaSobremesa.addEventListener('click', function() {
    tituloSobremesa.scrollIntoView({ behavior: 'smooth' });
});

//          ------------------------------------------------------

document.getElementById("botao").addEventListener("click", function() {
const pratosEntrada = document.getElementById('pratosEntrada');
const pratosPrinciapal = document.getElementById('pratosPrinciapal');
const pratosSobremasa = document.getElementById('pratosSobremasa');
let entrada;
let principal;
let sobremesa;

switch(pratosEntrada.value){
    case 'Berinjela':
        entrada = 'imagens/entradas/berinjela-molho-tahine.jpg';
            break;
    case 'Bruschetta':
        entrada = 'imagens/entradas/bruschetta-de-salmao.jpg';
            break;       
    case 'Tabua':
        entrada = 'imagens/entradas/tabua-de-queijos.jpg';
            break;
}

switch(pratosPrinciapal.value){
    case 'bacalhau':
        principal = 'imagens/principal/bacalhau.jpg';
            break;
    case 'Bobo':
        principal = 'imagens/principal/bobo-de-camarao.jpg';
            break;
    case 'camarao':
        principal = 'imagens/principal/camarao-atlantico.jpg';
            break;
    case 'combinado':
        principal = 'imagens/principal/combinado-sushi.jpg';
            break;
    case 'salmon':
        principal = 'imagens/principal/ultimate-salmon.jpg';
            break;
}

switch(pratosSobremasa.value){
    case 'Morango':
        sobremesa = 'imagens/sobremesa/moranguinho-com-creme.jpg';
            break;
    case 'pessego':
        sobremesa = 'imagens/sobremesa/taca-cremosa-de-pessego.jpg';
            break;       
    case 'Torta':
        sobremesa = 'imagens/sobremesa/torta-maca-caramelizada.jpg';
            break;
}

window.location.href = `pedido.html?entrada=${entrada}&principal=${principal}&sobremesa=${sobremesa}`;
    });
});