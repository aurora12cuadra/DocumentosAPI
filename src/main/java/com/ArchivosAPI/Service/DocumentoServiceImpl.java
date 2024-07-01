/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArchivosAPI.Service;
import com.ArchivosAPI.Entidad.Documento;
import com.ArchivosAPI.Repository.DocumentoRepository;
import java.io.IOException;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public void guardar(MultipartFile archivo) throws IOException {
        Documento documento = new Documento();
        documento.setNombre(archivo.getOriginalFilename());
        documento.setTipo(archivo.getContentType());
        documento.setDatos(archivo.getBytes());
        documento.setFechaSubida(LocalDateTime.now());
        documentoRepository.save(documento);
    }

    @Override
    public Documento obtenerDocumento(Long id) {
        return documentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Documento no encontrado"));
    }
}