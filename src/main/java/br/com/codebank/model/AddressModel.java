package br.com.codebank.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class AddressModel {

    private String  logger;
    private String district;
    private String city;
    private int num;
    private String cep;

    public AddressModel(String logger, String district, String city, int num, String cep) {
        this.logger = logger;
        this.district = district;
        this.city = city;
        this.num = num;
        this.cep = cep;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        if (logger.isBlank()){
            System.out.println("Endereço é um campo obrigatório");
        }else {
            this.logger = logger;
        }
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        if (district.isBlank()){
            System.out.println("Bairro é um campo obrigatório");
        }else {
            this.district = district;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city.isBlank()){
            System.out.println("Cidade é um campo obrigatório");
        }else {
            this.city = city;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num <= 0){
            System.out.println("Número da residência é um campo obrigatório");
        }else {
            this.num = num;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep.isBlank()){
            System.out.println("CEP é um campo obrigatório");
        }else {
            this.cep = cep;
        }
    }
}
