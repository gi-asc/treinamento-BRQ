let numVoos = new Array();

function aleatoryNumber(max, min){
return parseInt(Math.random()*(max-min) + min);
}

function totalPassageiros(){
    let voo = new Array();
let numTotal = aleatoryNumber(80, 101);
let i = 0;
while(i<numTotal){
    voo[i] = ['vazio'];
    i++;
}
return voo;
};

let adicionarOptions = function(num){
    let addOpt = document.createElement('option');
    addOpt.setAttribute('name', 'vooUs');
    addOpt.value = num;
    addOpt.className = 'form-control';
    addOpt.innerText = 'Voo ' + (num+1);
    document.getElementById('vooUser').append(addOpt);
  };

let count = 0;
while(count<37){
    numVoos[count] = totalPassageiros();
    adicionarOptions(count);
    count++;
};

let confereDisponibilidade = function(vooEscolhido){
for(let i=0; i<vooEscolhido.length; i++){
    if(vooEscolhido[i].indexOf('vazio')>=0){
        console.log(vooEscolhido);
        return true;
    }
}

return false;
};

let semDisponibilidade = function(voo){
    alert('Infelizmente não temos lugares vagos no voo ' + voo + '.Por favor, escolha outro voo!')
}

let confirmarReserva = function(rg, lugar){
    let sucesso = document.createElement('h1');
    let dados1 = document.createElement('p');
    let dados2 = document.createElement('p');

    dados1.innerText = 'RG: ' + rg;
    dados2.innerText = 'seu assento: ' + lugar;
    sucesso.className = 'display-3 text-success';
    sucesso.innerText = 'Sua reserva foi realizada com sucesso!';

    let confirmarOk = document.createElement('div');
    confirmarOk.className = 'container';
    confirmarOk.id = 'confirmando';
    confirmarOk.append(sucesso);
    confirmarOk.append(dados1);
    confirmarOk.append(dados2);

    document.body.append(confirmarOk);

}

let buscarRG = function(rg, voo){
    for(let i=0; i<voo.length; i++){
            if(voo[i].indexOf(rg)>=0){
                return false;
            }
        }
        return true;
    }

let reservaPassagem = function(vooPassageiro, RG){
    let passageiroLugar = aleatoryNumber(numVoos[vooPassageiro].length, 0);
    let vootest = buscarRG(RG, numVoos[vooPassageiro]);
    if(!vootest){
        alert('RG já cadastrado neste voo.');
        return;
    }
    if(confereDisponibilidade(numVoos[vooPassageiro])){
        console.log(vooPassageiro);
        console.log(numVoos[vooPassageiro][passageiroLugar][0]);
        if(numVoos[vooPassageiro][passageiroLugar] == 'vazio'){
            confirmarReserva(RG, passageiroLugar);
            numVoos[vooPassageiro][passageiroLugar] = [passageiroLugar, RG];
            return numVoos[vooPassageiro][passageiroLugar];
        }
        
    } else {
        console.log(passageiroLugar);
        semDisponibilidade(vooPassageiro);
    }
}

let validarRG = function(rg){
    let strrRG = /[0-9]{5}/;
    if(strrRG.test(rg)){
        return true;
    }
    return false;
};

let validarVoo = function(num){
    if(num){
        return true;
    }
    return false;
}

let evt = function(numero, rg){
    if(validarRG(rg) && validarVoo(numero)){
reservaPassagem(numero, rg);
    }else{
        alert('Por favor, insira dados validos!');
    }
}

let botao = document.getElementById('calcular');

botao.addEventListener('click', function(){
    let confirmDiv = document.getElementById('confirmando');
    if(confirmDiv!=null){
        confirmDiv.remove();
    }
    let rg = document.getElementById('idUser').value;
    let select = document.getElementById("vooUser");
    let opcaoValor = select.options[select.selectedIndex].value;
    console.log(opcaoValor);
    evt(opcaoValor, rg);
});