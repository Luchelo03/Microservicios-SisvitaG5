package sm.dsw.ms.estudiante.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabrizio
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "person")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name", length = 255)
    private String firstName;

    @Column(name = "last_name", length = 255)
    private String lastName;

    @Column(name = "role", length = 50)
    private String role;

    @Column(name = "user_id")
    private Integer userId;

    //nuevo
    @Column(name = "cell_phone", length = 9)
    private String cellPhone;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Departamento department;

    @ManyToOne
    @JoinColumn(name = "province_id", referencedColumnName = "id")
    private Provincia province;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "id")
    private Distrito district;

    // Constructores (vacío y con parámetros)
    public Persona() {
    }

    public Persona(String firstName, String lastName, String role, Integer userId, String cellPhone, Departamento department, Provincia province, Distrito district) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.userId = userId;
        this.cellPhone = cellPhone;
        this.department = department;
        this.province = province;
        this.district = district;
    }

    // Getters y setters
    // id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // userId
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    // cellPhone
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    // department
    public Departamento getDepartment() {
        return department;
    }

    public void setDepartment(Departamento department) {
        this.department = department;
    }

    // province
    public Provincia getProvince() {
        return province;
    }

    public void setProvince(Provincia province) {
        this.province = province;
    }

    // district
    public Distrito getDistrict() {
        return district;
    }

    public void setDistrict(Distrito district) {
        this.district = district;
    }
}