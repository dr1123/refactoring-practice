package practice02;

/**
 * @author dingrui
 * @version V1.0
 * @className: African
 * @description:
 * @date 2020/5/21 15:23
 */
public class African extends Bird {

    @Override
    public double getSpeed() {
        return getBaseSpeed() * factor;
    }

}
