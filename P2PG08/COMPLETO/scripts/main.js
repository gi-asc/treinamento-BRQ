//função que gera uma animação para a logo descer suavemente
let descerLogo = function(){
    let logoSW = document.getElementById('logoSW');
    let direct = document.getElementById('direction');
    let opacidade = 0;
    let margemTopo = -85;
 let anime = setInterval(animando, 5);
function animando(){
    if(margemTopo==15){
        clearInterval(anime);
    }else{
        margemTopo++;
        logoSW.style.marginTop= margemTopo + "%";
    }

}

//aumentar suavemente a opacidade do menu para o tempo 
let opacidadeTotal = setInterval(aumentarOpacidade, 5);

function aumentarOpacidade(){
if(opacidade==1){
    clearInterval(opacidadeTotal);
}else{
    opacidade = opacidade + 0.007;
    direct.style.opacity = opacidade;
}
}
}

//chamar as funçoes quando a pagina carregar
window.addEventListener('load', descerLogo);