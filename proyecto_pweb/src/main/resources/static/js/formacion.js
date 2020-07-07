var tipo = document.getElementById("selectTipo");
var entidad = document.getElementById("inputEntidad");
var detalle = document.getElementById("exampleFormControlTextarea1");
var fecha_fin = document.getElementById("fechaFin");
var zona_mensaje = document.getElementById("mensaje");
var checkbox1 = document.getElementById("defaultCheck1");
var checkbox2 = document.getElementById("defaultCheck2");
var estado_entidad= false;
var estado_detalle = false;
var contador= false;
var mensaje_error1;
var mensaje_error2;
var selector = false;
btnagregar.disabled = true;




function verificar_campos(){
    zona_mensaje.innerHTML="";
    mensaje_error1=document.createElement("p");
    mensaje_error2=document.createElement("p");


    if(estado_detalle == false || estado_entidad == false || selector == false || contador == true){
        btnagregar.disabled = true;
        if(estado_detalle == false || estado_entidad == false || selector == false){
            mensaje_error1.textContent="Algunos campos se encuentran vacíos";
        }if(contador == true){
            mensaje_error2.textContent="Usted a llegado al limite máximo de caracteres";
        }
    
    }else{
        btnagregar.disabled = false;
        
    }
    zona_mensaje.appendChild(mensaje_error1);
    zona_mensaje.appendChild(mensaje_error2);
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
    }else if(detalle.value.length >= 10){
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