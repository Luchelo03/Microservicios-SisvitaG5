/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sm.dsw.ms.estudiante.service;


import java.util.List;
import sm.dsw.ms.estudiante.model.Estudiante;

/**
 *
 * @author Fabrizio
 */
public interface EstudianteService {
    List<Estudiante> findAll();

    Estudiante save(Estudiante estudiante);

    void deleteById(Integer id);

    List<Estudiante> findByCodigoEstudiante(String codigoEstudiante);
}

