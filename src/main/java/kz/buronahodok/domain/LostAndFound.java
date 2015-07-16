package kz.buronahodok.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class LostAndFound {
	
	/**
	 */
	private String formId;
	
	/**
     */
    @NotNull
    private String formType;

    /**
     */
    @NotNull
    private String city;

    /**
     */
    @NotNull
    private String lostCategory;

    /**
     */
    @NotNull
    private String lostSubCategory;

    /**
     */
    @NotNull
    private String name;

    /**
     */
    @NotNull
    private String surname;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date lostDate;

    /**
     */
    @NotNull
    private String lostAddress;

    /**
     */
    @NotNull
    private String description;

    /**
     */
    @NotNull
    private String declarantName;

    /**
     */
    @NotNull
    private String declarantPhone;

    /**
     */
    @NotNull
    private String declarantEmail;
}
