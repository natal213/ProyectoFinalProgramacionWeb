// Agregar Formación 
var tipo = document.getElementById("selectTipo");
var entidad = document.getElementById("inputEntidad");
var detalle = document.getElementById("exampleFormControlTextarea1");
var fecha_fin = document.getElementById("fechaFin");
var zona_mensaje = document.getElementById("mensaje1");
var estado_entidad= false;
var estado_detalle = false;
var contador= false;
var mensaje_error1;
var mensaje_error2;
var mensaje_error3;
var selector = false;
var fecha_seleccionada= false;
var restriccion_ano = false;
agregar.disabled=true;
var cancelar = document.getElementById("cancelar");


/*
cancelar.onclick=function(){
    tipo.selectedIndex = null;
    entidad.value= "";
    detalle.value= null;
    fecha_fin.value=null;
    zona_mensaje.innerHTML= "";
    console.log("limpio");
}
*/

function verificar_campos(){
    zona_mensaje.innerHTML="";
    mensaje_error1=document.createElement("p");
    mensaje_error2=document.createElement("p");
    mensaje_error3=document.createElement("p");


    if(selector == false ||  estado_entidad == false  || estado_detalle == false || contador == true || fecha_seleccionada == false || restriccion_ano == true) {
        agregar.disabled = true;
        console.log("Boton desabilitado porque una condicion falla");
        if(estado_entidad == false || selector == false || estado_detalle == false || fecha_seleccionada ==false){
            mensaje_error1.textContent="Algunos campos se encuentran vacíos";
            console.log("Boton desabilitado porque una condicion esta vacia");
        }if(contador == true){
            mensaje_error2.textContent="Usted a llegado al limite máximo de caracteres";
        }if(restriccion_ano == true){
            mensaje_error3.textContent="El año seleccionado no es vigente";
        }
    
    }else{
        agregar.disabled = false;
        
    }
    zona_mensaje.appendChild(mensaje_error1);
    zona_mensaje.appendChild(mensaje_error2);
    zona_mensaje.appendChild(mensaje_error3);
}



entidad.onchange=function(){
    if(entidad.value != ""){
        estado_entidad = true;
    }else{
        estado_entidad = false;
    }
    verificar_campos();
}


detalle.onchange=function(){
    if(detalle.value == ""){
        estado_detalle = false;
        contador = false;
    }else if(detalle.value.length >= 250){
        contador =true;
    }
    else{
        estado_detalle = true;
        contador = false; 
    }
    
    verificar_campos();
}


tipo.onchange=function(){
    if(tipo.selectedIndex == null ){
        selector = false;
    }else{
        selector= true;
    }  
    verificar_campos();
}

fecha_fin.onchange=function(){
    var x = fecha_fin.value;
    var date = new Date(x);
    var y = date.getFullYear();

    if(fecha_fin.value == ""){
        fecha_seleccionada = false;
        console.log("no hay ninguna fecha seleccionada");    
    }else if (y <= 2020){
        restriccion_ano = false;
        fecha_seleccionada=true;
        console.log("no hay ninguna restriccion en cuanto a la fecha"); 
    }else{
        fecha_seleccionada=true;
        restriccion_ano = true;
        console.log("La fecha seleccionada esta restringida");
    }
    verificar_campos();
}



