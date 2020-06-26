package EntityFactory;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "equipment" )
public class Equipment {

    private String producer;
    private String model;
    private String serial;
    private String isWorking;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    public Long getId() {
        return id;
    }

    public Equipment() {
        // this form used by Hibernate
    }

    public Equipment(String producer, String model, String serial, String isWorking) {
        this.producer = producer;
        this.model = model;
        this.serial = serial;
        this.isWorking = isWorking;
    }
}