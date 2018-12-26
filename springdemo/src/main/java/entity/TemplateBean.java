package entity;

import org.springframework.stereotype.Component;

/**
 * @Auther: cpb
 * @Date: 2018/12/26 10:23
 * @Description:
 */
@Component
public class TemplateBean {
    private String name;
    private Integer id;

    public TemplateBean(Integer id, String name ) {
        super();
        this.name = name;
        this.id = id;
    }
    public TemplateBean(){

    }

    public void init() throws Exception {
        System.out.println("Init method after properties are set  " );
    }

    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
    private int integerProperty;
    private ExampleBean exampleBean;

    public ExampleBean getExampleBean() {
        return exampleBean;
    }

    public void setExampleBean(ExampleBean exampleBean) {
        this.exampleBean = exampleBean;
    }

    public int getIntegerProperty() {
        return integerProperty;
    }

    public void setIntegerProperty(int integerProperty) {
        this.integerProperty = integerProperty;
    }
}
