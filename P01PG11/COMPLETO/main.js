
//array com as classes de cores
let classesColor = new Array();
classesColor[0] = 'success';
classesColor[1] = 'warning';
classesColor[2] = 'primary';
classesColor[3] = 'danger';
classesColor[4] = 'secondary';
classesColor[5] = 'dark';

//selecionando o botão de inicio
let controlador = document.getElementById('control');

//array de ids
let cores = new Array();
cores[0] = 'danger';
cores[1] = 'dark';
cores[2] = 'secondary';
cores[3] = 'primary';
cores[4] = 'success';
cores[5] = 'warning';

//função para gerar cor aleatoria
let classeAleatoria = function(){
    return Math.floor(Math.random() * 6);
}

//função para atribuir a cor de forma aleatoria utilizando a função anterior
let gerarCores = function(){
controlador.className = 'btn text-white btn-' + classesColor[classeAleatoria()];
};

//variavel para armazenar a pontuação
let score = 0;

//função para capturar a cor atual indicada
let corAtual = function(){
    let corIndicada = document.getElementById('control').classList[2].replace('btn-', '');
    return corIndicada;
}

//função para capturar a cor escolhida pelo úsuario
let corClicada = function(i){
   let cor = i.id;
   return cor;
}

//função para adicionar listener para quando o user clicar capturar a cor escolhida e comparar com a cor atual indicada
let adicionarClick = function(item){
    let elemento = document.getElementById(item);
    elemento.addEventListener('click', function(){
        let userChoice = corClicada(this);
        if(userChoice == corAtual()){
            score++;
        }else{
            score--;
        }
        gerarCores();
        return document.getElementById('score').innerText = score;
    });
}

//função para desabilitar clicks quando o jogo não tiver sido iniciado ainda
let removerClick = function(it){
let itens = document.getElementById(it);
itens.setAttribute('disabled', 'disabled');
}

//armazenando elemento de pontuação
let pontos = document.getElementById('pontos');

//armazenando o layout do grid
let centro = document.getElementById('centroGame');

//criando string com tags para posteriormente formatar um botão de reiniciar quando o game acabar
let newGame = '<button type="button" class="btn btn-info text-white" id="reiniciar">JOGAR NOVAMENTE</button>'

//volta para as configurações iniciais depois que o jogo acaba e adiciona botão para jogar de novo, o jogo dura 60 segundos
let temporizadorGame = function(){
    setTimeout(function(){
    let btnReInit = document.createElement('div');
    btnReInit.innerHTML = newGame;
    pontos.append(btnReInit);
    pontos.className = 'score pontFinal';
    centro.className = 'container text-white finalGame';
    controlador.removeAttribute('disabled');
    controlador.innerText = 'iniciar';
    controlador.className = 'btn btn-info text-white';
    cores.forEach(removerClick);
    let reiniciar = function() {
        pontos.className = "score";
        centro.className = "container text-white";
        score = 0;
        document.getElementById('score').innerText = score;
        btnReInit.remove();
    }
    btnReInit.addEventListener('click', reiniciar);
    return btnReInit;
}, 60000);}

//logica para a inicialização do jogo
let iniciarJogo = function(){
    cores.forEach(adicionarClick);
temporizadorGame();
    this.setAttribute('disabled', 'disabled');
    this.innerText = 'COR';
    gerarCores();

}

//chama a função de inicialização do jogo quando o user clica no controlador
controlador.addEventListener('click', iniciarJogo);