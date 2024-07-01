/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ArchivosAPI.Repository;

import com.ArchivosAPI.Entidad.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author auror
 */
public interface DocumentoRepository  extends JpaRepository<Documento, Long> {
    
}
