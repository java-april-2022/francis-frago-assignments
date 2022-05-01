package com.ffrago.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
<<<<<<< HEAD
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
=======
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class ExpenseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD

    @NotBlank
    (message="Expense name must be at least 2 character.")
    private String name;
    
    @NotBlank
    (message="Vendor must be at least 2 character.")
    private String vendor;
    
    @NotNull
    (message="Must not be blank")
    private Float amount;
    
    @NotBlank
    (message="Expense description must be at least 5 character.")
    private String description;

=======
    
    @NotNull
    @Size(min = 1, message="Expenses must be at least 1 character.")
    private String expDescription;
    
    @NotNull
    @Size(min = 1, message="Vendor must be at least 1 character.")
    private String vendor;
    
    @NotNull(message="Must not be blank")
    @Min(value=1, message = "Must be at least 1 dollar")
    private Double amount;
    
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
<<<<<<< HEAD

    public ExpenseModel() {
    }
    
    public ExpenseModel(String name, String vendor, Float amount, String description) 	{
    	this.name = name;
    	this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}
    
    //Getters and Setters
=======
    public ExpenseModel() {
    }
    
    public ExpenseModel(String expDescription, String vendor, Double amount) 	{
		this.expDescription = expDescription;
		this.vendor = vendor;
		this.amount = amount;
	}
    
    //getters and setters

>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

<<<<<<< HEAD
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
=======
	public String getExpDescription() {
		return expDescription;
	}
	public void setExpDescription(String expDescription) {
		this.expDescription = expDescription;
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

<<<<<<< HEAD
	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
=======
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
		this.amount = amount;
	}
	    
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
<<<<<<< HEAD
=======

	// right before it's created, save the date
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
}
