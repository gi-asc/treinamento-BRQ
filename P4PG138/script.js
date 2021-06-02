
let calcularNotas = function(salario){
let notas = [0, 0, 0, 0, 0, 0, 0];
notas[0] = parseInt(salario/100);
notas[1] = parseInt((salario - (notas[0]*100))/50);
notas[2] = parseInt((salario - notas[0]*100 - notas[1]*50)/20);
notas[3] = parseInt((salario - notas[0]*100 - notas[1]*50 - notas[2]*20)/10);
notas[4] = parseInt((salario - notas[0]*100 - notas[1]*50 - notas[2]*20 - notas[3]*10)/5);
notas[5] = parseInt((salario - notas[0]*100 - notas[1]*50 - notas[2]*20 - notas[3]*10 - notas[4]*5)/2);
notas[6] - parseInt((salario - notas[0]*100 - notas[1]*50 - notas[2]*20 - notas[3]*10 - notas[4]*5 - notas[5]*2));
return notas;
}

let calcularSalarios = function(horas, salario){
    return salario*horas;
}

let insereDados = function(){
let salarioHora = document.getElementById('horas').value;
let horas = document.getElementById('valorHora').value;

let totalSalario = calcularSalarios(horas, salarioHora);
let notas = calcularNotas(totalSalario);
document.getElementById('not100').innerText+=notas[0];
document.getElementById('not50').innerText+=notas[1];
document.getElementById('not20').innerText+=notas[2];
document.getElementById('not10').innerText+=notas[3];
document.getElementById('not5').innerText+=notas[4];
document.getElementById('not2').innerText+=notas[5];
document.getElementById('moed1').innerText+=notas[6];
document.getElementById('notass').style.display = 'block';
}

document.getElementById('continuar').addEventListener('click', insereDados);