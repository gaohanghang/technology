package com.example.demo.pojo;

import java.util.List;

/**
 * Created by GaoHangHang 2018-05-09 16:50
 **/
public class Link {
    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Link [address=" + address + "]";
    }
}
