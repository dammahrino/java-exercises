package com.dammah;

public class IPDefanging {
    public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }
}
