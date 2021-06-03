let negrito = document.getElementById('negrito');
let italico = document.getElementById('italico');
let sublinhado = document.getElementById('sublinhado');
let pequeno = document.getElementById('pequeno');
let riscado = document.getElementById('riscado');

let escrito = document.getElementById('nomeUser');
let user = document.getElementById('nome');

let escolha = new Array(negrito, italico, sublinhado, pequeno, riscado)
let abreTag = new Array('<b>', '<i>', '<u>', '<small>', '<s>');
let fechaTag = new Array('</b>', '</i>', '</u>', '</small>', '</s>');

user.addEventListener('keyup', function(){
    document.getElementById('nomeUser').innerText = user.value;
});

let editarNome = function(item, index){
    item.addEventListener('click', function(){
        escrito.style.opacity=1;
        escrito.innerHTML = abreTag[index] + user.value + fechaTag[index];
    })
};
escolha.forEach(editarNome);