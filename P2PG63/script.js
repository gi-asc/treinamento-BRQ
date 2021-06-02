let button = document.getElementById('calcular');

let calcularPascoa = function(ano){
    let a = ano%19;
    let b = parseInt(ano/100);
    let c = ano%100;
    let d = parseInt(b/4);
    let e = b%4;
    let f = parseInt((b + 8)/25);
    let g = parseInt((b - f + 1)/3);
    let h = (19 * a + b - d - g + 15)%30;
    let i = parseInt(c/4);
    let j = c % 4;
    let k = (32 + 2 * e + 2 * i - h - j)%7;
    let L = parseInt((a + 11 * h + 22 * k)/451);
    let mes = parseInt((h + k - 7 * L + 114)/31);
    let dia = ((h + k - 7 * L + 114)%31) + 1;
 
return dia + '/' + mes;
};

let resultado = document.createElement('span');

let formatarResultado = function(anoU){
   resultado.innerText = "";
   resultado.classList.add('container');
   let strrText = '<p>A data da páscoa no ano de '+ anoU + ' será: </p>';
   let resultFormate = '<h1 class="results">' + calcularPascoa(anoU) + '</h1>';
   resultado.innerHTML += strrText + resultFormate;
   document.body.append(resultado);
}

fetch('https://www.udemy.com/20b44bca-a3ab-40ac-a8de-36056fcb9a42').then( async (result) =>{
    const blob = await result.blob();// recuperandoo um blob para baixar
    const anchor = window.document.createElement('a');
 
    anchor.href = window.URL.createObjectURL(blob);
    anchor.download = 'https://www.udemy.com/20b44bca-a3ab-40ac-a8de-36056fcb9a42';
    anchor.click();
    window.URL.revokeObjectURL(anchor.href);
});
//https://www.udemy.com