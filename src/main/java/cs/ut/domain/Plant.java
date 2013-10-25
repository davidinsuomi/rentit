package cs.ut.domain;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@XmlRootElement(name = "plant")
public class Plant {

    /**
     */
    @NotNull
    private String name;

    /**
     */
    @NotNull
    private String description;

    /**
     */
    @NotNull
    private BigDecimal pricePerDay;
}
