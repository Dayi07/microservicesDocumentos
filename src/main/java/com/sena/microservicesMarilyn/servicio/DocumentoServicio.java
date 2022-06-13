package com.sena.microservicesMarilyn.servicio;

import com.sena.microservicesMarilyn.entidades.Documento;
import com.sena.microservicesMarilyn.repositorio.DocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoServicio {
    @Autowired
    private DocumentoRepositorio documentoRepositorio;

    public Documento agregarDoc(Documento documento){
        System.out.println(documento.toString());
        return documentoRepositorio.save(documento);
    }

    public boolean eliminarDocumento(int codigo_documento){
        try {
            documentoRepositorio.deleteById(codigo_documento);
            return true;
        }catch (Exception err){
            System.out.println("error "+err);
            return false;
        }
    }

    public List<Documento> consultarTodos(){
        return documentoRepositorio.findAll();
    }

    public Documento actualizar(Documento documento){
        return documentoRepositorio.save(documento);
    }


}

