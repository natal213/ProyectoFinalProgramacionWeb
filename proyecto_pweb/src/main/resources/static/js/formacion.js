var estadosAgregar ={
    tipo: false,
    entidad: false,
    detalle: false,
    fecha: false
}

var estadosActualizar ={
    tipo: true,
    entidad: true,
    detalle: true,
    fecha: true
}

$(".selectFormacion").on('change',function(){
    $(this).removeClass("is-invalid");
    $(this).addClass("is-valid");

    if(this.dataset.modal=="agregar"){
        estadosAgregar[this.dataset.campo]=true
    }else{
        estadosActualizar[this.dataset.campo]=true
    }

    if(validarTodo(this.dataset.modal)){
        $("#btnAgregar").removeAttr("disabled");
    }else{
        $("#btnAgregar").attr("disabled",true);
    }
});

$(".selectFormacion").on('blur',function(){
    if(this.value=="Seleccione Tipo..."||this.value=="Seleccione Entidad..."){
        $(this).removeClass("is-valid");
        $(this).addClass("is-invalid");
    }
});



$(".inputDetalle").on('blur',function(){
    if(this.value==""){
        $(this).removeClass("is-valid");
        $(this).addClass("is-invalid")
        if(this.dataset.modal=="agregar"){
            estadosAgregar.detalle=false;
        }else{
            estadosActualizar.detalle=false;
        }
    }else{
        $(this).removeClass("is-invalid");
        $(this).addClass("is-valid");
        if(this.dataset.modal=="agregar"){
            estadosAgregar.detalle=true;
        }else{
            estadosActualizar.detalle=true;
        }
    }

    if(validarTodo(this.dataset.modal)){
        $("#btnAgregar").removeAttr("disabled");
    }else{
        $("#btnAgregar").attr("disabled",true);
    }
});

$(".inputFecha").on('change',function (){
    if(this.value==""){
        $(this).removeClass("is-valid");
        $(this).addClass("is-invalid")
        if(this.dataset.modal=="agregar"){
            estadosAgregar.fecha=false;
        }else{
            estadosActualizar.fecha=false;
        }
    }else{
        $(this).removeClass("is-invalid");
        $(this).addClass("is-valid")
        if(this.dataset.modal=="agregar"){
            estadosAgregar.fecha=true;
        }else{
            estadosActualizar.fecha=true;
        }
    }

    if(validarTodo(this.dataset.modal)){
        $("#btnAgregar").removeAttr("disabled");
    }else{
        $("#btnAgregar").attr("disabled",true);
    }
});

$(".inputFecha").on('blur',function (){
    if(this.value==""){
        $(this).removeClass("is-valid");
        $(this).addClass("is-invalid")
        if(this.dataset.modal=="agregar"){
            estadosAgregar.fecha=false;
        }else{
            estadosActualizar.fecha=false;
        }
    }
});

function validarTodo(modal){
    if(modal=="agregar"){
        const valores=Object.values(estadosAgregar);
        for(valor of valores){
            if(!valor) return false;
        }
        return true
    }else{
        const valores=Object.values(estadosActualizar);
        for(valor of valores){
            if(!valor) return false;
        }
        return true
    }
}