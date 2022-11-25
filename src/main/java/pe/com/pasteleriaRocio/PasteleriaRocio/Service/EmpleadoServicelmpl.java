package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.EmpleadoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.EmpleadoRepository;

/**
 *
 * @author Dante
 */
@Service
public class EmpleadoServicelmpl implements EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Override
    public List<EmpleadoEntity> findAll(){
        return empleadoRepository.findAll();
    }
    
    @Override
    public List<EmpleadoEntity> findAllCustom(){
        return empleadoRepository.findAllCustom();
    }
    
    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return empleadoRepository.findById(id);
    }
    
    @Override
    public EmpleadoEntity add(EmpleadoEntity a) {
        return empleadoRepository.save(a);
    }
    
    @Override
    public EmpleadoEntity update(EmpleadoEntity a) {
        EmpleadoEntity objEmp=empleadoRepository.getById(a.getCodigoemp());
        BeanUtils.copyProperties(a, objEmp);
        return empleadoRepository.save(objEmp);
    }
    
    @Override
    public EmpleadoEntity delete(EmpleadoEntity a) {
        EmpleadoEntity objEmp=empleadoRepository.getById(a.getCodigoemp());
        objEmp.setEstadoemp(false);
        return empleadoRepository.save(objEmp);
    }
}
