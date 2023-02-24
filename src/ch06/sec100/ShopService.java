package ch06.sec100;

public class ShopService {
    private static ShopService singleton = new ShopService();

    private ShopService(){
    }

    public static ShopService getInstance(){
        return singleton;
    }

}
