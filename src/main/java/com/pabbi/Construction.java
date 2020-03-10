package com.pabbi;

public class Construction implements MaterialStandards{
    private String materialStandard;
    private Integer houseArea;
    private Boolean automation;

    Construction(String materialStandard, Integer houseArea) {
        this.materialStandard = materialStandard;
        this.houseArea = houseArea;
        this.automation = false;
    }

    Construction(String materialStandard, Integer houseArea, Boolean automation) {
        this.materialStandard = materialStandard;
        this.houseArea = houseArea;
        this.automation = automation;
    }

    Integer getConstructionCost() {
        switch (materialStandard){
            case "aboveStandard":
                return aboveStandardMaterials();
            case "highStandard":
                return highStandardMaterials();
            default:
                return standardMaterials();

        }
    }

    public Integer standardMaterials() {
        return 1200 * houseArea;
    }

    public Integer aboveStandardMaterials() {
        return 1500 * houseArea;
    }

    public Integer highStandardMaterials() {
        if (!automation)
            return 1800 * houseArea;
        return 2500;
    }
}
