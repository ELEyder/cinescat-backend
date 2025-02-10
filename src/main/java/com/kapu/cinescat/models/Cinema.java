package com.kapu.cinescat.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cinemas")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "El nombre del cine es obligatorio.")
    @Size(max = 50, message = "El nombre no puede exceder 50 caracteres.")
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @NotBlank(message = "La dirección es obligatoria.")
    @Size(max = 250, message = "La dirección no puede exceder 250 caracteres.")
    @Column(name = "address", length = 250, nullable = false)
    private String address;

    @NotBlank(message = "La ciudad es obligatoria.")
    @Size(max = 50, message = "La ciudad no puede exceder 50 caracteres.")
    @Column(name = "city", length = 50, nullable = false)
    private String city;

    @NotBlank(message = "El teléfono es obligatorio.")
    @Size(max = 50, message = "El número de teléfono no puede exceder 50 caracteres.")
    @Column(name = "phone", length = 50, nullable = false)
    private String phone;

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
