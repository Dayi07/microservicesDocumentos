package com.sena.microservicesMarilyn.Controller;

import com.sena.microservicesMarilyn.entidades.Documento;
import com.sena.microservicesMarilyn.servicio.DocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Documentos") //ApiRest/Documentos
public class DocumentoController {

    @Autowired
    private DocumentoServicio documentoServicio;

    @GetMapping("/listar")
    List<Documento> consultar(){
        return documentoServicio.consultarTodos();
    }

    @PostMapping("/guardar")
    public Documento agregarDoc(@RequestBody Documento documento){
        return documentoServicio.agregarDoc(documento);
    }

    @PostMapping("/guardar2")
    public Documento agregarDoc(@RequestParam Integer codigo_documento, @RequestParam Integer usuarioID, @RequestParam Timestamp Fecha_Hora_entrega, @RequestParam String Tipo_documento, @RequestParam String Estado_documento, @RequestParam String Archivo){
        Documento documento = new Documento();
        documento.setCodigo_documento(codigo_documento);
        documento.setUsuarioID(usuarioID);
        documento.setFecha_Hora_entrega(Fecha_Hora_entrega);
        documento.setTipo_documento(Tipo_documento);
        documento.setEstado_documento(Estado_documento);
        documento.setArchivo(Archivo);

        return documentoServicio.agregarDoc(documento);
    }

    @DeleteMapping("{id}")
    public String eliminarDocumento(@PathVariable("id") int id){
        boolean ok = this.documentoServicio.eliminarDocumento(id);
        if (ok){
            return "Se elimino el usuario con id: " + id;
        }else{
            return "No se pudo eliminar el usuario con el id: " + id;
        }
    }

    @PostMapping("/actualizar")
    public Documento actualizar(@RequestBody Documento documento){
        return documentoServicio.actualizar(documento);
    }


}
