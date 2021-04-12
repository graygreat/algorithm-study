package etc.objectOriented.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    public List<MenuItem> basicMenuItem() {
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem menu1 = new MenuItem("menu1", 10000);
        MenuItem menu2 = new MenuItem("menu2", 20000);
        MenuItem menu3 = new MenuItem("menu3", 30000);
        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);

        return menuItems;
    }

    @Test
    public void 메뉴_생성_테스트() throws Exception {
        //given
        List<MenuItem> menuItems = basicMenuItem();

        //when
        Menu menu = new Menu(menuItems);
        MenuItem item = menu.choose("menu1");

        //then
        Assertions.assertEquals(menuItems.get(0).getName(), item.getName());
    }

    @Test
    public void 커피_생성_테스트() throws Exception {
        //given
        List<MenuItem> menuItems = basicMenuItem();

        //when
        Customer customer = new Customer();
        Menu menu = new Menu(menuItems);
        Barista barista = new Barista();
        Coffee coffee = customer.order("menu2", menu, barista);

        //then
        Assertions.assertEquals(menuItems.get(1).getName(), coffee.getName());

    }
}