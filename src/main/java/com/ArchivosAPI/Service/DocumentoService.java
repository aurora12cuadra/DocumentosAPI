/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ArchivosAPI.Service;

import com.ArchivosAPI.Entidad.Documento;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author auror
 */
public interface DocumentoService {
    
    void guardar(MultipartFile archivo) throws IOException;

    Documento obtenerDocumento(Long id);
}
