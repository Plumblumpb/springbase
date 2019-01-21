package service.Impl;

import org.springframework.stereotype.Service;
import service.FoodService;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:10
 * @Description:
 */
public class FoodServiceImpl implements FoodService {

    public void makeNoodle(String noodle) {
        System.out.println("make "+noodle);
    }

    public void makeChicken() {
        System.out.println("make Chicken");
    }

    public String makeFish(String fish) {
        return fish;
    }
}
