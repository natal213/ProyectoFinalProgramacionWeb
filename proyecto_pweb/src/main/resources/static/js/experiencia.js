var ocupacion=false;
var entidad=false;
var logro=false;
var fecha=false;
var admin=true;

$(document).ready(function() {

    if(admin){
        $("#usuarios").removeAttr("hidden");
    }

    $("#logroTexto").on('keyup', function() {
        var words = 0;
        if(this.value!==""){
        var words = this.value.match(/\S+/g).length;
        }
        if (words > 30) {
            // Split the string on first 200 words and rejoin on spaces
            var trimmed = $(this).val().split(/\s+/, 30).join(" ");
            // Add a space at the end to keep new typing making new words
            $(this).val(trimmed + " ");
        }
        else {
            $('#palabrasRestantes').text(30-words);            
        }
    });

    $("#logroTextoA").on('keyup', function() {
        var words = 0;
        if(this.value!==""){
        var words = this.value.match(/\S+/g).length;
        }
        if (words > 30) {
            // Split the string on first 30 words and rejoin on spaces
            var trimmed = $(this).val().split(/\s+/, 30).join(" ");
            // Add a space at the end to keep new typing making new words
            $(this).val(trimmed + " ");
        }
        else {
            $('#palabrasRestantesA').text(30-words);            
        }
    });


    $(".inputExperiencia").on('blur',function(){
        if(!this.value==""){
            $(this).removeClass("is-invalid");
            $(this).addClass("is-valid")
        }else{
            $(this).removeClass("is-valid");
            $(this).addClass("is-invalid")
        }
    
        // if(validarTodo()){
        //     $("#btnAgregar").removeAttr("disabled");
        // }else{
        //     $("#btnAgregar").attr("disabled",true)
        // }
    });

    $("#selectEntidad").on('change',function(){
        entidad=true;
    });

    $('#agregarModal').on('hidden.bs.modal', function (e) {
        $('#formularioAgregar')[0].reset();
        $("#inputNombre").removeClass("is-valid");
        $("#inputNombre").removeClass("is-invalid");
    });
 }); 

 function validacionGlobal(){
     if(!ocupacion) return false;
     if(!entidad) return false;
     if(!logro) return false
     if(!fecha) return false;
     return true;
 }