
package pe.com.pasteleriaRocio.PasteleriaRocio.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity(name = "ClienteEntity")
@Table(name = "cliente")

public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeclient;

    @Column(name = "nombrecli")
    private String nameclient;

    @Column(name = "apellidocli")
    private String lastnameclient;

    @Column(name = "dnicli")
    private String dniclient;

    @Column(name = "telefonocli")
    private String phoneclient;

    @Column(name = "estcli")
    private boolean estadoc;
}