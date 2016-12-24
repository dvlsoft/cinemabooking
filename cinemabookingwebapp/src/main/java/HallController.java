import com.cinema.entity.Hall;
import com.cinema.entity.Row;
import com.cinema.entity.Seat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by taras on 24.12.16.
 */
@RestController
public class HallController {

    private Hall myHall;

    @PostConstruct
    private void initHall() {
        Seat seat1 = new Seat('1', 2000);
        Seat seat2 = new Seat(2, 3000);
        Seat seat3 = new Seat(3, 3300);
        Seat seat4 = new Seat(4, 3400);
        Seat seat5 = new Seat(5, 8000);

        Seat seat11 = new Seat('1', 1000);
        Seat seat12 = new Seat(2, 200);
        Seat seat13 = new Seat(3, 5300);
        Seat seat14 = new Seat(4, 6400);
        Seat seat15 = new Seat(5, 7000);

        ArrayList<Seat> list1  = new ArrayList<>();
        list1.add(seat1);
        list1.add(seat2);
        list1.add(seat3);
        list1.add(seat4);
        list1.add(seat5);
        Row row1 = new Row(list1);

        ArrayList<Seat> list2  = new ArrayList<>();
        list1.add(seat11);
        list1.add(seat12);
        list1.add(seat13);
        list1.add(seat14);
        list1.add(seat15);
        Row row2 = new Row(list2);
        ArrayList<Row> rows =new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        myHall = new Hall("Желтый", rows);
    }

    @RequestMapping(method = GET, value = "/hall")
    public Hall getHall() {
        return myHall;
    }


}
