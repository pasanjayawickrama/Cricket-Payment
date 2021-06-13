package com.dea.cricketpayment.model;

import javax.persistence.*;

@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salary_id")
    private int salary_id;

    @Column(name = "category")
    private String category;

    @Column(name = "tier")
    private String tier;

    @Column(name = "wage")
    private int wage;

    public Salary() {

    }

    public int getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(int id) {
        this.salary_id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public Salary(String category, String tier, int wage) {
        this.category = category;
        this.tier = tier;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + salary_id +
                ", category='" + category + '\'' +
                ", tier='" + tier + '\'' +
                ", wage=" + wage +
                '}';
    }
}
