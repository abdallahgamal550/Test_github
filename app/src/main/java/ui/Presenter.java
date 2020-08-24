package ui;

import pojo.Model;

public class Presenter {

    private Contract contract;

    public Presenter(Contract contract) {
        this.contract = contract;
    }

    public Model setData() {
        return new Model("Abdallah");
    }

    public void getData() {
        contract.onGetSucess(setData().getName());
    }
}
