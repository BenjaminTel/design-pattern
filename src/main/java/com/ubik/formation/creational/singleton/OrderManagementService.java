package com.ubik.formation.creational.singleton;

public class OrderManagementService {
    private static OrderManagementService instance = new OrderManagementService();

    private OrderManagementService() {}

    public static OrderManagementService getInstance() {
        if (instance == null) {
            instance = new OrderManagementService();
        }
        return instance;
    }
}
