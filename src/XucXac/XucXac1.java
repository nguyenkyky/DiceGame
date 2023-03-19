package XucXac;

import util.Utils;
import XucXac.*;

import java.util.ArrayList;
import java.util.List;

public class XucXac1 implements XucXac {
    private List<Integer> a = new ArrayList<>();
    public XucXac1 () {
        for (int i = 1 ; i <= 16 ; i++) {
            a.add(2);
            a.add(3);
            a.add(4);
            a.add(5);
            a.add(6);
        }
        for (int i = 1 ; i<= 20 ; i++) {
            a.add(1);
        }
    }



    @Override
    public int getResult() {
        return Utils.getRandomElement(a);
    }
}
