//Limitar el area de texto para datos relevantes en 5 lineas
var contenidotextarea="";
var campodatosrelev=document.getElementById("exampleFormControlTextarea1");
campodatosrelev.addEventListener("keypress",function(){
    verificarlineas(this);
},true);

function verificarlineas(obj){
    var contenidolin=obj.value.split("\n");
    var contenidocar=obj.value.length+1;
    var puntofin=((obj.clientWidth-24)/9.5*5.0)+1; 

    if (contenidolin.length>5 || contenidocar>puntofin){
        obj.value=contenidotextarea;
    }
    else{
        contenidotextarea=obj.value;
    }
}

//Activar boton cuando los datos esten completos
//Otras verificaciones
var btnguardar=document.getElementById("btnguardar");
var mensajeactual=document.getElementById("mensaje");
var mensajenuevoincom;
var mensajenuevofallo;
var mensajeincomtexto="Para guardar, por favor complete como mínimo los siguiente: ";
var mensajefallotexto="Para guardar, por favor revise que se cumpla lo siguiente: "
var cajanombre=document.getElementById("inputNombre");
var cajaappat=document.getElementById("inputApellido");
var cajatelefono=document.getElementById("inputTelefono");
var estadot=0;
var estadof=0;
var m1f="";
var m2f="";
var m3f="";
var m1="*Nombre ";
var m2="*Apellido paterno ";
var m3="*Teléfono";

function verificarcampos(){
    mensajeactual.innerHTML="";
    mensajenuevoincom=document.createElement("p");
    mensajenuevofallo=document.createElement("p");
    if (estadof==0 && estadot==3){
        mensajenuevoincom.textContent="";
        mensajenuevofallo.textContent="";
        btnguardar.disabled=false;
        console.log("ya");
    }
    else{
        if(estadot<3){
            mensajenuevoincom.textContent=mensajeincomtexto+m1+m2+m3;
        }
        if (estadof>0){
            if(m1f=="Si"||m2f=="Si"){
                mensajenuevofallo.textContent=mensajefallotexto+"-El nombre y apellido no deben exceder los 100 caracteres "+m3f+m4f;                }
            else{
                mensajenuevofallo.textContent=mensajefallotexto+m1f+m2f+m3f+m4f;
            }
        }
        btnguardar.disabled=true;
    }
    console.log(estadot);
    console.log(estadof);
    mensajeactual.appendChild(mensajenuevoincom);
    mensajeactual.appendChild(mensajenuevofallo);
    }

cajanombre.onchange=function (){
    if (cajanombre.value==""){
        estadot--;
        if(m1==""&&m1f=="Si"){
            estadof--;
        }
        m1="*Nombre ";
        m1f="";
    }
    else if(cajanombre.value.length>100){
        if(m1=="*Nombre" && m1f==""){
            estadot++;
        }
        estadof++;
        m1="";
        m1f="Si";  
    }
    else{
        if(m1=="" && m1f=="Si"){
            estadof--;
        }
        else{
            estadot++;
        }
        m1="";
        m1f="";
    }
    verificarcampos();
} 

cajaappat.onchange=function (){
    if (cajaappat.value==""){
        estadot--;
        if(m2==""&&m2f=="Si"){
            estadof--;
        }
        m2="*Apellido paeterno ";
        m2f="";
    }
    else if(cajaappat.value.length>100){
        if(m2=="*Apellido paterno" && m2f==""){
            estadot++;
        }
        estadof++;
        m2="";
        m2f="Si";  
    }
    else{
        if(m2=="" && m2f=="Si"){
            estadof--;
        }
        else{
            estadot++;
        }
        m2="";
        m2f="";
    }
    verificarcampos();
}

cajatelefono.onchange=function (){
    if (cajatelefono.value==""){
        estadot--;
        if(m3==""&&m3f=="-El teléfono celular debe ser un número de 9 dígitos"){
        estadof--;
        }
        m3="*Teléfono";
        m3f="";
    }
    else if (cajatelefono.value.length!=9 || cajatelefono.value<0){
        if(m3=="*Teléfono" && m3f==""){
            estadot++;
        }
        estadof++;
        m3="";
        m3f="-El teléfono celular debe ser un número de 9 dígitos";   
    }
    else{
        if(m3==""&&m3f=="-El teléfono celular debe ser un número de 9 dígitos"){
            estadof--;
        }
        else{
            estadot++;
        }
        m3="";
        m3f="";
    }
    verificarcampos();
}

//Verificar numero de caracteres
var m4f="";
campodatosrelev.onchange=function(){
conte=campodatosrelev.value;
if(conte.split(" ").length>60){
    estadof++;
    m4f="Los datos relevantes no deben superar las 60 palabras";
}
else{
    if(m4f!=""){
        estadof--;
    }
    m4f="";
}
verificarcampos();    
}
