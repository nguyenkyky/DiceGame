package referee;

import Player.*;
import util.*;
import XucXac.*;

import java.util.List;
import java.util.Scanner;

public class Referee {
    public int pickFromXucXac(List<XucXac> xucXacs) {
        int i = (int) (Math.random() * xucXacs.size());
        return xucXacs.get(i).getResult();
    }

    public Player choosePlayer(List<Player> players) {
        System.out.println("Trong tai chon nguoi choi tiep theo: ");
        int i = 1 ;
        for(Player player :players) {
            System.out.println(player.getName() + " --- " + i);
            i++;
        }
        Scanner sc = Utils.getScanner();
        int res = 0 ;
        while (res < 1 || res > 4) {
            System.out.println("Chon so thu tu nguoi choi tiep theo: ");
            res = sc.nextInt();
            sc.nextLine();
        }
        return players.get(res-1);
    }
}
