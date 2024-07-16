package sm.dsw.ms.estudiante.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import sm.dsw.ms.estudiante.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    List<Estudiante> findByCodigoEstudiante(String codigoEstudiante);
}