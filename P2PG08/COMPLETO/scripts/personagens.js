//armazenando os containers dos personagens em uma array e atribuindo o index como id correspondente ao personagem da api;
let persons = new Array();
persons[1] = document.getElementById('luke');
persons[2] = document.getElementById('c3po');
persons[3] = document.getElementById('r2d2');
persons[4] = document.getElementById('darthVader');
persons[10] = document.getElementById('obiwan');
persons[11] = document.getElementById('anakin');
persons[13] = document.getElementById('chewbacca');
persons[14] = document.getElementById('hanSolo');
persons[21] = document.getElementById('palpatine');
persons[20] = document.getElementById('yoda');
persons[25] = document.getElementById('lando');
persons[5] = document.getElementById('leia');

//armazenando o container da imagem do personagem selecionado
let imagemPersonagem = document.getElementById('imgPerson');

//armazenando os caminhos de cada imagem atribuindo index correspondente ao id
let imgPerson = new Array();
imgPerson[1] = "imagens/personagens/luke.JPG";
imgPerson[2] = "imagens/personagens/c3po.JPG";
imgPerson[3] = "imagens/personagens/r2d2.JPG";
imgPerson[4] = "imagens/personagens/darth.JPG";
imgPerson[10] = "imagens/personagens/obiwan.JPG";
imgPerson[11] = "imagens/personagens/anakin.JPG";
imgPerson[13] = "imagens/personagens/chewie.JPG";
imgPerson[14] = "imagens/personagens/hanSolo.JPG";
imgPerson[21] = "imagens/personagens/palpatine.JPG";
imgPerson[20] = "imagens/personagens/yoda.JPG";
imgPerson[25] = "imagens/personagens/lando.JPG";
imgPerson[5] = "imagens/personagens/leia.JPG";

//armazenando os containers onde os valores recebidos serão armazenados
let nome = document.getElementById('nome');
let olhos = document.getElementById('olhos');
let altura = document.getElementById('altura');
let corCabelo = document.getElementById('corCabelo');
let corRoupa = document.getElementById('corRoupa');
let peso = document.getElementById('peso');
let especie = document.getElementById('especie');
let origem = document.getElementById('origem');
let titulo = document.getElementById('titulo');

//função que retorna os dados de acordo com o id do personagem
function getPerson(param) {
    return axios.get('https://swapi.dev/api/people/'+ param + '/');
  }

  //função para url generica
  function getData(url) {
    return axios.get(url);
  }

  //função que armazena as variaveis em seus respectivos containers
  function adicionarDados(index){
      Promise.all([getPerson(index)])
      .then(function (results){
        console.log(results[0]);
        titulo.innerText +='\n' + results[0].data.name;
        nome.innerText +='\n' + results[0].data.name;
    olhos.innerText +='\n' +  results[0].data.eye_color;
    altura.innerText +='\n' +  results[0].data.height + ' cm';
    corCabelo.innerText +='\n' +  results[0].data.hair_color;
    corRoupa.innerText +='\n' +  results[0].data.skin_color;
    peso.innerText +='\n' +  results[0].data.mass + ' kg';
    Promise.all([getData(results[0].data.homeworld)]).then(function(res){
      origem.innerText +='\n' +  res[0].data.name;
      return imagemPersonagem.setAttribute('src', imgPerson[index]);
      });
    });
  }

  //função que remove as variaveis anteriores
  let limpaDados = function(){
    titulo.innerText = "";
        nome.innerText = "NOME: ";
    olhos.innerText = "COR DOS OLHOS: ";
    altura.innerText = "ALTURA: ";
    corCabelo.innerText = "COR DO CABELO: ";
    corRoupa.innerText = "COR DA ROUPA: ";
    peso.innerText = "PESO: ";
      origem.innerText = "PLANETA DE ORIGEM: ";
  }

  //adiciona listener pra chamar a função quando determinado elemento por clicado
  let adicionarEvent = function(item, i, arr){
if(item!=null && item!=undefined)
{
  item.addEventListener('click', function(){
    limpaDados();
    $('#myModal').modal('toggle');  
      adicionarDados(persons.indexOf(item));
    });}
  }

  //adiciona o evento acima em cada personagem
persons.forEach(adicionarEvent);