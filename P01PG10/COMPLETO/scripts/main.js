//configuração do carousel
let owl =  $('.owl-carousel').owlCarousel({
    items:1,
    margin:10,
});

//Armazenando os elementos do carousel
let titulo = document.getElementById('titulo');
let primeiro = document.getElementById('firstEstrofe');
let segundo = document.getElementById('secEstrofe');
let terceiro = document.getElementById('thirdEstrofe');
let quarto = document.getElementById('fourEstrofe');
let autor = document.getElementById('autor');

let partesPoema = new Array (titulo, primeiro, segundo, terceiro, quarto, autor);

//Definindo as strings para cada parte do texto usando ! como separador
let conteudo = new Array();
conteudo[0] = "L!Á!Z!A!R!O";
conteudo[1] = "Ó! L!á!z!a!r!o!,! p!o!r! q!u!e! t!e! l!e!v!a!n!t!a!s!t!e!s!?\nN!ã!o! j!á! t!i!n!h!a! c!h!e!g!a!d!a! a! t!u!a! h!o!r!a!?\nP!r!a! q!u!e! r!e!t!o!r!n!a!r! a!g!o!r!a!?!\nS!e! f!o!s!s!e! e!u! n!ã!o! v!i!n!h!a!\nT!i!n!h!a! f!i!c!a!d!o n!a m!i!n!h!a!";
conteudo[2] = "Ó! L!á!z!a!r!o!,! p!o!r! q!u!e! t!e! l!e!v!a!n!t!a!s!t!e!s!?!\nS!ó! p!o!r!q!u!e! t!e! c!h!a!m!o!u! o! c!a!r!p!i!n!t!e!i!r!o!,! e!n!t!ã!o!?!\nE!l!e! s!ó! q!u!e!r! a!p!a!r!e!c!e!r!,! v!o!c!ê! n!ã!o!\nI!n!v!a!d!i!u! o! s!e!u! d!e!s!c!a!n!s!o! e!m!\nV!o!c!ê! p!o!d!e! a!t!é! a!c!h!a!r b!o!m!,! e!u n!ã!o!";
conteudo[3] = "Ó! L!á!z!a!r!o!,! p!o!r! q!u!e! t!e! l!e!v!a!n!t!a!s!t!e!s!?!\nE!s!t!a!i!s! l!e!p!r!o!s!o!,! \nE!s!t!a!i!s! m!a!g!r!e!l!o!,! f!e!i!o!s!o!\nJ!á! f!e!z! o! q!u!e! t!i!n!h!a!s! q!u!e! f!a!z!e!r!\nA!g!o!r!a! d!o!r!m!i!r! é! t!e!u! l!a!z!e!r!\nE! v!e!m! e!s!s!a! g!e!n!t!e! q!u!e!r!e!r! t!e! m!e!x!e!r!?!\nF!i!c!a!s!s!e! q!u!i!e!t!o!,! e!l!e!s! n!ã!o! i!a!m! t!e! e!n!c!h!e!r!";
conteudo[4] = "Ó! L!á!z!a!r!o!,! p!o!r! q!u!e! t!e! l!e!v!a!n!t!a!s!t!e!s!?!\nS!e! f!o!s!s!e! e!u!,! n!ã!o! v!i!n!h!a!";
conteudo[5] = "A!u!t!o!r!:! P!a!u!l!o! S!e!r!g!i!o! S!i!l!v!a! R!o!d!r!i!g!u!e!s!";

//função que dá o efeito de digitação e passa para o proximo elemento automaticamente
let digitarTexto = function(el, texto, interval){
    let char = texto.split("!").reverse();
    let typer = setInterval(function(){
        if(!char.length){
            owl.trigger('next.owl.carousel');
          clearInterval(typer);
          if(texto == conteudo[5]){
              return;
          }
          alterarTexto();
        }
        let next = char.pop();
        el.innerText += next;
    }, interval);

}

//funçao que define os parametros para a alteração correta dos textos
let alterarTexto = function(){
    for(let j = 0; j<conteudo.length; j++){
        partesPoema[j].innerText = "";
    }

    let todosItens = document.getElementsByClassName('owl-item');
let itemAtual = document.getElementsByClassName('owl-item active');
    for(let i=0; i<partesPoema.length; i++){
        if(partesPoema[i] == itemAtual[0].children[0]){
            if(i==5){
                digitarTexto(partesPoema[i], conteudo[i], 180);
                break;
            }else{
            digitarTexto(partesPoema[i], conteudo[i], 180);
        }
    }else{
            continue;
        }
        
    }
}

//chama a função quando a pagina é carregada
window.addEventListener('load', function(){
    document.getElementsByClassName('owl-dots')[0].remove();
    alterarTexto();
}

);