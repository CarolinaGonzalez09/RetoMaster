package co.com.test.models;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataThirdStep {


    private String oSComputer;
    private String versionOSComputer;
    private String languageOSComputer;
    private String brandMobile;
    private String modelMobile;
    private String oSMobile;

    public String getoSComputer() {
        return oSComputer;
    }

    public void setoSComputer(String oSComputer) {
        this.oSComputer = oSComputer;
    }

    public String getVersionOSComputer() {
        return versionOSComputer;
    }

    public void setVersionOSComputer(String versionOSComputer) {
        this.versionOSComputer = versionOSComputer;
    }

    public String getLanguageOSComputer() {
        return languageOSComputer;
    }

    public void setLanguageOSComputer(String languageOSComputer) {
        this.languageOSComputer = languageOSComputer;
    }

    public String getBrandMobile() {
        return brandMobile;
    }

    public void setBrandMobile(String brandMobile) {
        this.brandMobile = brandMobile;
    }

    public String getModelMobile() {
        return modelMobile;
    }

    public void setModelMobile(String modelMobile) {
        this.modelMobile = modelMobile;
    }

    public String getoSMobile() {
        return oSMobile;
    }

    public void setoSMobile(String oSMobile) {
        this.oSMobile = oSMobile;
    }

    public static List<DataThirdStep> setData(DataTable dataTable) {
        List<DataThirdStep> data = new ArrayList<>();
        List<Map<String, String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map : mapIfo) {
            data.add(new ObjectMapper().convertValue(map, DataThirdStep.class));
        }
        return data;
    }
}
