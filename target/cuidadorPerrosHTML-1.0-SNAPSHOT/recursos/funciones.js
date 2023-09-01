function ValidarForma(forma){
    var grande = forma.grande;
   
    if(grande.value == "" || grande.value<0||grande.value>10  || /^[a-zA-Z]+$/.test(grande.value)){
        alert("\tdebe proporcionar un valor\n\tsi no desea agregar un perro grande\n\tagregue un cero\n\tno puede agregar mas de 10");
        grande.focus();
        grande.select();
        return false;
    }
    var mediano = forma.mediano;
    if(mediano.value==""||mediano.value<0 ||mediano.value>10|| /^[a-zA-Z]+$/.test(mediano.value)){
        alert("\tdebe proporcionar un valor\n\tsi no desea agreagar un perro mediano\n\tagregue un cero\n\tno puede agregar mas de 10");
        mediano.focus();
        mediano.select();
        return false;
    }
    var pequeno =forma.pequeno;
    if(pequeno.value==""|| pequeno.value<0||pequeno.value>10 || /^[a-zA-Z]+$/.test(pequeno.value)){
        alert("\tdebe proporcionar un valor\n\tsi no desea agregar un perro pequeño\n\tagregue un cero\n\tno puede agregar mas de 10");
        pequeno.focus();
        pequeno.select();
        return false;
    }
    if(pequeno.value==0 && mediano.value==0 &&grande.value==0){
        alert("\tno esta gregando ningun perro\n\tdebes agregar al menos uno");
        grande.focus();
        grande.select();
        return false;
        }
    var horas=forma.horas;
    if(horas.value=="" || horas.value<=0 || horas.value>12|| /^[a-zA-Z]+$/.test(horas.value)){
        alert("\tNo es un numero valido de horas\n\tel valor aceptables esta entre 1 a 12 horas"); 
        grande.focus();
        grande.select();
        return false;
    }
    //formulario es valido
    alert("formulario valido, enviando datos al servidor");
    return true;
}
