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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ProductoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.ProductoRepository;

/**
 *
 * @author Lurian
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return productoRepository.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity a) {
        return productoRepository.save(a);
    }

    @Override
    public ProductoEntity update(ProductoEntity a) {
        ProductoEntity objPro=productoRepository.getById(a.getCodigop());
        BeanUtils.copyProperties(a, objPro);
        return productoRepository.save(objPro);
    }

    @Override
    public ProductoEntity delete(ProductoEntity a) {
        ProductoEntity objPro=productoRepository.getById(a.getCodigop());
        objPro.setEstadop(false);
        return productoRepository.save(objPro);
    }
}
