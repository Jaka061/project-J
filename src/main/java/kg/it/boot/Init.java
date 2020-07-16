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
    @Autowired
    private CafeService cafeService;
    @Autowired
    private ContactsService contactsService;


    @Override
    public void run(String... args) throws Exception {

        Contacts contact1 = contactsService.create(new Contacts("0770260804", "website.cafe", "email2@gmail.com", "address1"));
        Contacts contact2 = contactsService.create(new Contacts("077260804", "website.cafe", "email3@gmail.com", "address2"));
        Contacts contact3 = contactsService.create(new Contacts("0775226089", "website.cafe", "email4@gmail.com", "address3"));
        Contacts contact4 = contactsService.create(new Contacts("0773260804", "website.cafe", "email5@gmail.com", "address4"));
//***********************CAFE

        Cafe cafe1 = new Cafe("Dodoizza", "D7898", contact1);
        cafeService.create(cafe1);
        Cafe cafe2 = new Cafe("KFC", "K7898", contact2);
        cafeService.create(cafe2);
        Cafe cafe3 = new Cafe("SushiMaster", "D7898", contact1);
        cafeService.create(cafe3);
        Cafe cafe4 = new Cafe("Куликовский", "T8989", contact4);
        cafeService.create(cafe4);

////**************************Food
        foodsService.create(new Foods("Чизбургер", cafe2, "FastFood", "burger.jpg", 179, "structure"));
        foodsService.create(new Foods("Баскет", cafe2, "FastFood", "bucket.jpg", 379, "structure"));
        foodsService.create(new Foods("Стрипсы", cafe2, "FastFood", ".jpg", 269, "structure"));
        foodsService.create(new Foods("Крылышки", cafe2, "FastFood", "burger.jpg", 499, "structure"));
        foodsService.create(new Foods("Ножки", cafe2, "FastFood", "burger.jpg", 549, "structure"));

        for (int i = 0; i < 5; i++) {
            foodsService.create(new Foods("pizza" + i, cafe1, "FastFood", "pizza26" + i + ".jpg", 400 + i * 5, "Сыр,Колбаса,Соус"));
        }
        for (int i = 0; i < 6; i++) {
            foodsService.create(new Foods("Cake-" + i, cafe4, "Sweets", "cake98" + i + ".jpg", 380 + i * 15, "Творог,ягоды,сливки"));
        }
        for (int i = 0; i < 4; i++) {
            foodsService.create(new Foods("Sushi-Set" + i, cafe3, "SeaFood", "sushi45" + i + ".jpg", 420 + i * 10, "Форель,рис,огурцы,соус"));
        }
////***************************Customer

        Customers customers1 = new Customers("login1", "cs5165", "0771676567",  715);customerService.create(customers1);
        Customers customers2 = new Customers("login2", "cs1765", "0770676567",  870);customerService.create(customers2);
        Customers customers3 = new Customers("login3", "cs9867", "0701645967",  570);customerService.create(customers3);
        Customers customers4 = new Customers("login4", "cs3465", "0551674427",  960);customerService.create(customers4);
        Customers customers5 = new Customers("login5", "cs2784", "0771687964",  450);customerService.create(customers5);

////**********************DeliveryMan

        DeliveryMans deliveryMans1 = new DeliveryMans("Name1", "psw785", "0704729784");deliveryManService.create(deliveryMans1);
        DeliveryMans deliveryMans2 = new DeliveryMans("Name2", "psw519", "077291784");deliveryManService.create(deliveryMans2);
        DeliveryMans deliveryMans3 = new DeliveryMans("Name3", "psw275", "0554729684");deliveryManService.create(deliveryMans3);
        DeliveryMans deliveryMans4 = new DeliveryMans("Name4", "psw146", "0559297824");deliveryManService.create(deliveryMans4);
        DeliveryMans deliveryMans5 = new DeliveryMans("Name5", "psw964", "0707259794");deliveryManService.create(deliveryMans5);


////***********************Address

        Address address1 = new Address("Жалал-Абад", "Street1",42, 1,   4);addressService.create(address1);
        Address address2 = new Address("Барпы", "Street2" ,  12, 1,  2);addressService.create(address2);
        Address address3 = new Address("Базар-Коргон", "Street3", 23, 2, 6);addressService.create(address3);


//*************************OrderBlog
        OrderBlog orderBlog1 = new OrderBlog("login1","0501976547",address1,"13.05.20 12:40:15","balance.kg",400);
        OrderBlog orderBlog2 = new OrderBlog("login1","0551676964",address2,"13.05.20 12:40:15","MegaPay",700);
        OrderBlog orderBlog3 = new OrderBlog("login1","0701514568",address3,"13.05.20 12:40:15","Элсом",480);
        OrderBlog orderBlog4 = new OrderBlog("login1","0771326569",address2,"13.05.20 12:40:15","balance.kg",570);

        orderBlogService.create(orderBlog1);orderBlogService.create(orderBlog2);
        orderBlogService.create(orderBlog3);orderBlogService.create(orderBlog4);

//*************************List

        listService.create(new Lists(customers1,orderBlog1,cafe1,deliveryMans1));
        listService.create(new Lists(customers2,orderBlog2,cafe2,deliveryMans2));
        listService.create(new Lists(customers3,orderBlog3,cafe3,deliveryMans3));
        listService.create(new Lists(customers4,orderBlog4,cafe4,deliveryMans4));




    }
}
