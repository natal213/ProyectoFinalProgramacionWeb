//Actualizar Formación

var tipo2 = document.getElementById("selectTipo2");
var entidad2 = document.getElementById("inputEntidad2");
var detalle2 = document.getElementById("exampleFormControlTextarea2");
var fecha_fin2 = document.getElementById("fechaFin2");
var z_mensaje = document.getElementById("mensaje_2");
var estado_entidad2= false;
var estado_detalle2 = false;
var contador2= false;
var m_error1;
var m_error2;
var m_error3;
var selector2 = false;
var fecha_seleccionada2= false;
var restriccion_ano2 = false;
agregar2.disabled=true;
var cancelar2 = document.getElementById("cancelar2");

/*

cancelar2.onclick=function(){
    tipo2.selectedIndex = null;
    entidad2.value= "";
    detalle2.value= null;
    fecha_fin2.value=null;
    z_mensaje.innerHTML= "";

}
*/

function verificar_campos2(){
    z_mensaje.innerHTML="";
    m_error1=document.createElement("p");
    m_error2=document.createElement("p");
    m_error3=document.createElement("p");


    if(selector2 == false ||  estado_entidad2 == false  || estado_detalle2 == false || contador2 == true || fecha_seleccionada2 == false || restriccion_ano2 == true) {
        agregar2.disabled = true;
        console.log("Boton desabilitado porque una condicion falla");
        if(estado_entidad2 == false || selector2 == false || estado_detalle2 == false || fecha_seleccionada2 ==false){
            m_error1.textContent="Algunos campos se encuentran vacíos";
            console.log("Boton desabilitado porque una condicion esta vacia");
        }if(contador2 == true){
            m_error2.textContent="Usted a llegado al limite máximo de caracteres";
        }if(restriccion_ano2 == true){
            m_error3.textContent="El año seleccionado no es vigente";
        }
    
    }else{
        agregar2.disabled = false;
        
    }
    z_mensaje.appendChild(m_error1);
    z_mensaje.appendChild(m_error2);
    z_mensaje.appendChild(m_error3);
}


entidad2.onchange=function(){
    if(entidad2.value != ""){
        estado_entidad2 = true;
    }else{
        estado_entidad2 = false;
    }
    verificar_campos2();
}


detalle2.onchange=function(){
    if(detalle2.value == ""){
        estado_detalle2 = false;
        contador2 = false;
    }else if(detalle2.value.length >= 250){
        contador2 =true;
    }
    else{
        estado_detalle2 = true;
        contador2 = false; 
    }
    
    verificar_campos2();
}


tipo2.onchange=function(){
    if(tipo2.selectedIndex == null ){
        selector2 = false;
    }else{
        selector2= true;
    }  
    verificar_campos2();
}

fecha_fin2.onchange=function(){
    var x = fecha_fin2.value;
    var date = new Date(x);
    var y = date.getFullYear();

    if(fecha_fin2.value == ""){
        fecha_seleccionada2 = false;
        console.log("no hay ninguna fecha seleccionada");    
    }else if (y <= 2020){
        restriccion_ano2 = false;
        fecha_seleccionada2=true;
        console.log("no hay ninguna restriccion en cuanto a la fecha"); 
    }else{
        fecha_seleccionada2=true;
        restriccion_ano2 = true;
        console.log("La fecha seleccionada esta restringida");
    }
    verificar_campos2();
}
