package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceFilter {

    public static Boolean compareString(String compare, String atributeLsit){
        return (compare.isEmpty()) ? Boolean.TRUE : compare.equalsIgnoreCase(atributeLsit);
    }

    public ServiceFilter() {
    }

    private List<ModelFilter> mockFullList(){
        List<ModelFilter> modelFilterList = new ArrayList<>();

        modelFilterList.add(new ModelFilter("", "code5", "product5"));
        modelFilterList.add(new ModelFilter("area2", "code1", "product1"));
        modelFilterList.add(new ModelFilter("area1", "code2", ""));
        modelFilterList.add(new ModelFilter("area2", "code3", "product1"));
        modelFilterList.add(new ModelFilter("", "code3", ""));
        return  modelFilterList;
    }
    public List<ModelFilter> filter(ModelFilter compareObj){
        return mockFullList().stream().filter(
                modelFilter ->
                        compareString(compareObj.getArea(),modelFilter.getArea())
                        && compareString(compareObj.getCode(), modelFilter.getCode())
                        && compareString(compareObj.getProduct(), modelFilter.getProduct())

        ).collect(Collectors.toList());
    }
}
