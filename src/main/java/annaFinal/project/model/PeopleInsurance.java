/**
 * created by Anna
 * Date:16/12/2023
 * Time:16:23
 * ProjectName:project
 **/

package annaFinal.project.model;

import jakarta.persistence.*;

@Entity
public class PeopleInsurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "insurance")
    private String insurance;
    @Column(name = "numberOfPeople")
    private  int numberOfPeople;

    @Column(name = "headOfFamilyId")
    private  int numberOfHead;
    private  String phone;

    public PeopleInsurance(int id) {
        this.id = id;
    }

    public PeopleInsurance() {
    }

    public PeopleInsurance(int id, String name, String insurance, int numberOfPeople, int numberOfHead, String phone) {
        this.id = id;
        this.name = name;
        this.insurance = insurance;
        this.numberOfPeople = numberOfPeople;
        this.numberOfHead = numberOfHead;
        this.phone = phone;
    }

    public int getIdNumber() {
        return numberOfHead;
    }

    public void setIdNumber(int idNumber) {
        this.numberOfHead = numberOfHead;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
