package com.talzoo.service;

import java.util.List;
import java.util.Scanner;

import com.talzoo.db.SakilaDao;
import com.talzoo.model.Store;

public class StoresByTitle implements DbTask {
    private Scanner scanner;

    public StoresByTitle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        System.out.print("Input title: ");
        String title = scanner.nextLine();
        SakilaDao sakila = SakilaDao.INSTANCE;

        List<Store> stores = sakila.getStoresByTitle(title);

        if (stores.size() == 0) {
            System.out.println("No data found");
        } else {
            for (Store store : stores) {
                System.out.printf("%s    %30d     %15s       %5s        %15s       %15d\n",
                        store.getTitle(), store.getStoreId(), store.getFirstName(), store.getLastName(),
                        store.getAddress(), store.getStock());
            }
        }

        scanner.nextLine();
    }

}
