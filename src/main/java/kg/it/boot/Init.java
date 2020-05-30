package kg.it.boot;

import kg.it.entity.*;
import kg.it.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Init implements CommandLineRunner {
    @Autowired
    private FoodsService foodsService;
    @Autowired
    private CustomersService customerService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private DeliveryMansService deliveryManService;
    @Autowired
    private OrderBlogService orderBlogService;
    @Autowired
    private ListService listService;



    @Override
    public void run(String... args) throws Exception {
        foodsService.create(new Foods("Чизбургер","FastFood","burger.jpg","KFC",179,"structure"));
        foodsService.create(new Foods("Баскет","FastFood","bucket.jpg","KFC",379,"structure"));
        foodsService.create(new Foods("Стрипсы","FastFood",".jpg","KFC",269,"structure"));
        foodsService.create(new Foods("Крылышки","FastFood","burger.jpg","KFC",499,"structure"));
        foodsService.create(new Foods("Ножки","FastFood","burger.jpg","KFC",549,"structure"));

        for (int i = 0; i <5 ; i++) {
            foodsService.create(new Foods("pizza"+i,"FastFood","pizza26"+i+".jpg","DodoPizza",400+i*5,"structure"));
        }
        for (int i = 0; i <6 ; i++) {
            foodsService.create(new Foods("Cake-"+i,"Sweets","cake98"+i+".jpg","Куликовский",380+i*15,"structure"));
        }
        for (int i = 0; i <4 ; i++) {
            foodsService.create(new Foods("Sushi-Set"+i,"SeaFood","sushi45"+i+".jpg","SushiMaster",420+i*10,"structure"));
        }
//***************************
        for (int i = 0; i <10 ; i++) {
            customerService.create(new Customers("login"+i,"565"+i,077+i+67656+i,50+i*15));
        }
//**********************
        for (int i = 0; i <8 ; i++) {
            deliveryManService.create(new DeliveryMans("Name"+i,"psw785"+i,070+i+29784+i));
        }
//***********************
        Random rn = new Random();
        int a = rn.nextInt(90);
        for (int i = 0; i < 7; i++) {
            addressService.create(new Address("Bishkek", "Street"+i, a, a, a));
        }
        for (int i = 7; i < 9; i++) {
            addressService.create(new Address("Kant", "Street"+i, a, a, a));
        }
        for (int i = 9; i < 10; i++) {
            addressService.create(new Address("Tokmak", "Street"+i, a, a, a));
        }
//*************************


    }
}
