package main.java.chapter_12;

/**
 * @author GaoHangHang
 * @date 2018/08/26 21:50
 **/
public class Example2 {

    static class Address {
        String countryName;
        String provinceName;
        String cityName;
        String areaName;

        public Address(String countryName, String provinceName, String cityName, String areaName) {
            this.countryName = countryName;
            this.provinceName = provinceName;
            this.cityName = cityName;
            this.areaName = areaName;
        }
    }

    // 上海 - 浦东
    public String part1(Address address) {
        String place = address.cityName;
        if (place == null) {
            place = address.provinceName;
        }
        if (place == null && "中国".equals(address.countryName)) {
            place = address.countryName;
        }
        if (place == null) {
            place = "未知城市";
        }
        if (address.areaName != null) {
            place += " - " + address.areaName;
        } else {
            place += " - 无人区 ";
        }
        return place;
    }

    // 上海 - 浦东
    public String part2(Address address) {
        String countryName = address.countryName;
        return null;
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        String place = example2.part1(
                new Address("中国", "浦东", "上海", "徐汇区")
        );

        place = example2.part1(
                new Address("中国", "山西省", null, "迎泽区")
        );

        System.out.println(place);
    }
}
