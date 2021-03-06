package com.ffrago.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class ExpenseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=2, max=200, message="Expense name must be at least 2 character.")
    private String name;
    
    @NotBlank
    @Size(min=2, max=200, message="Vendor must be at least 2 character.")
    private String vendor;
    
    @NotNull (message="Must not be blank")
    @Min(value=0, message= "Amount must be more than a zero value.")
    private Float amount;
    
    @NotBlank
    @Size(min=2, max=200, message="Expense description must be at least 2 character.")
    private String description;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
  
    public ExpenseModel() {
    }
    
    public ExpenseModel(@NotBlank String name, @NotBlank String vendor, @NotNull @Min(0) Float amount, @NotBlank String description) 	{
    	this.name = name;
    	this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}
    
    //Getters and Setters

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	    
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
