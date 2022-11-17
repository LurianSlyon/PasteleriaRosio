/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.CategoriaEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.CategoriaRepository;

/**
 *
 * @author Lurian
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public CategoriaEntity add(CategoriaEntity a) {
        return categoriaRepository.save(a);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity a) {
        CategoriaEntity objCate=categoriaRepository.getById(a.getCodigoc());
        BeanUtils.copyProperties(a, objCate);
        return categoriaRepository.save(objCate);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity a) {
        CategoriaEntity objCate=categoriaRepository.getById(a.getCodigoc());
        objCate.setEstadoc(false);
        return categoriaRepository.save(objCate);
    }
}