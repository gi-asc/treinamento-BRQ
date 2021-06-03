let strTittle = "INACREDITÁVEL";
let containerTittle = document.getElementById('titulo_animado');
let letrasSoltas = strTittle.split('');

let criarSpan = function(item){
    let novo = document.createElement('span');
    novo.classList.add('letrasSoltas');
    Math.random() > 0.5 && novo.classList.add("rev");

    let random = (min, max) => {
        return Math.random() * (max - min) + min;
      };
      
      novo.style.animationDelay = `${random(0.1, 0.8)}s`;
      novo.style.animationDuration = `${random(0.4, 1.4)}s`;
    novo.textContent = item;

    containerTittle.appendChild(novo);
};

letrasSoltas.forEach(criarSpan);

let primeiroPequeno = document.getElementById('pequeno_first');
let segundoPequeno = document.getElementById('pequeno_second');
let terceiroPequeno = document.getElementById('pequeno_third');

let urlVideos = new Array();

urlVideos[0] = 'https://www.youtube.com/embed/TkQovjpcT2g?list=PLFo8c1sV7-NHQzPUw0AJcodTMasgnGqgr';
urlVideos[1] = 'https://www.youtube.com/embed/UBKH_468xk0?list=PLFo8c1sV7-NHQzPUw0AJcodTMasgnGqgr';
urlVideos[2] = 'https://www.youtube.com/embed/wgOE5Cso2bk?list=PLFo8c1sV7-NHQzPUw0AJcodTMasgnGqgr';

let videosPequenos = new Array(primeiroPequeno, segundoPequeno, terceiroPequeno);

let trocarVideos = function(url){
  let videoGrande = document.getElementById('videoGrande');
  videoGrande.src = url;
}

let adicionarEventoClick = function(item, index){
 item.onclick = function(){
  trocarVideos(urlVideos[index])
 };
}

videosPequenos.forEach(adicionarEventoClick);
$('.carousel').carousel();

let audio = new Audio('audio_torcida.mp3');
window.addEventListener('scroll', function() {
  let scrollTop = $(window).scrollTop();
let elementOffset = $(".depo").offset().top;
let distance = (elementOffset - scrollTop);
  if(distance<=10){
      audio.play(); 
  }
});


let nome = document.getElementById('nome');
let email = document.getElementById('email');
let senha = document.getElementById('senha');
let repeteSenha = document.getElementById('repeteSenha');
let botao = document.getElementById('enviar');


let elementosArray = new Array;
elementosArray[0] = nome;
elementosArray[1] = email;
elementosArray[2] = senha;
elementosArray[3] = repeteSenha;

let tudoValido = function(){
    let cont=0;
    for(let i=0; i<elementosArray.length; i++){
if(!(elementosArray[i].classList.contains('valido'))){
    cont++;
}
    }
    if(cont == 0){
        botao.removeAttribute('disabled');
    }
}
let expAtual;
let expReg = function(exp){
expAtual = new RegExp(exp);
return expAtual;
}
let expsArray = new Array();
expsArray[0] = function(){return /^(([a-z]{4,10}){1}\s+[a-z]+)+/i;};
expsArray[1] = function(){return /^[\w\.-_\+]+@[\w-]+(\.\w{2,4})+$/};
expsArray[2] = function(){return /^(?=.*[a-z])(?=.*[0-9])[a-z0-9]{6,8}$/i};
expsArray[3] = function(){
    let senhaAtual = "^" + document.getElementById('senha').value + "$";
    let expRep = new RegExp(senhaAtual);
return expRep;
}

let textosArray = new Array();
textosArray[0] = 'Nome inválido! o nome deve conter somente letras, ao menos 1 sobrenome, e no máximo 3.';
textosArray[1] = 'Formato inválido de email!';
textosArray[2] = 'Senha inválida! Por favor, siga o padrão indicado!';
textosArray[3] = 'As senhas não coincidem!';

let validarCampo = function(item, index, art){
    let textoAtual = textosArray[index];
    let idAtual = String('campo'+index);
    let spanAviso = document.createElement('span');
spanAviso.setAttribute('id', idAtual);
spanAviso.innerText = textoAtual;
    let pai = item.parentElement;

item.addEventListener('blur', function(){
    let expression = expsArray[index]();
    let filhos = Array.from(pai.children);
    if(expression.test(this.value)){
        if(this.classList.contains('invalido')){
            this.classList.remove('invalido')
        }
        this.classList.add('valido');
        if(filhos.includes(document.getElementById(idAtual))){
            document.getElementById(idAtual).remove();
        }
    }else{
        if(this.classList.contains('valido')){
            this.classList.remove('valido')
        }
        this.classList.add('invalido');
        if(!(filhos.includes(document.getElementById(idAtual)))){
            pai.appendChild(spanAviso);
        }
    }
 return tudoValido();
})
}
elementosArray.forEach(validarCampo);
botao.addEventListener('click', function(){
  return document.getElementById('socio').innerHTML = '<p class="display-5 descript text-success">Cadastro iniciado com sucesso! Você receberá um e-mail de confirmação para prosseguir!</p>'
})